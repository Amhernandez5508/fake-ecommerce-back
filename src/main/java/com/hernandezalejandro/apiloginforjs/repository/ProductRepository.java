package com.hernandezalejandro.apiloginforjs.repository;

import com.hernandezalejandro.apiloginforjs.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
