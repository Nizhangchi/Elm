package com.example.nzc.dao;

import com.example.nzc.entity.Item;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface ItemDao extends JpaRepository<Item,Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update item set is_delete = 1  where name = ?",nativeQuery = true)
    Integer updateStateByName(String name);//返回更改了几行
    Item findItemByName(String name);
    Item findByItemId(int id);

    @Query(value = "select * from item where item_id = ? ",nativeQuery = true)
    Item getItemByItemId(int itemId);

}
