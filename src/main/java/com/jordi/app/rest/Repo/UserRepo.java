package com.jordi.app.rest.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jordi.app.rest.Models.User;

public interface UserRepo extends JpaRepository<User, Long>{

}
