package com.smartcanteen.controllers;

import com.smartcanteen.models.Student;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

public class StudentRegister {

    @FXML
    private AnchorPane registerPane;

    @FXML
    private TextField usernameField;

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button registerButton;

    public static ArrayList<Student> registeredStudents = new ArrayList<>();

    @FXML
    private void initialize() {
        registerButton.setOnAction(e -> handleRegister());
    }

    private void handleRegister() {
        String username = usernameField.getText().trim();
        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();

        if (username.isEmpty() || email.isEmpty() || password.isEmpty()) {
            showAlert("Error", "All fields are required!");
            return;
        }

        // Create new student
        Student newStudent = new Student(username, password, email);
        registeredStudents.add(newStudent);

        showAlert("Success", "Registration successful! Please log in.");

        // Load login screen
        Stage stage = (Stage) registerPane.getScene().getWindow();
        Main.loadScene("login.fxml", stage);
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }
}
