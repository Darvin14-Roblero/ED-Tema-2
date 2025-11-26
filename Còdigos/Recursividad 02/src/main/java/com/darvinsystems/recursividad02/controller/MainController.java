package com.darvinsystems.recursividad02.controller;

import com.darvinsystems.recursividad02.funciones.FactorialRecursivo;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtNumero;

    @FXML
    void OnResultado(ActionEvent event) {
        FactorialRecursivo factorialRecursivo = new FactorialRecursivo();
        int n = Integer.parseInt(txtNumero.getText());
        int f;
        f = Math.toIntExact(factorialRecursivo.factorial(n));
        lblResultado.setText("el factorial es:" + f);
    }

}
