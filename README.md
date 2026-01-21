# HRMS (Human Resources Management System) Backend

This repository contains the backend RESTful API for a Human Resources Management System. It is built using **Java** and **Spring Boot**, following the **N-Layered Architecture** principles and **Standardized Result Pattern**.

## 🚀 Technologies Used
* **Language:** Java 17+
* **Framework:** Spring Boot 3.x
* **Database:** PostgreSQL
* **Data Access:** Spring Data JPA (Hibernate)
* **API Documentation:** SpringDoc OpenAPI (Swagger UI)
* **Utilities:** Lombok
* **Version Control:** Git & GitHub
* **Build Tool:** Maven

## 📂 Project Architecture (N-Layered Architecture)
The project is designed with **Separation of Concerns** in mind:
* **Api:** Controllers (REST Endpoints)
* **Business:** Service Layer (Business Logic & Validation)
* **DataAccess:** Repository Layer (Database Interactions)
* **Entities:** Database Tables
* **Core:** Universal/Shared Utilities (**Result Pattern**, Generic Response Wrappers)

## 🔌 API Endpoints

### 📖 API Documentation (Swagger UI)
You can view and test all API endpoints interactively via the Swagger UI interface:
> **URL:** `http://localhost:8080/swagger-ui/index.html`

### 💼 Job Titles
* `GET /api/jobtitles/getall` - Lists all job positions in the system.
* `POST /api/jobtitles/add` - Adds a new job position to the system.

## 📦 Standard API Response Structure
All API responses follow a unified structure (Result Pattern) to ensure consistency for frontend consumers.

**1. Success Data Response (e.g., GetAll):**
```json
{
  "success": true,
  "message": "Data listed successfully",
  "data": [
    {
      "id": 1,
      "title": "Software Engineer"
    }
  ]
}