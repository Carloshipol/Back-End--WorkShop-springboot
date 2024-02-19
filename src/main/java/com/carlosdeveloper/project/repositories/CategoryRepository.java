package com.carlosdeveloper.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carlosdeveloper.project.entities.Category;
import com.carlosdeveloper.project.entities.User;


public interface CategoryRepository extends JpaRepository<Category, Long> {

}
