package com.programacion.ejercicios.cuartasemana;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        Scanner palabras = new Scanner(System.in);
        System.out.println("Introduce una palabra cualquiera y verificamos si contiene la letra 'b' ");
        String letra= palabras.nextLine();
        if (letra.contains("b") ){
            System.out.println("La palabra que has introducido contiene al menos una letra 'b' ");
        }
        else {
            System.out.println("La palabra que has introducido NO contiene ninguna letra 'b' ");
        }

    }
}
