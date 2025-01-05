package com.example.nzc.dao;

import com.example.nzc.entity.Shop;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ShopDao extends JpaRepository<Shop,Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update shop set name = ?  where shop_id = ?",nativeQuery = true)
    Integer updateNameById(String name,int id);//返回更改了几行
    @Query(value = "select * from shop where business_id = ?",nativeQuery = true)
    List<Shop> getAllShop(int businessId);
    @Query(value = "select * from shop where name = ?",nativeQuery = true)
    Shop getAllShopByName(String name);

}
