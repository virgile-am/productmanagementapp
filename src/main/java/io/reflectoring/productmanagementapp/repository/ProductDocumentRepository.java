package io.reflectoring.productmanagementapp.repository;

import io.reflectoring.productmanagementapp.entity.ProductDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductDocumentRepository extends MongoRepository<ProductDocument, String> {
}

