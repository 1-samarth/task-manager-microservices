# 🚀 Task Manager Microservices (Spring Boot)

A simple full-stack Task Manager project built using **Spring Boot Microservices + MySQL + HTML/JS frontend**.

---

## 🧠 Project Overview

This project consists of **two microservices**:

- 👤 **User Service** → Manage users
- 📋 **Task Service** → Manage tasks linked to users

Frontend is a simple HTML page that interacts with both services.

---

## 🏗️ Tech Stack

- Java 17
- Spring Boot
- Spring Data JPA
- MySQL (Railway DB)
- Maven
- HTML + JavaScript (Frontend)

---

## 📁 Project Structure
task-manager-microservices/
│
├── user-service/
├── task-service/
├── frontend/
└── README.md
---

## ⚙️ Environment Variables

Create a `.env` file (for local development):
MYSQLHOST=your-host
MYSQLPORT=your-port
MYSQLDATABASE=your-db
MYSQLUSER=your-username
MYSQLPASSWORD=your-password

⚠️ These values are **NOT stored in GitHub** for security.

---

## ▶️ Run Locally

### 1️⃣ Run User Service

```bash
cd user-service

# Set environment variables (PowerShell)
$env:MYSQLHOST="your-host"
$env:MYSQLPORT="your-port"
$env:MYSQLDATABASE="your-db"
$env:MYSQLUSER="your-user"
$env:MYSQLPASSWORD="your-password"

mvn spring-boot:run


2️⃣ Run Task Service

cd task-service

$env:MYSQLHOST="your-host"
$env:MYSQLPORT="your-port"
$env:MYSQLDATABASE="your-db"
$env:MYSQLUSER="your-user"
$env:MYSQLPASSWORD="your-password"

mvn spring-boot:run

3️⃣ Open Frontend
frontend/index.html

🌐 API Endpoints
👤 User Service (Port 8081)
GET /users
POST /users
DELETE /users/{id}
📋 Task Service (Port 8082)
GET /tasks
POST /tasks
GET /tasks/user/{userId}
DELETE /tasks/{id}

🔐 Security Note
Database credentials are stored using environment variables
No passwords are stored in the repository
🚀 Features
Add User
Add Task
Assign Task to User
Delete User / Task
REST API based architecture
📌 Future Improvements
JWT Authentication 🔐
API Gateway
Docker Deployment
UI improvements

👨‍💻 Author
Samarth Chandel

⭐ If you like this project, give it a star!