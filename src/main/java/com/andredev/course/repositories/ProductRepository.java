package com.andredev.course.repositories;

import com.andredev.course.entities.Category;
import com.andredev.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository <Product, Long> {

}
