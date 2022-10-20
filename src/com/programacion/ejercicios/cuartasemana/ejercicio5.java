package com.programacion.ejercicios.cuartasemana;
import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner palabras = new Scanner(System.in);
        System.out.println("Introduce una cadena de texto ");
        String cadena=palabras.nextLine();
        if (cadena.contains("b")|cadena.contains("v")){

            if (cadena.contains("b")){
                System.out.println("Tu frase contiene la letra b ");
                String letrap=cadena.contains("p")? "El texto tiene la letra p " : "El texto no tiene la letra p " ;
                System.out.println(letrap);

            }
            else {
                System.out.println("El texto no contiene ninguna b ni ninguna v");
            }
            if (cadena.contains("v")) {
                System.out.println("Tu frase contiene la letra v ");
                String letrau = cadena.contains("v") ? "El texto tiene la letra v " : "El texto no tiene la letra v ";
                System.out.println(letrau);
            }

        }
        else {
            System.out.println("El texto no contiene ninguna b ni ninguna v");
        }

    }
}
