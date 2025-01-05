package com.example.nzc.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Orders extends AbstractDomainEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderId;
    private Integer customerId;
    private Integer shopId;
    private Double tolPrice;
    private Integer isDelete;
    private String state;
    public Orders() {
        // 设置默认状态为 "default"
        this.state = "未支付";
        this.isDelete = 0;
    }
}
