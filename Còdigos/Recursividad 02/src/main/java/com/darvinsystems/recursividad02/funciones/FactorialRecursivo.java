package com.darvinsystems.recursividad02.funciones;

import java.util.Scanner;

public class FactorialRecursivo {

    // Método recursivo para calcular factorial
    public  long factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        if (n == 0 || n == 1) {
            return 1; // Caso base
        }
        return n * factorial(n - 1); // Llamada recursiva
    }

    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un número entero: ");
            int num = sc.nextInt();
            System.out.println("Factorial de " + num + " = " + factorial(num));
        } catch (Exception e) {
            System.out.println("Entrada inválida. Debes introducir un número entero.");
        }
        sc.close();
    }*/
}
