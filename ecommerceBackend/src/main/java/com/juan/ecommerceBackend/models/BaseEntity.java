package com.juan.ecommerceBackend.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id", updatable = false, nullable = false)
    @Getter @Setter
    private long id;
    @Column(columnDefinition = "DATETIME", updatable= false, nullable = false)
    protected Date createdDate;
    @Column(columnDefinition = "DATETIME", updatable= false, nullable = false)
    protected Date upadatedDate;

    @PrePersist
    protected  void oncreate(){
        upadatedDate = new Date();
        if(createdDate == null){
            createdDate = new Date();
        }
    }
}
