# StudentService

## Overview

`StudentService` is a RESTful API built with Spring Boot for managing student records. It provides endpoints for creating, retrieving, updating, and deleting student information. The service also includes input validation and custom error handling.

## API Endpoints

The base URL for the endpoints is `http://localhost:9090/students`.


### Throw exception scenario 1. Add a Student

**POST** `/students`

- **Description**: Adds a new student to the system.
- **Request Body**: A JSON object representing the student with name more than 10 characters.
  ```json
  {
    "name": "John Doe1234567",
    "age": 20
  }

## Project Structure

The project is organized into the following packages:

- **controller**: Manages HTTP requests and responses.
- **service**: Contains business logic for student operations.
- **repository**: Handles data persistence (in-memory for this example).
- **model**: Contains data models for the application.

### Retrieve All Students

- **HTTP Method**: `GET`
- **Endpoint**: `/students`
- **Description**: Retrieves a list of all students.
- **Example Request**:
    ```http
    GET http://localhost:9090/students
    ```

### Retrieve a Specific Student

- **HTTP Method**: `GET`
- **Endpoint**: `/students/{id}`
- **Description**: Retrieves details of a specific student by ID.
- **Path Parameter**:
    - `id`: The ID of the student to retrieve.
- **Example Request**:
    ```http
    GET http://localhost:9090/students/1
    ```

### Add a New Student

- **HTTP Method**: `POST`
- **Endpoint**: `/students`
- **Description**: Adds a new student.
- **Request Body**:
    ```json
    {
        "name": "John Doe",
        "age": 20
    }
    ```
- **Example Request**:
    ```http
    POST http://localhost:9090/students
    Content-Type: application/json

    {
        "name": "John Doe",
        "age": 20
    }
    ```

### Update an Existing Student

- **HTTP Method**: `PUT`
- **Endpoint**: `/students/{id}`
- **Description**: Updates details of an existing student by ID.
- **Path Parameter**:
    - `id`: The ID of the student to update.
- **Request Body**:
    ```json
    {
        "name": "Jane Doe",
        "age": 22
    }
    ```
- **Example Request**:
    ```http
    PUT http://localhost:9090/students/1
    Content-Type: application/json

    {
        "name": "Jane Doe",
        "age": 22
    }
    ```

### Delete a Student

- **HTTP Method**: `DELETE`
- **Endpoint**: `/students/{id}`
- **Description**: Deletes a specific student by ID.
- **Path Parameter**:
    - `id`: The ID of the student to delete.
- **Example Request**:
    ```http
    DELETE http://localhost:9090/students/1
    ```

## Setup and Run

### Prerequisites

- Java 17 or higher
- Maven 3.6.0 or higher

### Steps to Run

1. Clone the repository:
    ```bash
    git clone https://github.com/mailstoakumar/student-service-with-exceptionhandler.git
    ```
2. Navigate to the project directory:
    ```bash
    cd student-service
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```
4. Run the application:
    ```bash
    mvn spring-boot:run
    ```
5. The application will start on `http://localhost:9090` (or the port you configured).

## Testing

The project includes unit tests for the service layer. To run the tests, use:

```bash
mvn test