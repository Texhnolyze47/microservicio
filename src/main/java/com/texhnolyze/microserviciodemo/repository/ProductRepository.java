package com.texhnolyze.microserviciodemo.repository;

import com.texhnolyze.microserviciodemo.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
