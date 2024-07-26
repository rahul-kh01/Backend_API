# 🚀 **Spring Boot MovieAPI Backend**

---
The Spring Boot MovieAPI Backend is a robust Java 17 application designed for efficient movie data management. It focuses on high performance, security, and modularity, offering features such as file handling, pagination, JWT authentication, and a three-layered architecture. Dive into a smooth and efficient movie data experience with this backend! 🎥🍿

# 🚀 **Technology Used:**
---
- ☕ Java
- 🍃 Spring Boot
- 🌐 Spring MVC
- 🛢️ Spring Data JPA
- 📑 Pagination and Sorting
- 📁 File Handling
- 🔐 JWT Authentication
- 🐬 MySQL Database

# 🌟 Key Features

---

- **File Handling:**
📁 Effortless media storage for quick and efficient retrieval.
🖼️ Handles images and other movie-related assets with ease.

- **Pagination**:
🔍 Improves data presentation.
🚀 Optimizes resource usage.
📑 Fetches data in manageable chunks for better performance.
JWT Authentication:
🔐 Enhances security.
🔑 Uses JSON Web Token (JWT) authentication.
🛡️ Restricts access to sensitive movie data to authorized users only.
Three-Layered Architecture:
🏗️ Ensures a modular codebase for easier maintenance and scalability.
🎯 Separates presentation, business logic, and data access layers.
🔍 Simplifies debugging, testing, and future updates.
🚀 MovieAPI Endpoints
🔗 Add Movie:
POST http://localhost:8080/api/v1/movie/add-movie

🔍 Get All Movies:
GET http://localhost:8080/api/v1/movie/all

🔍 Get Movie by ID:
GET http://localhost:8080/api/v1/movie/1

📁 Get Profile Picture:
GET http://localhost:8080/file/profile-pic

🔄 Update Movie by ID:
PUT http://localhost:8080/api/v1/movie/update/1

❌ Delete Movie by ID:
DELETE http://localhost:8080/api/v1/movie/delete/2

📑 Get Movies with Pagination:
GET http://localhost:8080/api/v1/movie/allMoviesPage?pageNumber=0&pageSize=2

📑 Get Movies with Sorting:
GET http://localhost:8080/api/v1/movie/allMoviesPageSort?sortBy=title

📝 User Registration:
POST http://localhost:8080/api/v1/auth/register

🔒 User Login:
POST http://localhost:8080/api/v1/auth/login

🚀**Cloning the Project**
Clone the Repository:

bash
Copy code
git clone https://github.com/rahulkhandelwal/Movie_Api_Backend.git
Navigate to the Project Directory:

bash
Copy code
cd Movie_Api_Backend
Configure Application Properties:

Edit src/main/resources/application.properties to update database connection details.
Create MySQL Database:

Run the SQL script located in src/main/resources/sql-scripts to create necessary tables:
bash
Copy code
mysql -u your_username -p < create_database.sql
Build and Run the Application:

With Maven:
bash
Copy code
./mvnw clean install
./mvnw spring-boot:run
Access the API Endpoints:

Explore the MovieAPI by navigating to the provided endpoints once the application is running.
Enjoy working with the MovieAPI project! Manage movie data effortlessly and feel free to contribute or provide feedback. Happy coding! 🎬🍿

🌟 **Project Author**
<span style="color:red;">rahul khandelwal</span>
📧 Email: dynamicrahul952156@gmail.com

For inquiries, feedback, or collaboration opportunities regarding the MovieAPI project, please reach out. Your input is appreciated! 🚀

