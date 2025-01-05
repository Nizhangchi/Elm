package com.example.nzc.controller;

import com.example.nzc.dao.CustomerDao;
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
import java.util.Optional;

@RestController
@Tag(name = "顾客控制器")
@RequestMapping("/customer")
@Slf4j
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
    ShopService shopService;
    @Autowired
    ItemService itemService;
    @Autowired
    OrdersService ordersService;
    @Autowired
    CustomerDao customerDao;
    @Autowired
    LineItemService lineItemService;

//    @Operation(summary = "顾客登陆")
//    @PostMapping("/login")
//    public MsgResponse login(@RequestBody Customer customer, HttpSession session){
//        Customer cs = customerService.login(customer.getName(),customer.getPassword());
//        if (cs != null) {
//            // 登录成功，返回 Customer 对象和状态码 200 OK
//            session.setAttribute("customer", cs);
//            session.setAttribute("customerId", cs.getCustomerId());
//            return MsgResponse.success("登录成功", cs);
//        } else {
//            return MsgResponse.fail("密码错误");
//        }
//    }
@Operation(summary = "顾客登陆")
@PostMapping("/login")
public MsgResponse login(@RequestParam String name, @RequestParam String password, HttpSession session){
    Customer cs = customerService.login(name,password);
    if (cs != null) {
        // 登录成功，返回 Customer 对象和状态码 200 OK
        session.setAttribute("customer", cs);
        session.setAttribute("customerId", cs.getCustomerId());
        return MsgResponse.success("登录成功", cs);
    } else {
        return MsgResponse.fail("密码错误");
    }
}
//    @Operation(summary = "新增顾客")
//    @PostMapping("/add")
//    public MsgResponse add(@RequestParam String name,@RequestParam String password,HttpSession session){
//        int customer = customerService.addCustomer(name,password);
//
//        if (customer == 1) {
//            // 登录成功，返回 Customer 对象和状态码 200 OK
//            return MsgResponse.success("增添成功", customer);
//        } else {
//            return MsgResponse.fail("增添顾客失败");
//        }
//    }
    @Operation(summary = "顾客查看订单")
    @PostMapping("/getAllOrdersByCsId")
    public MsgResponse getAllOrdersByCsId(@RequestParam int id, HttpSession session){
        List<Orders> orders = customerService.getAllOrdersByCsId(id);
        if(orders != null){
            return MsgResponse.success("顾客查询订单成功",orders);
        }else {
            return MsgResponse.fail("顾客查询订单失败");
        }

    }
    @Operation(summary = "顾客选择订单")
    @GetMapping("/selectOrder")
    public MsgResponse selectOrder(@RequestParam("id") int id,HttpSession session){
        Orders orders = customerService.getByoId(id);

        if (orders != null) {

            session.setAttribute("orders",orders);
            return  MsgResponse.success("确定要支付吗？",orders);
    }else {
            return MsgResponse.fail("选择失败");
        }
    }

    @Operation(summary = "顾客查看订单详情，通过order_id")
    @PostMapping("/orderDetail")
    public MsgResponse orderDetail(@RequestParam int id,HttpSession session){
    List<LineItem> lineItem = lineItemService.find(id);
    List<Item> items = new ArrayList<>();
    for(LineItem lineItem1:lineItem) {
        int itemId = lineItem1.getItemId();
        Item item = itemService.find(itemId);
        session.setAttribute("amount",lineItem1.getAmount());
        if (item != null) {
            items.add(item);
        }
    }
        return MsgResponse.success("成功", items);

    }
    @Operation(summary = "顾客支付订单")
    @PatchMapping("/pay")
    public MsgResponse pay(@RequestParam int id, HttpSession session){
        Orders orders = customerService.getByoId(id);
        int count = ordersService.updatePay(id);
        if(count != 0){
            return MsgResponse.success("支付成功",orders);
        }else {
            return MsgResponse.fail("支付失败");}
    }
    @Operation(summary = "顾客逻辑取消未支付的订单")
    @PatchMapping("/logicDelete")
    public MsgResponse logicDelete(@RequestParam int id, HttpSession session){

        int count = customerService.deleteLogical(id);
        if(count != 0){
            return MsgResponse.success("顾客取消订单成功",null);
        }else {
            return MsgResponse.fail("顾客取消订单失败");
        }

    }
    //顾客选择商家
    @Operation(summary = "顾客选择门店")
    @GetMapping("/selectShop")
    public MsgResponse selectShop(@RequestParam int shopId,HttpSession session){
//        Optional<Shop> selectShop= shopService.findById(shopId);
        Optional<Shop> selectShop = shopService.findById(shopId);// 从某个地方获取Optional<Shop>
                Shop shop = selectShop.orElseThrow(() -> new RuntimeException("Shop not found"));
        if(shop != null){
            session.setAttribute("shop",shop);
            return MsgResponse.success("选择门店成功",shop);

        }else {
            return MsgResponse.fail("选择门店失败");
        }

    }

//    @Operation(summary = "创建订单")
//    @PostMapping("/createOrder")
//    public MsgResponse createOrder(@RequestParam int itemId,@RequestParam int amount,HttpSession session){
//        Shop shop = (Shop)session.getAttribute("shop");
//        Customer customer = (Customer) session.getAttribute("customer");
//        Optional<Item> item = itemService.getitemById(itemId);
//        if(item.isPresent()){
//            Item getItem = item.get();
//            Orders orders = new Orders();
//            orders.setCustomerId(customer.getCustomerId());
//            orders.setShopId(shop.getShopId());
//            orders.setState("未支付");
//            orders.setTolPrice(getItem.getPrice()*amount);
//            Orders newOrder = ordersService.add(orders);
//            return MsgResponse.success("创建订单成功",newOrder);
//
//        }else {
//            return MsgResponse.fail("创建订单失败");
//
//        }
//    }





}
