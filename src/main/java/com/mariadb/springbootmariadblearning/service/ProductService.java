package com.mariadb.springbootmariadblearning.service;

import com.mariadb.springbootmariadblearning.dto.ProductDto;
import com.mariadb.springbootmariadblearning.enums.Gender;
import com.mariadb.springbootmariadblearning.model.Product;

import java.util.List;

public interface ProductService {

    Product saveProduct(ProductDto productDto, Gender gender);
    Product updateProduct( long id,ProductDto productDto, Gender gender);
    Product getProduct(long id);
    void deleteProduct(long id);
    List<Product> getProducts();
}
