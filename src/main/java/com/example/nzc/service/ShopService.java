package com.example.nzc.service;

import com.example.nzc.dao.ShopDao;
import com.example.nzc.entity.Shop;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShopService {
    @Autowired
    ShopDao shopDao;
    //增加门店
    @Transactional
    @Modifying
    public Shop add(Shop shop){
        return shopDao.save(shop);
    }
    //通过门店名称查询门店
    public Shop find(String name){return shopDao.getAllShopByName(name);}
    //通过商家id查找商家名下的所有门店
    public List<Shop> getAllShop(int businessId){return shopDao.getAllShop(businessId);}
    //通过门店id查询门店
    public Optional<Shop> findById(int id){
        return shopDao.findById(id);

    }
}
