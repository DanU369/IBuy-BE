package com.codecool.ibuy.Service;

import com.codecool.ibuy.Model.Product;
import com.codecool.ibuy.Repository.ProductRepository;
import com.codecool.ibuy.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    ProductRepository productRepository;
    UserRepository userRepository;

    @Autowired
    public ProductService(ProductRepository productRepository,UserRepository userRepository) {
        this.productRepository = productRepository;
        this.userRepository=userRepository;
    }

    public void addProduct(Product product, Long userId) {
        product.setUser(userRepository.getById(userId));
        productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public List<Product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }

    public List<Product> getProductsByUser(Long userId) {
        return productRepository.findByUserId(userId);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }


//    public void assignUserToProduct(Long productId, Long userId) {
//        Product product=productRepository.getById(productId);
//        System.out.println(product);
//        User user=userRepository.getById(userId);
//        System.out.println(user);
//        product.setUser(user);
//        System.out.println(product);
//
//    }
}
