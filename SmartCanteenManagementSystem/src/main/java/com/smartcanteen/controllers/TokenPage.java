package com.smartcanteen.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import java.util.Random;

public class TokenPage {

    @FXML
    private Label tokenLabel;

    @FXML
    private Label itemsLabel;

    @FXML
    private Label totalLabel;

    @FXML
    private Button backButton;

    private Random random = new Random();

    @FXML
    public void initialize() {
        generateToken();
        displayOrderedItems();
        displayTotalAmount();
    }

    private void generateToken() {
        int tokenNumber = random.nextInt(100000);
        tokenLabel.setText("Your Token: " + tokenNumber);
    }

    private void displayOrderedItems() {
        // This method should retrieve and display the ordered items from the cart
        // For now, we will use a placeholder
        itemsLabel.setText("Ordered Items: Item1, Item2, Item3");
    }

    private void displayTotalAmount() {
        // This method should calculate and display the total amount of the ordered items
        // For now, we will use a placeholder
        totalLabel.setText("Total Amount: $30.00");
    }

    @FXML
    private void handleBackButtonAction() {
        // Logic to navigate back to the dashboard
    }
}