package com.darvinsystems.recursividad04.operacion;

import java.util.Scanner;

public class SumadePrimerNumero {

    // Método recursivo para sumar los primeros n números
    public static int suma(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        if (n == 0) return 0; // Caso base
        return n + suma(n - 1); // Llamada recursiva
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce un número entero: ");
            int n = sc.nextInt();
            System.out.println("Suma de 1 a " + n + " = " + suma(n));
        } catch (Exception e) {
            System.out.println("Entrada inválida. Debes introducir un número entero.");
        }
        sc.close();
    }
}
