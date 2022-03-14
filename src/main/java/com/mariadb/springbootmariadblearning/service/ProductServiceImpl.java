package com.mariadb.springbootmariadblearning.service;

import com.mariadb.springbootmariadblearning.dto.ProductDto;
import com.mariadb.springbootmariadblearning.enums.Gender;
import com.mariadb.springbootmariadblearning.mapper.ProductMapper;
import com.mariadb.springbootmariadblearning.model.Product;
import com.mariadb.springbootmariadblearning.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProductServiceImpl implements ProductService{

    final ProductRepository productRepository;

    final ProductMapper productMapper;

    @Override
    public Product saveProduct(ProductDto productDto, Gender gender) {
        Product product=productMapper.productDtoToProduct(productDto);
        product.setGender(gender);
        return productRepository.save(product);
    }

    @Override
    public Product updateProduct(long id, ProductDto productDto, Gender gender) {
        Product existProduct=productRepository.findById(id).orElseThrow();
        existProduct.setFirstName(productDto.getFirstName());
        existProduct.setFirstName(productDto.getLastName());
        existProduct.setGender(gender);
        return productRepository.save(existProduct);
    }

    @Override
    public Product getProduct(long id) {
        Product existProduct=productRepository.findById(id).orElseThrow();
        return existProduct;
    }

    @Override
    public void deleteProduct(long id) {
          productRepository.deleteById(id);
    }

    @Override
    public List<Product> getProducts() {
        return (List<Product>) productRepository.findAll();
    }
}
