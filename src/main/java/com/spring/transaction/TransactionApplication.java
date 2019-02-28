package com.spring.transaction;

import com.spring.transaction.domain.User;
import com.spring.transaction.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransactionApplication implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
// http://localhost:8080/h2-console/
	@Autowired
	UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(TransactionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		logger.info("Student id 10001 -> {}", userRepository.findById(10001L));

		User user1 = new User();
		user1.setId(1000L);
		user1.setName("kumar");
		user1.setCity("ballwin");

		User user2 = new User();
		user2.setId(1001L);
		user2.setName("kumar1");
		user2.setCity("ballwin1");

		logger.info("Inserting -> {}", userRepository.save(user1));

		logger.info("Update 10003 -> {}", userRepository.save(user2));

		logger.info("Single users -> {}", userRepository.findById(1000L));

		logger.info("All users -> {}", userRepository.findAll());


	}
}
