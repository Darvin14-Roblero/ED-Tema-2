package com.darvinsystems.recursividad04.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Maincontroller {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero;

    @FXML
    void OnResultado(ActionEvent event) {
        try {
            int n = Integer.parseInt(txtNumero.getText());
            int suma = sumar(n);
            lblResultado.setText("La suma es: " + suma);
        } catch (NumberFormatException e) {
            lblResultado.setText("Ingrese un número válido");
        }
    }

    private int sumar(int n) {
        if (n <= 0) return 0;
        return n + sumar(n - 1);
    }
}
