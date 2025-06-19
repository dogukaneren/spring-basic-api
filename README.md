# Spring Basic API

This is a simple RESTful API built with Spring Boot and PostgreSQL.  
It provides basic CRUD operations for managing users.

## 🚀 Technologies Used

- Java 8+
- Spring Boot 2.7.x
- Spring Data JPA
- PostgreSQL
- Maven

## 📦 API Endpoints

| Method | Endpoint           | Description         |
|--------|--------------------|---------------------|
| GET    | `/api/users`       | Get all users       |
| GET    | `/api/users/{id}`  | Get user by ID      |
| POST   | `/api/users`       | Create a new user   |
| PUT    | `/api/users/{id}`  | Update user by ID   |

## 🛠 Setup Instructions

### 1. PostgreSQL Setup

Create a database called `demo`:

```sql
CREATE DATABASE demo;
