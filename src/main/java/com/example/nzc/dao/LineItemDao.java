package com.example.nzc.dao;

import com.example.nzc.entity.LineItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LineItemDao extends JpaRepository<LineItem,Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update line_item set tol_price = ?  where order_id = ?",nativeQuery = true)
    Integer updatePriceById(Double price,int id);//返回更改了几行
    //@Query(value = "select * from line_item where order_id=?",nativeQuery = true)
    List<LineItem> findLineItemByOrderId(int orderId);
}
