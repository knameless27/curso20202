/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package probando.equisde;

import java.util.Scanner;

/**
 * Desarrollado por Carlos Pedraza Cod: 20202345678
 * Fecha: 24/11/2020
 */
public class ProbandoEquisde {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Se crea el objeto entrada que apunta al System.in = teclado
        String nombre;
        double pi1=3.1416;
        float x=4.3f;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        nombre=entrada.next();
        System.out.println("Hola "+nombre); //Salida por consola
        pi1++;
        System.out.print("X= "+x);
    }
    
}
