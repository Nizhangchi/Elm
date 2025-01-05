package com.example.nzc.dao;

import com.example.nzc.entity.Orders;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OrdersDao extends JpaRepository<Orders,Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update orders set tol_price = ?  where order_id = ?",nativeQuery = true)
    Integer updatePriceById(Double price,int id);//返回更改了几行
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update orders set state = ? where order_id = ?",nativeQuery = true)
    Integer updatePayState(String state,int id);//返回更改了几行
    @Transactional
    @Query(value = "select * from orders where shop_id = ?",nativeQuery = true)
    List<Orders> getAllByShopId(int shop_id);
    @Transactional
    @Query(value = "select * from orders where order_id = ?",nativeQuery = true)
    Orders getOrdersByOrderId(int order_id);
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update orders set is_delete = 1 where order_id = ?",nativeQuery = true)
    Integer updatePaidState(int order_id);//返回更改了几行
    @Transactional
    @Query(value = "select * from orders where customer_id = ?",nativeQuery = true)
    List<Orders> getAllByCustomerId(int customer_id);
    @Transactional
    @Query(value = "select * from orders where shop_id = ? and state = '已支付'",nativeQuery = true)
    List<Orders> getOrdersByShopIdAndState(int shop_id);
    @Transactional
    @Query(value = "select * from orders where shop_id = ? and customer_id = ? and state = '已支付' ",nativeQuery = true)
    List<Orders> getOrsersByShopIdAndCustomerId(int shop_id,int customer_id);
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update orders set is_delete = 2 where order_id = ?",nativeQuery = true)
    Integer updateDeletePaidState(int order_id);//返回更改了几行
}
