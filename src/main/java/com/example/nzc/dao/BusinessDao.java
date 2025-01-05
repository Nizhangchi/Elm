package com.example.nzc.dao;

import com.example.nzc.entity.Business;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface BusinessDao extends JpaRepository<Business,Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update business set  password = ?  where business_id = ?",nativeQuery = true)
    Integer updateOne(String password,int business_id);//返回更改了几行
    Business findBusinessByBusinessId(Integer id);
    Business findBusinessByNameAndPassword(String name,String password);
    //使用@Quey注解，拓展接口，新增查询方法
    @Query(value = "select * from business where name=? and password = ?",nativeQuery = true)
    Business login(String name, String password);
    @Modifying
    @Transactional
    @Query(value = "insert into business (name, password) values (?, ?)", nativeQuery = true)
    Business add(String name, String password);

//    Shop saveShopByBusiness();



}
