# SpringRestSimple
A simple RESTful Spring application
## Configuration and setup
This Spring application performes CRUD operations with employee database.

This Spring application uses Hibernate to connect to PostgreSQL database. Maven was used to create the initial application.

This Spring application is configured via Configuration class instead of web.xml
## CRUD operations
* To *get all* employees, access URL http://localhost:8080/spring_rest/ - use **GET** http method
* To *get by ID*, access URL http://localhost:8080/spring_rest/get/**{id_number}** - **GET** http method
* To *add new* employee, access http://localhost:8080/spring_rest/ using **POST** http method
* To *update* employee, access http://localhost:8080/spring_rest/ using **PUT** http method
* To *delete* employee by ID, access http://localhost:8080/spring_rest/delete/**{id_number}** using **DELETE** http method.

