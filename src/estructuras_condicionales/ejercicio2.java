/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;

import java.util.Scanner;

/**
 * En una serviteca se ha establecido una promoción de las llantas marca “Pinchadas”
 * dicha promoción consiste en lo siguiente:
   Si se compran menos de cinco llantas el precio es de U$100 cada una
   de U$75 si se compran de cinco a 10 y de U$50 si se compran más de 10.
   Obtener la cantidad de dinero que una persona tiene que pagar 
   por cada una de las llantas que compra y la que tiene que pagar por el total de la compra.
 * @author Andres camilo gonzalez velasquez
 * cod: 20201187519
 */
public class ejercicio2 
{
    public static void main(String[] args) 
    {
        String llantas;
        System.out.println("Escribe cuantas llantas quieres comprar: ");
        Scanner entr = new Scanner(System.in);
        llantas=entr.next();
        int vllan = Integer.parseInt(llantas);
        if(vllan<5) //despues de recoger los datos, calcule el valor de las llantas.
        {
            int presio = vllan*100;
            System.out.println("El valor por "+llantas+" llantas es de: U$"+ presio);
        }
        else 
        {
            if(vllan>=5 && vllan<=10)
            {
                int presio = vllan*75;
                System.out.println("El valor por "+llantas+" llantas es de: U$"+ presio);
            }
            else
                if(vllan>10)
                {
                    int presio = vllan*50;
                    System.out.println("El valor por "+llantas+" llantas es de: U$"+ presio);
                }
        }
    }
}
