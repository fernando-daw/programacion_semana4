package com.programacion.ejercicios.cuartasemana;
import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner par = new Scanner(System.in);
        int num;
        System.out.println("Introduce un numero:");
        num = par.nextInt();

        if (num % 2 == 0)
            System.out.println("El numero es Par");
        else
            System.out.println("El numero es Impar");
    }

}
