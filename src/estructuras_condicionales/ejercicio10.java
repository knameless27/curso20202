/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;
import java.util.Scanner;
/**
 * 10 Un obrero necesita calcular su salario semanal, el cual se obtiene de la sig. manera:
   Si trabaja 40 horas o menos se le paga $5000 por hora
   Si trabaja más de 40 horas se le paga $5000 por cada una de las primeras 40 horas
   y un aumento del 20% por cada hora extra.
 * @author Andres Camilo Gonzalez Velasquez
 * cod: 20201187519
 * fecha: 07/12/2020
 */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner hors = new Scanner(System.in); 
        System.out.println("Escriba las horas trabajadas: "); 
        int horas = hors.nextInt();  
        int phoras;
        double rhoras, thoras;
        if (horas <= 40) { //despues de recoger los datos, hago un if en el cual se separan ambos casos
            horas = horas * 5000;
            System.out.println("Su salario semanal es de: " + horas); //aqui se muestran los casos menores a 40 horas
        } else {
            if (horas > 40) {
                phoras = (horas * 5000) - 200000; 
                rhoras = (20*phoras)/100;
                thoras = rhoras+(horas*5000);
                System.out.println("Su salario semanal es de: "+thoras); //aqui se muestran los casos mayores a 40 horas mas las horas extras
            } else {
                System.out.println("Caracter Erroneo.");
            }
        }
    }
}
