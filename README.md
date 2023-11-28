# Full-Stack-Application-Movie-Project

Movie API is a RESTful web service used to manage movie information. This service stores movie data using MongoDB as the database and provides access through various API endpoints.

## Technologies

- Java 20
- Spring Boot 3.2.0
- MongoDB
- Lombok

## Getting Started

1. Clone the project to your computer.

   ```bash
   git clone https://github.com/username/project-name.git
   ```

2. Update the MongoDB connection URI in the `application.properties` file.

   ```properties
   spring.data.mongodb.uri=mongodb+srv://<username>:<password>@<your-cluster-url>/movie-api-db
   ```

3. Start the project.

   ```bash
   cd project-name
   ./mvnw spring-boot:run
   ```

   Or if Maven is not installed:

   ```bash
   cd project-name
   mvn spring-boot:run
   ```

## API Endpoints

- **GET /api/v1/movies:** Retrieve all movies.
- **GET /api/v1/movies/{id}:** Retrieve the movie with the specified ID.


Please replace `<username>`, `<password>`, `<your-cluster-url>`, and other placeholders with your actual MongoDB database information. Update the API endpoints section with the specific endpoints your project provides. Ensure the Contributing section provides guidance for developers looking to contribute to your project, and update the License section with the appropriate licensing information for your project.
