CREATE DATABASE IF NOT EXISTS user_db;
CREATE DATABASE IF NOT EXISTS task_db;

USE user_db;

CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255),
    email VARCHAR(255)
);

INSERT INTO users (name, email) VALUES
('Samarth', 'samarth@gmail.com'),
('Rohan', 'rohan@gmail.com'),
('Priya', 'priya@gmail.com');

USE task_db;

CREATE TABLE IF NOT EXISTS tasks (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255),
    status VARCHAR(255),
    user_id BIGINT
);

INSERT INTO tasks (title, status, user_id) VALUES
('Complete Spring Boot Project', 'PENDING', 1),
('Test APIs in Postman', 'COMPLETED', 1),
('Create Resume Points', 'PENDING', 2);
