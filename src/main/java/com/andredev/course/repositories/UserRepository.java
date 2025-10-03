package com.andredev.course.repositories;

import com.andredev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository <User, Long> {

}
