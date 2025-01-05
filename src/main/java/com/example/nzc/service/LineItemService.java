package com.example.nzc.service;

import com.example.nzc.dao.LineItemDao;
import com.example.nzc.entity.LineItem;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineItemService {
    @Autowired
    LineItemDao lineItemDao;
    @Transactional
    @Modifying
    //增加line_item
    public LineItem add(LineItem lineItem){
        return lineItemDao.save(lineItem);
    }
    //通过订单id查找line_item
    public List<LineItem> find(int id ){
        return lineItemDao.findLineItemByOrderId(id);
    }

}
