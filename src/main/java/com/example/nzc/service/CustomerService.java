package com.example.nzc.service;

import com.example.nzc.dao.CustomerDao;
import com.example.nzc.dao.OrdersDao;
import com.example.nzc.entity.Customer;
import com.example.nzc.entity.Orders;
import com.example.nzc.entity.Role;
import com.example.nzc.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements UserFactory {
    @Autowired
    CustomerDao customerDao;
    @Autowired
    OrdersDao ordersDao;
    //增
    @Transactional
    @Modifying
    public Customer add(Customer customer){
        return customerDao.save(customer);

    }
    //顾客登陆
    public Customer login(String name,String psd){
        Customer customer = customerDao.findCustomerByNameAndPassword(name,psd);
        if(customer != null){
            return customer;
        }else {
            return null;
        }
    }
    //新增顾客
//    public Integer addCustomer(String name,String password){
//        return  customerDao.addCustomer(name,password);
//
//    }

    //顾客支付订单：
//    public Integer updatePayState(int order_id){
//        return ordersDao.updatePayState(order_id);
//    }
//    //顾客更改订单状态
//    public void update() {
//        //顾客先选择订单
//        Optional<Orders> orders = ordersDao.findById(4);
//        if (orders.isPresent()) {
//            Orders orders1 = orders.get();
//            //更改状态
//            int state = updatePayState( orders1.getOrderId());
//            if (state == 1) {
//                System.out.println("更新状态成功");
//            } else {
//                System.out.println("更新状态失败");
//            }
//        } else {
//            System.out.println("订单不存在");
//        }
//    }

    //获取自己的所有订单
    public List<Orders> getAllOrdersByCsId(int customerId){
        return ordersDao.getAllByCustomerId(customerId);
    }


    //顾客通过orderId选择订单
    public Orders getByoId(int orderId){return ordersDao.getOrdersByOrderId(orderId);}

    //删除未支付的订单（逻辑）
    public Integer deleteLogical(int orderId){
        return ordersDao.updateDeletePaidState(orderId);
}

    @Override
    public User createUser(Role role) {
        if (Role.CUSTOMER.equals(role)) {
            return new Customer();
        }
        throw new IllegalArgumentException("Unsupported role: " + role);
    }


//    public Optional<Orders> selectOrderById(int orderId){
//        return ordersDao.findById(orderId);
//    }
}
