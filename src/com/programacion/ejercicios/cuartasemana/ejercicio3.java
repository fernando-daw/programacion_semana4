package com.programacion.ejercicios.cuartasemana;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner producto = new Scanner(System.in);
        System.out.println("Escoge uno de los siguientes productos: Agua Kas Ginebra Ketchup  ");
        String palabra = producto.nextLine();

        if (palabra.contains("agua")){
            System.out.println("El Agua tiene un precio de 0.33€ ");
        }
        else if (palabra.contains("kas")) {
            System.out.println("El Kas tiene un precio de 1.10€ ");
        }
        else if (palabra.contains("ginebra")){
            System.out.println("La Ginebra tiene un precio de 8.50€ ");
        } else if (palabra.contains("ketchup")) {
            System.out.println("El Ketchup tiene un precio de 0.80€ ");
        }
        else {
            System.out.println("No has introducido ninguno de los productos que te he mostrado, prueba otra vez ");
        }
    }

}
