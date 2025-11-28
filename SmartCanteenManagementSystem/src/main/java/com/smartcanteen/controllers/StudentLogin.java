package com.smartcanteen.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import java.util.HashMap;

public class StudentLogin {

    @FXML
    private AnchorPane loginPane;

    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button loginButton;

    // Dummy DB for testing
    private static HashMap<String, String> userDatabase = new HashMap<>();

    static {
        userDatabase.put("student1", "password1");
        userDatabase.put("student2", "password2");
    }

    @FXML
    private void initialize() {
        loginButton.setOnAction(event -> handleLogin());
    }

    private void handleLogin() {
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        // Validate credentials
        if (userDatabase.containsKey(username) && userDatabase.get(username).equals(password)) {
            // Load Dashboard
            Main.loadScene("dashboard.fxml");
        } else {
            // Show simple error alert
            javafx.scene.control.Alert alert = new javafx.scene.control.Alert(javafx.scene.control.Alert.AlertType.ERROR);
            alert.setTitle("Login Failed");
            alert.setHeaderText("Invalid Credentials");
            alert.setContentText("Please check your username and password.");
            alert.show();
        }
    }
}
