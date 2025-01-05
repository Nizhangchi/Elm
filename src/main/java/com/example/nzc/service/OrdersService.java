package com.example.nzc.service;

import com.example.nzc.dao.OrdersDao;
import com.example.nzc.entity.Orders;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    @Autowired
    OrdersDao ordersDao;
    //增加订单
    @Transactional
    @Modifying
    public Orders add(Orders order){
        return ordersDao.save(order);
    }
    //更新订单状态
    @Transactional
    @Modifying
    public int updatePay(int id){return ordersDao.updatePaidState(id);}


}
