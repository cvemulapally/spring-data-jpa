package com.spring.transaction.repository;

import com.spring.transaction.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

//@Transactional(readOnly = true)
public interface UserRepository extends JpaRepository<User, Long> {
}
