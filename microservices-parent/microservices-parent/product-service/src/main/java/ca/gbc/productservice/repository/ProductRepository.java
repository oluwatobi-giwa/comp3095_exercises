package ca.gbc.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import ca.gbc.productservice.model.Product;
import org.springframework.data.mongodb.repository.DeleteQuery;
import org.springframework.data.mongodb.repository.MongoRepository;

//import java.util.UUID;

public interface ProductRepository extends MongoRepository<Product, String> {

    @DeleteQuery
    void deleteById(String productId);

//    void deleteById(UUID productId);

}