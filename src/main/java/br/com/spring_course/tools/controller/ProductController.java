package br.com.spring_course.tools.controller;

import br.com.spring_course.tools.dto.ProductResponseDto;
import br.com.spring_course.tools.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/product")
    ResponseEntity<List<ProductResponseDto>> getProductList(){
        return ResponseEntity.ok(productService.getProductList());
    }

    @PostMapping("/product")
    ResponseEntity<List<ProductResponseDto>> postProductOnProductList(){
        return ResponseEntity.ok(productService.getProductList());
    }
}
