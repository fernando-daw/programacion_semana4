package com.programacion.ejercicios.cuartasemana;
import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
    Scanner numero = new Scanner(System.in);
    System.out.println("Introduce un numero cualquiera ");
    int dato= numero.nextInt();
        if (dato<10){
            System.out.println("El numero que has introducido es Menor que 10");
        }
        else {
            System.out.println("El numero que has introducido es Mayor que 10");

        }
    }
}
