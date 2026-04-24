# Task Manager Microservices

## Services

- User Service: http://localhost:8081/users
- Task Service: http://localhost:8082/tasks
- Frontend: frontend/index.html

## Steps

1. Install Java JDK 17
2. Install Maven
3. Install MySQL
4. Run `database.sql` in MySQL
5. Update MySQL password in:
   - user-service/src/main/resources/application.properties
   - task-service/src/main/resources/application.properties
6. Run user-service:
   mvn spring-boot:run
7. Run task-service:
   mvn spring-boot:run
8. Open frontend/index.html in browser
