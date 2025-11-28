package com.smartcanteen.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class StudentOrderPage {

    @FXML
    private ListView<String> foodListView;

    @FXML
    private TextField quantityField;

    @FXML
    private Button addToCartButton;

    @FXML
    private TextArea cartTextArea;

    private List<String> cart = new ArrayList<>();
    private HashMap<String, Double> foodMenu = new HashMap<>();

    public void initialize() {
        loadFoodMenu();
        foodListView.getItems().addAll(foodMenu.keySet());
        
        addToCartButton.setOnAction(event -> addToCart());
    }

    private void loadFoodMenu() {
        foodMenu.put("Pizza", 8.99);
        foodMenu.put("Burger", 5.49);
        foodMenu.put("Pasta", 7.99);
        foodMenu.put("Salad", 4.99);
        foodMenu.put("Soda", 1.99);
    }

    private void addToCart() {
        String selectedFood = foodListView.getSelectionModel().getSelectedItem();
        String quantityText = quantityField.getText();
        
        if (selectedFood != null && !quantityText.isEmpty()) {
            int quantity = Integer.parseInt(quantityText);
            double price = foodMenu.get(selectedFood);
            double totalPrice = price * quantity;

            cart.add(selectedFood + " x" + quantity + " - $" + totalPrice);
            updateCartDisplay();
        }
    }

    private void updateCartDisplay() {
        cartTextArea.clear();
        for (String item : cart) {
            cartTextArea.appendText(item + "\n");
        }
    }
}