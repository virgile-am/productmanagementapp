package io.reflectoring.productmanagementapp.repository;

import io.reflectoring.productmanagementapp.entity.CategoryDocument;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDocumentRepository extends MongoRepository<CategoryDocument, String> {
}
