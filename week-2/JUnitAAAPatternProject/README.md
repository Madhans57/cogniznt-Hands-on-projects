# Calculator Maven Project

This is a simple Java application that demonstrates a basic Calculator with unit tests using JUnit.

## Project Structure

```
settingupJunit
├── src
│   ├── main
│   │   └── java
│   │       └── Calculator.java
│   └── test
│       └── java
│           └── CalculatorTest.java
├── pom.xml
└── README.md
```

## How to Build and Run the Application

1. **Prerequisites**: Ensure you have Maven and JDK installed on your machine.

2. **Clone the Repository**: 
   ```
   git clone <repository-url>
   cd settingupJunit
   ```

3. **Build the Project**: 
   ```
   mvn clean install
   ```

4. **Run the Application**: 
   ```
   mvn exec:java -Dexec.mainClass="Calculator"
   ```

## Running Tests

To run the unit tests, use the following command:
```
mvn test
```

## License

This project is licensed under the MIT License.
