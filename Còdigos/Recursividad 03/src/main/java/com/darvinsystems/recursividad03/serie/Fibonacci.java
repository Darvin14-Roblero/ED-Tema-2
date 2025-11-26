package com.darvinsystems.recursividad03.serie;

import java.util.Scanner;

public class Fibonacci {

    // Método recursivo para calcular el n-ésimo término de Fibonacci
    public static long fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        if (n == 0) return 0; // Caso base
        if (n == 1) return 1; // Caso base
        return fibonacci(n - 1) + fibonacci(n - 2); // Llamadas recursivas
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce la posición n de Fibonacci: ");
            int n = sc.nextInt();
            System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        } catch (Exception e) {
            System.out.println("Entrada inválida. Debes introducir un número entero.");
        }
        sc.close();
    }
}
