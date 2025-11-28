package com.smartcanteen;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {
        loadScene("login.fxml", stage);
    }

    public static void loadScene(String fxmlFile, Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("/views/" + fxmlFile));
            Parent root = loader.load();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
