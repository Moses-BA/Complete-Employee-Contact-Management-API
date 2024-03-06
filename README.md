# Complete-Employee-Contact-Management-API
This Spring Boot application provides a microservices-based REST API for managing employee contacts, secured with Spring Authentication, and utilizing a MySQL database for persistence.


**Key Features**

* **CRUD Functionality:**
    * Create new employee contacts
    * Read existing contacts
    * Update contact details (Admin only)
    * Delete contacts (Admin only)
* **Data Storage:** MySQL database integration
* **Microservices Architecture:** Employs interfaces for code reusability and adherence to best practices
* **Robust Authentication:** Spring Authentication to manage user logins, roles, and access controls.
* **Exceptional Testing:** Comprehensive unit and integration tests for reliability.
* **Informative API Documentation:** Clear guidance on API usage.
* **Error Handling:** Graceful response handling, providing informative error codes and messages.  

**Prerequisites**

* Java 17 (or a compatible version)
* Maven 
* MySQL Server running

**Getting Started**

1. Clone the repository:
   ```bash
    git clone https://github.com/Moses-BA/employee-contact-api.git
   ```

2. **Configure the Database:**
   * Create a MySQL database.
   * Update the database connection properties in `application.properties` (or `application.yml`)

3. **Build and Run:**
   ```bash
    mvn clean package
    mvn spring-boot:run
   ```

**API Documentation**

After running the application, navigate to the link to see the complete and detailed documentation.
http://localhost:8080/swagger-ui/index.html#/

**Authentication**

* The API employs role-based authorization.
* Admin users possess elevated permissions (update and delete).
* Refer to the documentation for authentication endpoints and usage.

**Testing**

The unit and integration test code snippets are already included in the Test folder. You can run tests directly.

**Project Structure**

* `src/main/java`
    * `com.ltp.employeecontact`
        * **web:** REST Controller classes 
        * **pojo:**  Entity classes representing employee contacts.
         * **repositories:**  Data access using Spring Data JPA.
        * **services:** Business logic layer. 
        * **security:**  Authentication and authorization configuration.
        * **exception:**  Exception handling logic and error messages for a robust application.
* `src/test/java`
   * Unit and integration tests.

**Contributing**

This project was solely developed by me(Moses). There were no additional contributions.
The application is already in use by a top tect company.

**License**

Apache License

**Additional Notes**

* This project leverages the following Spring Boot Starters:
    * `spring-boot-starter-web`
    * `spring-boot-starter-data-jpa`
    * `spring-boot-starter-security`
    * `spring-boot-starter-test`
   * Add any additional starters you use.
   * All dependencies can be found in the pom.xml file.

