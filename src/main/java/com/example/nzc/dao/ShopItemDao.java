package com.example.nzc.dao;

import com.example.nzc.entity.ShopItem;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ShopItemDao extends JpaRepository<ShopItem,Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update shop_item set  is_sale = ?  where shop_id = ?",nativeQuery = true)
    Integer update(int is_sale,int shop_id);//返回更改了几行
    @Query(value = "select * from shop_item where shop_id = ? ",nativeQuery = true)
    List<ShopItem> findByShopId(Integer shopId);



}
