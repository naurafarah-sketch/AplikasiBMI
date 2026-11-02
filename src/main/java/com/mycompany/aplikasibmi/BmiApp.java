package com.mycompany.aplikasibmi;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class BmiApp extends Application {

    @Override
    public void start(Stage stage) {
        try {
            // Menggunakan garis miring / di awal agar mencari dari folder utama
            Parent root = FXMLLoader.load(getClass().getResource("/com/mycompany/aplikasibmi/BmiView.fxml"));
            Scene scene = new Scene(root, 400, 450);
            stage.setTitle("Kalkulator BMI");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            System.err.println("=== DETAIL ERROR ===");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}