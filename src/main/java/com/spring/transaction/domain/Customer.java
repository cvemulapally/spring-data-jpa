package com.spring.transaction.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Customer {

    @Id
    private String id;
    private String cName;
    private String cCity;
}
