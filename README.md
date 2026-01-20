# HRMS (Human Resources Management System) Backend

This repository contains the backend RESTful API for a Human Resources Management System. It is built using **Java** and **Spring Boot**, following the **N-Layered Architecture** principles.

## 🚀 Technologies Used
* **Language:** Java 17+
* **Framework:** Spring Boot 3.x
* **Database:** PostgreSQL
* **Data Access:** Spring Data JPA (Hibernate)
* **Version Control:** Git & GitHub
* **Build Tool:** Maven

## 📂 Project Architecture (3-Layered Engineering Architecture)
The project is designed with **Separation of Concerns** in mind:
* **Api:** Controllers (REST Endpoints)
* **Business:** Service Layer (Business Logic)
* **DataAccess:** Repository Layer (Database Interactions)
* **Entities:** Database Tables
* **Core:** Universal/Shared Utilities (Result types, etc.)

## 🔌 API Endpoints
### Job Titles
* `GET /api/jobtitles/getall` - Lists all job positions in the system.

## ⚙️ Setup & Installation
1.  Clone the repository:
    ```bash
    git clone [https://github.com/Furkancan2/hrms-backend.git](https://github.com/Furkancan2/hrms-backend.git)
    ```
2.  Configure PostgreSQL database settings in `application.properties`.
3.  Run the application via your IDE or Maven wrapper:
    ```bash
    ./mvnw spring-boot:run
    ```

## 📝 Future Plans
* User Management (Candidates, Employers)
* Job Advertisements
* Email Verification System
* Swagger UI Integration