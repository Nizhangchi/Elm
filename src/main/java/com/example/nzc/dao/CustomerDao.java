package com.example.nzc.dao;


import com.example.nzc.entity.Customer;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

@Component
public interface CustomerDao extends JpaRepository<Customer,Integer> {
    @Modifying(clearAutomatically = true)
    @Transactional
    @Query(value = "update customer set  password = ?  where customer_id = ?",nativeQuery = true)
    Integer updatePsd(String password,int customer_id);//返回更改了几行
    @Modifying
    @Transactional
    @Query(value = "insert into customer (name, password) values (?, ?)", nativeQuery = true)
    Customer addCustomer(String name, String password);
    Customer findCustomerByNameAndPassword(String name, String password);


    @Modifying
    @Transactional
    @Query(value = "delete from orders where is_pay = '未支付'", nativeQuery = true)
    Integer deleteUnpaidOrders();



}
