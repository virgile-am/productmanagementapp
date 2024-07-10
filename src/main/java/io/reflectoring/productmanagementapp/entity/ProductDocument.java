package io.reflectoring.productmanagementapp.entity;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@Document(collection = "products")
public class ProductDocument {
    @Id
    private String id;

    private String name;
    private String description;
    private Double price;
    private String categoryId;
    private Date createdAt;
    private Date updatedAt;

}
