# Product Management System

## Project Overview

The Product Management System is an e-commerce platform developed using Spring Boot that provides advanced product management features. It includes functionalities for request handling, data binding, and integration with both relational and NoSQL databases. Additionally, it uses a binary tree structure for efficient product categorization and retrieval.

## Table of Contents

- [Project Overview](#project-overview)
- [Objectives](#objectives)
- [Technologies Used](#technologies-used)
- [Setup Instructions](#setup-instructions)
- [API Endpoints](#api-endpoints)
- [Entities](#database-entities)
- [Diagrams](#diagrams)
 


## Objectives

- Implement a robust product management system using Spring Boot with advanced features.
- Develop efficient request handling using Dispatcher Servlet, including interceptors and data binding.
- Utilize Spring Data JPA for relational database interactions and Spring Data MongoDB for NoSQL stores.
- Implement a binary tree for efficient product categorization and retrieval.

## Technologies Used

- Java JDK 21 (LTS)
- Spring Boot
- Spring Data JPA
- Spring Data MongoDB
- Spring Boot Actuator
- Maven
- H2 Database (for development)
- MongoDB (for NoSQL storage)

## Setup Instructions

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/yourusername/product-management-system.git
   cd product-management-system
### Build the Project:
./mvn clean install
### Run the Application:
./mvn spring-boot:run

## Access the Application:

The application will be available at http://localhost:8080

# API Endpoints

## Products

- **GET /products**: Retrieve all products
- **GET /products/{id}**: Retrieve a product by ID
- **POST /products**: Create a new product
- **PUT /products/{id}**: Update a product by ID
- **DELETE /products/{id}**: Delete a product by ID

## Categories

- **GET /categories**: Retrieve all categories
- **GET /categories/{id}**: Retrieve a category by ID
- **POST /categories**: Create a new category
- **PUT /categories/{id}**: Update a category by ID
- **DELETE /categories/{id}**: Delete a category by ID
## Entities 
### Product
- ID
- Name
- Description
- Price
- Category
- Created At
- Updated At

## Category
- ID
- Name
- Description
- Parent Category
- Products

## Diagrams

## Sequence Diagram
![Sequence Diagram](docs/_Sequence_Diagram_product_Management_app.png)

## Entity Relationship Diagram
![ERD](docs/_erd_productmanagement.png)
## Class Diagram
![Class Diagram](docs/_productappclassdiagram.png)
