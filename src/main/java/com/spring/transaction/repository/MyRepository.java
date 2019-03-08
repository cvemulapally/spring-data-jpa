package com.spring.transaction.repository;

import com.spring.transaction.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MyRepository<Customer, String> extends JpaRepository<User, String> {

}
