package com.example.nzc.service;

import com.example.nzc.dao.ShopItemDao;
import com.example.nzc.entity.ShopItem;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopItemService {
    @Autowired
    ShopItemDao shopItemDao;
    //增加门店商品
    @Transactional
    @Modifying
    public ShopItem add(ShopItem shopItem){
        return shopItemDao.save(shopItem);
    }
    //通过门店id查询门店所有商品
    public List<ShopItem> getShopItemsByShop(Integer shopId) {
        return shopItemDao.findByShopId(shopId);
    }


    //上架商品
//    public Integer update(){
//        return shopItemDao.update(1,1);
//    }

}
