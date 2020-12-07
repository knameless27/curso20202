/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;
import java.util.Scanner;
/**
 *    4 Una frutería ofrece las manzanas con descuento según la siguiente tabla:
		NUM. DE KILOS COMPRADOS		% DESCUENTO
			  0      -   2					  0%
			  2.01 -   5 					10%
			  5.01 - 10					15%
			10.01 en adelante				20%

Determinar cuánto pagara una persona que compre manzanas es esa frutería.
 * @author Andres Camilo Gonzalez Velasquez
 * cod: 20201187519
 * fecha: 04/12/2020
 */
public class ejercicio4 {
    public static void main(String[] args) {
        Scanner pregunta = new Scanner(System.in);
        System.out.println("El precio por kilo de las manzanas es de: U$5");
        System.out.print("Escriba cuantos kilos de manzanas desea comprar: ");
        int manza = 5;
        int man = pregunta.nextInt();
        int totalman = manza * man;
        if (man <= 2 && man >= 0) { //despues de recoger los datos, separo las cantidades y le agrego los debidos porcentajes
            System.out.println("El total es de: U$"+ totalman);
        } else {
            if (man > 2 && man <= 5) {
                double porman = (10*totalman)/100;
                double solu = totalman - porman;
                System.out.println("El total es de: U$"+ solu);
            } else {
                if (man > 5 && man <= 10) {
                    double porman = (15*totalman)/100;
                    double solu = totalman - porman;
                    System.out.println("El total es de: U$"+ solu);
                } else {
                    if (man > 10) {
                        double porman = (20*totalman)/100;
                        double solu = totalman - porman;
                        System.out.println("El total es de: U$"+ solu);
                    } else {
                        System.out.println("Valor no encontrado.");
                    }
                }
            }
        }
    }
}
