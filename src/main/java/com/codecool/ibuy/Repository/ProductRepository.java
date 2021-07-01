package com.codecool.ibuy.Repository;

import com.codecool.ibuy.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    List<Product> findByCategory(String category);
    List<Product> findByUserId(Long userId);
//    void deleteById(Long id);
}
