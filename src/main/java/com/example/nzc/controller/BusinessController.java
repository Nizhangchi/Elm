package com.example.nzc.controller;

import com.example.nzc.entity.*;
import com.example.nzc.service.*;
import com.example.nzc.utils.MsgResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Tag(name = "商家控制器")
@RequestMapping("/business")
@Slf4j
public class BusinessController {

    @Autowired
    BusinessService bsSvc;
    @Autowired
    ShopService shopService;
    @Autowired
    ShopItemService shopItemService;
    @Autowired
    ItemService itemService;
    @Autowired
    OrdersService ordersService;


//登陆

    @Operation(summary = "商家登陆")
    @PostMapping("/login")
    public MsgResponse login(@RequestParam String name,@RequestParam String password,HttpSession session){

        Business bs = bsSvc.login(name,password);
        if (bs != null) {
            // 登录成功，返回 Business 对象和状态码 200 OK
            session.setAttribute("business", bs);
            session.setAttribute("businessId", bs.getBusinessId());
            return MsgResponse.success("登录成功", bs);
        } else {
            return MsgResponse.fail("密码错误");
        }
    }

    //查看商家所有门店
    @Operation(summary = "查看商家所有门店")
    @PostMapping("/getAllShop")

    public MsgResponse getAllShop(@RequestParam Integer id,HttpSession session){

        List<Shop> shops =shopService.getAllShop(id);
        session.setAttribute("shops",shops);
        for (Shop s : shops) {
            System.out.println(s);
        }
        if(shops != null){
            return MsgResponse.success("查询商家店铺成功",shops);
        }else {
            return MsgResponse.fail("查询商家店铺失败");
        }
    }

    //新增商家
//    @Operation(summary = "新增商家")
//    @PostMapping("/add")
//    public MsgResponse add(@RequestParam String name,@RequestParam String password,HttpSession session){
//
//        Integer newBusiness = bsSvc.add(name,password);
//        if (newBusiness == 1) {
//            // 登录成功，返回 Business 对象和状态码 200 OK
//            session.setAttribute("newbusiness", newBusiness);
//            return MsgResponse.success("增添商家成功",newBusiness );
//        } else {
//            return MsgResponse.fail("增添商家失败");
//        }
//    }
    @Operation(summary = "商家选择门店")
    @PostMapping("/getShopByName")
    public MsgResponse getShopByName(@RequestParam String name,HttpSession session){
        Shop selectShop = shopService.find(name);
        session.setAttribute("selectShop",selectShop);

        return  MsgResponse.success("查找门店成功",selectShop);
    }

//商家创建门店
    @Operation(summary = "商家创建门店")
    @PostMapping("/addShop")
    public MsgResponse addShop(@RequestBody Shop shop,HttpSession session){
//        int id = (int)session.getAttribute("businessId");
//        shop.setBusinessId(id);
        Shop newShop = bsSvc.saveShopByBusiness(shop);
        if (newShop != null) {
            // 登录成功，返回 Shop 对象和状态码 200 OK
            session.setAttribute("newShop", newShop);
            session.getAttribute("newShopId");
            return MsgResponse.success("增添门店成功", newShop);
        } else {
            return MsgResponse.fail("增添门店失败");
        }
    }

//商家新建商品
    @Operation(summary = "商家新建商品")
    @PostMapping("/addItem")
    public MsgResponse addItem(@RequestBody Item item,HttpSession session){
        Item newItem = bsSvc.saveItem(item);
        ShopItem shopItem = new ShopItem();
        shopItem.setIsSale(0);
        int shopId = (int)session.getAttribute("shopId");
        shopItem.setShopId(shopId);
        shopItem.setItemId(newItem.getItemId());
//        shopItem.getShopId(session.getAttribute("shopId"));
        shopItemService.add(shopItem);
        if (newItem != null) {
            // 登录成功，返回 Item 对象和状态码 200 OK
            session.setAttribute("newItem", newItem);
            session.getAttribute("newItemId");

            return MsgResponse.success("增添商品成功", newItem);
        } else {
            return MsgResponse.fail("增添商品失败");
        }
    }
//商家上架商品
    @Operation(summary = "商家上架商品")
    @PostMapping ("/updateItem")
    public MsgResponse updateItem(@RequestParam String name,HttpSession session){
        Item item = itemService.find(name);
        int count = itemService.updateState(name);
        if (count != 0){
            session.setAttribute("item",item);
            return MsgResponse.success("上架成功",item);
        }else {
            return MsgResponse.fail("上架失败");
        }
    }
//商家查看门店订单
    @Operation(summary = "商家查看门店订单")
    @PostMapping("/getOrderByName")
    public MsgResponse getOrderByName(@RequestParam String name,HttpSession session){
        Shop shop = bsSvc.getShopByShopName(name);
        List<Orders> orders = bsSvc.getOrdersByShopId(shop.getShopId());
        for (Orders orders1 :orders){
            System.out.println(orders1);
        }
        if(orders != null){
            return MsgResponse.success("查询门店订单成功",orders);
        }else {
            return MsgResponse.fail("查询门店商品失败");
        }

    }
    //商家通过orderId确认已支付的订单
    @Operation(summary = "商家通过orderId确认已支付的订单")
    @PatchMapping("/checkPaidOrder")
    public MsgResponse checkPaidOrder(@RequestParam String state,@RequestParam int id,HttpSession session){
        int count = bsSvc.updatePaidOrder(state,id);
        if(count != 0){
            return MsgResponse.success("修改成功",count);
        }else {
            return MsgResponse.fail("失败");
        }
    }
    //通过shopName查找shopid再去shopitem里找itemid，再去get item实体并输出
    @Operation(summary = "通过门店名找item")
    @PostMapping("/getItemByShopName")
    public MsgResponse getItemByShopName(@RequestParam String name,HttpSession session) {
        Shop shop = bsSvc.getShopByShopName(name);
        int shopId = shop.getShopId();
        session.setAttribute("shopId",shopId);
        List<ShopItem> shopItems = shopItemService.getShopItemsByShop(shopId);
        List<Item> items = new ArrayList<>();
        for (ShopItem shopItem : shopItems) {
            int itemId = shopItem.getItemId();

            // 根据 itemId 获取 Item 实体
            Item item= itemService.getItemById(itemId);
            if (item != null) {
                items.add(item);
            }
        }
        return MsgResponse.success("成功",items);


    }
    //    @Operation(summary = "商家选择商品")
//    @GetMapping("/selecetItemById/{name}")
//    public MsgResponse selectItem(@PathVariable String name,HttpSession session){
//        Item selectItem = itemService.find(name);
//        session.setAttribute("selectItem",selectItem);
//        return MsgResponse.success("成功选择商品",selectItem);
//    }

    //    @Operation(summary = "商家查看自己门店的商品")
//    @GetMapping("/getAllProductById/{id}")
//    public MsgResponse getAllProductById(@PathVariable Integer id,HttpSession session){
//        List<ShopItem> shopItems = shopItemService.getShopItemsByShop(id);
//        session.setAttribute("shopItems", shopItems);
//        // 输出到控制台
//        for (ShopItem shopItem : shopItems) {
//            System.out.println(shopItem);
//        }
//        if(shopItems != null){
//            return MsgResponse.success("查询门店商品成功",shopItems);
//        }else {
//            return MsgResponse.fail("查询门店商品失败");
//        }
//
//    }
//    @Operation(summary = "商家查看自己门店的订单")
//    @PostMapping("/getAllOrdersByShopId")
//    public MsgResponse getAllOrdersByShopId(@RequestParam int id){
//        List<Orders> orders = bsSvc.getOrdersByShopId(id);
//         for (Orders orders1 :orders){
//             System.out.println(orders1);
//         }
//        if(orders != null){
//            return MsgResponse.success("查询门店订单成功",orders);
//        }else {
//            return MsgResponse.fail("查询门店商品失败");
//        }
//
//    }
//    @Operation(summary = "商家通过shopId和state查找订单")
//    @GetMapping("/getOrsersByShopIdAndState")
//    public  MsgResponse getOrsersByShopIdAndState(HttpSession session){
//        Shop shop = (Shop) session.getAttribute("selectShop");
//        List<Orders> orders = bsSvc.getOrsersByShopIdAndState(shop.getShopId());
//        for (Orders orders1 :orders){
//            System.out.println(orders1);
//        }
//        if(orders != null){
//            return MsgResponse.success("查询门店已支付订单成功",orders);
//        }else {
//            return MsgResponse.fail("查询门店已支付商品失败");
//        }
//
//    }



//    @Operation(summary = "商家取消已支付的订单")
//    @PatchMapping("/cancelPaidOrder/{customerId}")
//    public  MsgResponse cancelPaidOrder(HttpSession session,@PathVariable("customerId") int customerId){
//        Shop shop = (Shop)session.getAttribute("selectShop");
//        int shopId = shop.getShopId();
//        return  bsSvc.cancelOrderState(shopId,customerId);
//    }






}