package com.example.demo.product;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/products")
public class ProductController{

    @GetMapping 
    public List<Product> geProducts(){
        return List.of(
            new Product("Cappucinno","Café con leche espumada"), 
            new Product("Brownie","Postre de chcocolate"), 
            new Product("Lomo saltado","Trozos de carne de res salteados con cebolla") 
        );
    }


}