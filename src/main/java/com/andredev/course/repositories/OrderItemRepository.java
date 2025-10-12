package com.andredev.course.repositories;

import com.andredev.course.entities.OrderItem;
import com.andredev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}
