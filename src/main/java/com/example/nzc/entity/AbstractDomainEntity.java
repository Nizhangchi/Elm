package com.example.nzc.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class AbstractDomainEntity implements Cloneable, Serializable {
    /**
     * 创建日期
     */
    @Schema(description = "实体创建时间")
    @CreatedDate
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    protected Date createdDate;
    /**
     * 最后更新日期 Timestamp
     */
    @Schema(description = "实体最后更新时间")
    @LastModifiedDate
    @JsonFormat(locale = "zh", timezone = "GMT+8", pattern = "yyyy-MM-dd")
    private Date lastModifiedDate;
    /**
     * 获取实体的id
     *
     * @return
     */
    public Object getEntityId() {
        return null;
    }

    /**
     * 克隆当前对象
     *
     * @return AbstractDomainEntity
     * @throws CloneNotSupportedException
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public AbstractDomainEntity(){
        Date date = new Date(System.currentTimeMillis());
        this.createdDate =date;
        this.lastModifiedDate =date;
    }
    private String userType;


}
