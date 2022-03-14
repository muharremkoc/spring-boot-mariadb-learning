package com.mariadb.springbootmariadblearning.repository;

import com.mariadb.springbootmariadblearning.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Long> {
}
