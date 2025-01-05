package com.example.nzc.service;

import com.example.nzc.dao.ItemDao;
import com.example.nzc.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    @Autowired
    ItemDao itemDao;
    @Transactional
    @Modifying
    public Item add(Item item){
        return itemDao.save(item);

    }
    //通过商品名称查找商品信息
    public Item find(String name){
        return itemDao.findItemByName(name);
    }
    //通过商品id查找商品
    public Item getItemById(int id){return itemDao.getItemByItemId(id);}
    //通过商品名称更新商品状态
    public Integer updateState(String name){return itemDao.updateStateByName(name);}
    //
     public Item find(int id){return itemDao.findByItemId(id);}

   // public Optional<Item> getitemById(int itemId){return itemDao.findById(itemId);}

}
