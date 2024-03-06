package com.ltp.contacts.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.ltp.contacts.pojo.User;

public interface UserRepository extends CrudRepository<User, Long> {
	Optional<User> findByUsername(String username);
}