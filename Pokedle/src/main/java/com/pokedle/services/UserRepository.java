package com.pokedle.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pokedle.models.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
