package com.texhnolyze.microserviciodemo.controller;
import com.texhnolyze.microserviciodemo.dto.ProductResponse;
import com.texhnolyze.microserviciodemo.dto.ProductResquest;
import com.texhnolyze.microserviciodemo.model.Product;
import com.texhnolyze.microserviciodemo.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductResquest productResquest){
        productService.createProduct(productResquest);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProducts(){
        return productService.getAllProducts();
    }


}
