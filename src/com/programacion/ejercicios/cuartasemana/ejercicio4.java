package com.programacion.ejercicios.cuartasemana;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Scanner figura = new Scanner(System.in);
        System.out.println("Selecciona una figura geometrica y conoce su area: triangulo, rectangulo, pentagono o hexagono ");
        String palabra = figura.nextLine();

        if (palabra.contains("triangulo")){
            System.out.println("Has seleccionado el triangulo, introduce el valor de la base");
            int base=figura.nextInt();
            System.out.println("introduce el valor de la altura");
            int altura=figura.nextInt();
            int area=(base*altura)/2;
            System.out.println("El area del triangulo es de " + area);
        }
        else if (palabra.contains("rectagulo")){
            System.out.println("Has seleccionado el reactangulo, introduce el valor de la base");
            int base=figura.nextInt();
            System.out.println("introduce el valor de la altura");
            int altura=figura.nextInt();
            int area=(base*altura);
            System.out.println("El area del rectangulo es de " + area);
        }
        else if (palabra.contains("pentagono")) {
            System.out.println("Has seleccionado el pentagono, introduce el valor del lado");
            int lado = figura.nextInt();
            int perimetro= lado*5;
            System.out.println("introduce el valor de la apotema (distancia más corta entre el centro del polígono y uno de sus lados)");
            int apotema = figura.nextInt();
            int area = (perimetro * apotema)/2;
            System.out.println("El area del pentagono es de " + area);
        }
        else if (palabra.contains("hexagono")) {
            System.out.println("Has seleccionado el rectangulo, introduce el valor del lado");
            int lado = figura.nextInt();
            System.out.println("introduce el valor de la apotema (distancia más corta entre el centro del polígono y uno de sus lados)");
            int apotema = figura.nextInt();
            int area = 3*lado*apotema;
            System.out.println("El area del hexagono es de " + area);
        }
        else {
            System.out.println("No has introducido ninguna figura de las mencionadas, prueba otra vez");
        }
    }
}
