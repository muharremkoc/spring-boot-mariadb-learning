package com.mariadb.springbootmariadblearning.controller;

import com.mariadb.springbootmariadblearning.dto.ProductDto;
import com.mariadb.springbootmariadblearning.enums.Gender;
import com.mariadb.springbootmariadblearning.model.Product;
import com.mariadb.springbootmariadblearning.service.ProductService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/api/mariadb")
public class PersonController {

    final ProductService productService;

    @PostMapping("/product")
    public Product saveProduct(@RequestParam Gender gender, @RequestBody ProductDto productDto){
        return productService.saveProduct(productDto, gender);
    }

    @PutMapping("/product/{id}")
    public Product updateProduct(@PathVariable("id") long id,@RequestParam Gender gender, @RequestBody ProductDto productDto){
        return productService.updateProduct(id,productDto, gender);
    }

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") long id){
        return productService.getProduct(id);
    }

    @DeleteMapping("/product/{id}")
    public void deleteProduct(@PathVariable("id") long id){
         productService.deleteProduct(id);
    }

    @GetMapping("/products")
    public List<Product> getProduct(){
        return productService.getProducts();
    }
}
