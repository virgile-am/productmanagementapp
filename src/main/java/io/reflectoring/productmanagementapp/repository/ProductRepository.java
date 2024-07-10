package io.reflectoring.productmanagementapp.repository;

import io.reflectoring.productmanagementapp.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
