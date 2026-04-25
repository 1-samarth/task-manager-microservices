# 🚀 Task Manager Microservices (Spring Boot)

A full-stack **Task Manager application** built using **Spring Boot Microservices, MySQL (Railway), and a simple HTML/JavaScript frontend**.
The project demonstrates real-world microservices architecture with independent deployments.

---

## 🧠 Project Overview

This project is divided into **two microservices**:

* 👤 **User Service** → Handles user management
* 📋 **Task Service** → Handles tasks linked to users

The frontend interacts with both services using REST APIs.

---

## 🏗️ Tech Stack

* ☕ Java 17
* 🌱 Spring Boot
* 📦 Spring Data JPA
* 🐬 MySQL (Railway Cloud DB)
* 🛠 Maven
* 🌐 HTML + CSS + JavaScript
* 🐳 Docker (for deployment)
* ☁️ Render (Cloud deployment)

---

## 🧩 Architecture

Frontend → User Service → Task Service → MySQL (Railway)

* Each service is **independently deployed**
* Communication via **REST APIs**
* Database shared via environment variables

---

## 🌐 Live Links

### 🔹 Frontend

👉 https://task-manager-frontend-mcag.onrender.com

### 🔹 User Service API

👉 https://user-service-2ciw.onrender.com/users

### 🔹 Task Service API

👉 https://task-service-api-nl9u.onrender.com/tasks

---

## 📁 Project Structure

```
task-manager-microservices/
│
├── user-service/      # User microservice
├── task-service/      # Task microservice
├── frontend/          # HTML + JS frontend
└── README.md
```

---

## ⚙️ Environment Variables

For local development, create a `.env` file:

```
MYSQLHOST=your-host
MYSQLPORT=your-port
MYSQLDATABASE=your-db
MYSQLUSER=your-username
MYSQLPASSWORD=your-password
```

⚠️ These values are **not stored in GitHub** for security.

---

## ▶️ Run Locally

### 1️⃣ Run User Service

```bash
cd user-service

# PowerShell
$env:MYSQLHOST="your-host"
$env:MYSQLPORT="your-port"
$env:MYSQLDATABASE="your-db"
$env:MYSQLUSER="your-user"
$env:MYSQLPASSWORD="your-password"

mvn spring-boot:run
```

---

### 2️⃣ Run Task Service

```bash
cd task-service

$env:MYSQLHOST="your-host"
$env:MYSQLPORT="your-port"
$env:MYSQLDATABASE="your-db"
$env:MYSQLUSER="your-user"
$env:MYSQLPASSWORD="your-password"

mvn spring-boot:run
```

---

### 3️⃣ Run Frontend

Open in browser:

```
frontend/index.html
```

---

## 🌐 API Endpoints

### 👤 User Service (Port 8081)

* GET `/users`
* POST `/users`
* DELETE `/users/{id}`

---

### 📋 Task Service (Port 8082)

* GET `/tasks`
* POST `/tasks`
* GET `/tasks/user/{userId}`
* DELETE `/tasks/{id}`

---

## 🚀 Features

* ✅ Add Users
* ✅ Add Tasks
* ✅ Assign Tasks to Users
* ✅ Delete Users & Tasks
* ✅ Task Status (Pending / Completed)
* ✅ Dashboard with statistics
* ✅ Microservices architecture
* ✅ Cloud deployment (Render + Railway)

---

## 🚀 Deployment

* Backend services deployed using **Docker on Render**
* Frontend deployed as **Static Site on Render**
* Database hosted on **Railway (MySQL)**

---

## 🔐 Security Note

* Database credentials are stored using **environment variables**
* No sensitive data is stored in the repository

---

## 📌 Future Improvements

* 🔐 JWT Authentication
* 🌐 API Gateway
* 📦 Service Communication (Feign / RestTemplate)
* 🎨 UI Improvements
* 📊 Advanced Dashboard

---

## 👨‍💻 Author

**Samarth Chandel**
B.Tech Data Science Student

---

## ⭐ Project Highlights

* Real-world **Microservices Architecture**
* Full deployment (**Frontend + Backend + Database**)
* Resume-ready production-level project 🚀

---

⭐ If you like this project, give it a star!
