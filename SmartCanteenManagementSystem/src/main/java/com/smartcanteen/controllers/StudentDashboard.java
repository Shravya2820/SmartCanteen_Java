package com.smartcanteen.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class StudentDashboard {

    @FXML
    private VBox dashboardContainer;

    @FXML
    private Button orderButton;

    @FXML
    private Button tokenButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Label welcomeLabel;

    @FXML
    private TextArea announcementsArea;

    @FXML
    public void initialize() {
        welcomeLabel.setText("Welcome to the Smart Canteen!");
        announcementsArea.setText("Today's Special: Pizza and Salad!");
    }

    @FXML
    private void handleOrderButtonAction() {
        // Logic to navigate to the order page
    }

    @FXML
    private void handleTokenButtonAction() {
        // Logic to navigate to the token page
    }

    @FXML
    private void handleLogoutButtonAction() {
        // Logic to handle logout
        Stage stage = (Stage) logoutButton.getScene().getWindow();
        stage.close(); // Close the dashboard
    }
}