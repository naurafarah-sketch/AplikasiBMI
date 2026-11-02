package com.mycompany.aplikasibmi;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BmiController {

    @FXML
    private TextField txtBerat;

    @FXML
    private TextField txtTinggi;

    @FXML
    private Label lblHasil;

    @FXML
    private Label lblStatus;

    @FXML
    private void handleHitung(ActionEvent event) {
        try {
            double berat = Double.parseDouble(txtBerat.getText());
            double tinggiCm = Double.parseDouble(txtTinggi.getText());

            double tinggiMeter = tinggiCm / 100.0;
            double bmi = berat / (tinggiMeter * tinggiMeter);

            lblHasil.setText(String.format("Skor BMI: %.1f", bmi));

            if (bmi < 18.5) {
                lblStatus.setText("Status: Kurus");
            } else if (bmi >= 18.5 && bmi < 24.9) {
                lblStatus.setText("Status: Ideal (Sehat)");
            } else if (bmi >= 25.0 && bmi < 29.9) {
                lblStatus.setText("Status: Kelebihan Berat Badan");
            } else {
                lblStatus.setText("Status: Obesitas");
            }
        } catch (NumberFormatException e) {
            lblHasil.setText("Masukkan angka yang benar!");
            lblStatus.setText("");
        }
    }
}