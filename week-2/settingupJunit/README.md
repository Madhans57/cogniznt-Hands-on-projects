# My Maven Project

This is a simple Java application that demonstrates the use of recursion to print numbers from a given integer down to 1.

## Project Structure

```
my-maven-project
├── src
│   ├── main
│   │   └── java
│   │       └── App.java
│   └── test
│       └── java
│           └── AppTest.java
├── pom.xml
└── README.md
```

## How to Build and Run the Application

1. **Prerequisites**: Ensure you have Maven and JDK installed on your machine.

2. **Clone the Repository**: 
   ```
   git clone <repository-url>
   cd my-maven-project
   ```

3. **Build the Project**: 
   ```
   mvn clean install
   ```

4. **Run the Application**: 
   ```
   mvn exec:java -Dexec.mainClass="App"
   ```

## Running Tests

To run the unit tests, use the following command:
```
mvn test
```

## License

This project is licensed under the MIT License.