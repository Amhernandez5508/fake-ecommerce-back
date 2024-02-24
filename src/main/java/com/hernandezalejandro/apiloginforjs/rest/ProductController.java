package com.hernandezalejandro.apiloginforjs.rest;

import com.hernandezalejandro.apiloginforjs.model.Product;
import com.hernandezalejandro.apiloginforjs.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/")
    public @ResponseBody List<Product> getAllProducts(){
        return productRepository.findAll();
    }
}