package com.ijse.posdatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ijse.posdatabase.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

    
} 