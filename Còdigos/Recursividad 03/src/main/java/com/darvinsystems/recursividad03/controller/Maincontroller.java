package com.darvinsystems.recursividad03.controller;

import com.darvinsystems.recursividad03.serie.Fibonacci;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Maincontroller {

    @FXML
    private Label lblResultado;

    @FXML
    private TextField txtPosicion;

    @FXML
    void OnResultado(ActionEvent event) {
        int n = Integer.parseInt(txtPosicion.getText());
        long resultado = Fibonacci.fibonacci(n);
        lblResultado.setText("Resultado: " + resultado);



    }

}
