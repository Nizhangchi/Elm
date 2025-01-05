package com.example.nzc.service;

import com.example.nzc.dao.*;
import com.example.nzc.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BusinessService implements UserFactory {
    @Autowired
    BusinessDao businessdao;
    @Autowired
    ShopDao shopDao;
    @Autowired
    OrdersDao ordersDao;
    @Autowired
    ItemDao itemDao;
    @Autowired
    ShopItemDao shopItemDao;

    @Transactional
    @Modifying
   // public Integer add(String name,String password){return businessdao.add(name,password);}
    public Business find(Integer id){return businessdao.findBusinessByBusinessId(id);
    }

    //查找
//    public String findById(int id) {
//        Optional<Business> byId = businessdao.findById(id);
//        String account = byId.get().getName();
//        return account;
//    }

    //商家创建门店
    public Shop saveShopByBusiness(Shop shop){
        return shopDao.save(shop);
    }

    //商家登陆
    public Business login(String name,String password){
        Business business = businessdao.login(name, password);
        if(business == null){
            return business;
        }else {
            return null;
        }
    }

    //商家新建商品
    public Item saveItem(Item item){
        return itemDao.save(item);
    }

    //商家上架商品
    public ShopItem saveShopItem(ShopItem shopItem){return shopItemDao.save(shopItem);}

    //商家查看自己门店的订单
    @Transactional
    public List<Orders> getOrdersByShopId(int shop_id){
        return ordersDao.getAllByShopId(shop_id);
    }
    @Transactional
    public int updatePaidOrder(String state,int id){
        return ordersDao.updatePayState(state,id);
    }

    @Transactional
    public Shop getShopByShopName(String name){return shopDao.getAllShopByName(name);}

    //商家取消已支付的订单
    public Integer deleteState(String state,int order_id){
        return ordersDao.updateDeletePaidState(order_id);
    }
    //通过shop_id和state查找orders
    public List<Orders> getOrsersByShopIdAndState(int shop_id){return  ordersDao.getOrdersByShopIdAndState(shop_id);}

    @Override
    public User createUser(Role role) {
        if (Role.BUSINESS.equals(role)) {
            return new Business();
        }
        throw new IllegalArgumentException("Unsupported role: " + role);
    }
    // public List<Orders> getOrdersByShopIdAndCustomerId(int shop_id,int customer_id){return ordersDao.getOrsersByShopIdAndCustomerId(shop_id,customer_id);}
//    @Transactional
//    public MsgResponse checkOrderState(int shop_id,int customer_id) {
//        try {
//            List<Orders> paidOrders = ordersDao.getOrsersByShopIdAndCustomerId(shop_id,customer_id);
//            // 修改订单状态为 "已确认"
//            for (Orders order : paidOrders) {
//                order.setState("已确认");
//
//                // 更新订单
//                ordersDao.save(order);
//
//            }
//            return MsgResponse.success("批量确认订单成功",ordersDao.getAllByShopId(shop_id));
//        }catch (Exception e) {
//        e.printStackTrace();
//        return MsgResponse.fail("批量确认订单失败");
//    }

 //}
//    @Transactional
//    public MsgResponse cancelOrderState(int shop_id,int customer_id) {
//        try {
//            List<Orders> paidOrders = ordersDao.getOrsersByShopIdAndCustomerId(shop_id,customer_id);
//            // 修改订单状态为 "已取消"
//            for (Orders order : paidOrders) {
//                order.setState("已取消");
//
//                // 更新订单
//                ordersDao.save(order);
//
//            }
//            return MsgResponse.success("批量删除订单成功", ordersDao.getAllByShopId(shop_id));
//        }catch (Exception e) {
//            e.printStackTrace();
//            return MsgResponse.fail("批量删除订单失败");
//        }
//
//    }

}
