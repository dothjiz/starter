package com.doth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.doth.model.Product;

public interface ProuctRepository extends JpaRepository<Product, Integer>{


}