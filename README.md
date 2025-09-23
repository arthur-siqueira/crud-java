# Product CRUD API with Spring Boot

A complete RESTful API for managing a product catalog, developed with Java and Spring Boot.

## ⚙️ Features

* **Create:** Register a new product.
* **Read:** List all registered products.
* **Update:** Update information for an existing product.
* **Delete:** Remove a product from the catalog.
* Input data validation at the API entry point.

## 🚀 Tech Stack

* **Java 21**
* **Spring Boot 3**
* **Spring Data JPA**
* **PostgreSQL** (running on Docker)
* **Flyway** (for database migrations)
* **Maven**

## 🏁 Getting Started

### Prerequisites

* Java 21
* Maven 3.x
* Docker Desktop

### Running the Application

1.  **Clone the repository:**
    ```bash
    git clone [https://github.com/arthur-siqueira/crud-java.git](https://github.com/arthur-siqueira/crud-java.git)
    cd crud-java
    ```

2.  **Start the database:**
    ```bash
    docker-compose up -d
    ```

3.  **Run the application:**
    ```bash
    ./mvnw spring-boot:run
    ```

4.  The API will be available at `http://localhost:8080/products`.

## 🔀 API Endpoints

| Method   | URL                | Action                   | Example Body (JSON)                           |
| :------- | :----------------- | :----------------------- | :-------------------------------------------- |
| `POST`   | `/products`        | Register a new product   | `{"name": "New Product", "price": 1234}`      |
| `GET`    | `/products`        | List all products        | N/A                                           |
| `PUT`    | `/products/{id}`   | Update a product         | `{"name": "Edited Product", "price": 5678}` |
| `DELETE` | `/products/{id}`   | Delete a product         | N/A                                           |