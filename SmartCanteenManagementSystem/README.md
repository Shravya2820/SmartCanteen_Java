# Smart Canteen Management System

## Overview
The Smart Canteen Management System is a JavaFX application designed to streamline the process of managing student orders in a canteen. The application allows students to log in, register, view the menu, place orders, and receive a token for their purchases.

## Features
- **Student Login**: Secure login for students using a username and password.
- **Student Registration**: New students can register by providing their details.
- **Dashboard**: A user-friendly interface for navigating to different functionalities.
- **Order Page**: Students can view food categories and items, add them to their cart, and place orders.
- **Token Generation**: After placing an order, a unique token is generated for the transaction.

## Project Structure
```
SmartCanteenManagementSystem
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── smartcanteen
│   │   │           ├── Main.java
│   │   │           ├── controllers
│   │   │           │   ├── StudentLogin.java
│   │   │           │   ├── StudentRegister.java
│   │   │           │   ├── StudentDashboard.java
│   │   │           │   ├── StudentOrderPage.java
│   │   │           │   └── TokenPage.java
│   │   │           └── models
│   │   │               └── (optional model classes)
│   │   └── resources
│   │       ├── fxml
│   │       │   ├── student_login.fxml
│   │       │   ├── student_register.fxml
│   │       │   ├── student_dashboard.fxml
│   │       │   ├── student_order_page.fxml
│   │       │   └── token_page.fxml
│   │       └── styles
│   │           └── styles.css
├── pom.xml
└── README.md
```

## Getting Started
1. **Clone the Repository**: Use `git clone <repository-url>` to clone the project.
2. **Build the Project**: Navigate to the project directory and run `mvn clean install` to build the project.
3. **Run the Application**: Execute the `Main.java` file to start the application.

## Dependencies
This project uses Maven for dependency management. Ensure you have Maven installed on your machine.

## Future Enhancements
- Implement a database for persistent storage of student data and orders.
- Add an admin panel for managing food items and orders.
- Enhance the user interface for better user experience.

## License
This project is licensed under the MIT License.