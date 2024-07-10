package io.reflectoring.productmanagementapp.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Setter
@Getter
@Document(collection = "categories")
public class CategoryDocument {
    // Setters
    // Getters
    @Id
    private String id;

    private String name;
    private String description;
    private String parentCategoryId;
    private List<String> productIds;

}
