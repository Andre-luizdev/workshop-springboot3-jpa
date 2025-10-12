package com.andredev.course.repositories;

import com.andredev.course.entities.Category;
import com.andredev.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository <Category, Long> {

}
