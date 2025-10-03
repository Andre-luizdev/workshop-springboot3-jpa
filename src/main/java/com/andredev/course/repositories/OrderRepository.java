package com.andredev.course.repositories;

import com.andredev.course.entities.Order;
import com.andredev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository <Order, Long> {

}
