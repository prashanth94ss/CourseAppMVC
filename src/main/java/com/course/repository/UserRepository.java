package com.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.course.app.User;

public interface UserRepository extends JpaRepository<User, String> {

}







