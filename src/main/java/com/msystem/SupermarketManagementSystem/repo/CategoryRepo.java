package com.msystem.SupermarketManagementSystem.repo;

import com.msystem.SupermarketManagementSystem.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category,String> {
}
