package org.fasttrackit.shoponlineapi.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.fasttrackit.shoponlineapi.Domain.Product;
import org.fasttrackit.shoponlineapi.Persistence.ProductRepository;
import org.fasttrackit.shoponlineapi.Transfer.CreateProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ObjectMapper objectMapper;

    @Autowired
    //value for object of ProductRepository type is delegate to other entity
    //spring boot can delegate value to any other entity it wants
    public ProductService(ProductRepository productRepository, ObjectMapper objectMapper) {
        this.productRepository = productRepository;
        this.objectMapper = objectMapper;
    }

    public Product createProduct(CreateProductRequest request){
        //convert request from CreateProductRequest type to Product type
        //who is object of Product type
        Product product = objectMapper.convertValue(request, Product.class);
        return productRepository.save(product);
    }
}
