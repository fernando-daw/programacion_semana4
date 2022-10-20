package com.programacion.ejercicios.cuartasemana;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner palabras = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto ");
        String frase = palabras.nextLine();
        int num = frase.length();
        if (num % 2 == 0) {
            System.out.println("El texto introducido tiene " + num + " palabras y es par");
        }
            else {
                System.out.println("El texto introducido tiene " + num + " palabras y es impar");
            }

        }
    }




