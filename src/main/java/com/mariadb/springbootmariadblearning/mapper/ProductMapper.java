package com.mariadb.springbootmariadblearning.mapper;

import com.mariadb.springbootmariadblearning.dto.ProductDto;
import com.mariadb.springbootmariadblearning.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper
public interface ProductMapper {

    @Mappings({
            @Mapping(target = "firstName",source = "firstName"),
            @Mapping(target = "lastName",source = "lastName"),
            @Mapping(target = "identity",source = "identity")
    })
    Product productDtoToProduct(ProductDto productDto);
}
