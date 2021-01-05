package Estructuras_repetitivas;

import java.util.Scanner;

/**
 * Una heladería desea obtener un reporte semanal de ventas Para ello debe
 * capturar en un sistema todas las facturas de ventas realizadas Cada factura
 * contiene la cantidad y el sabor de las paletas vendidas Los sabores y los
 * precios son: limón ($2500), nuez ($2800), lulo ($2600) fresa ($2000) y crema
 * ($3000) El sistema debe imprimir la cantidad de paletas vendidas de cada
 * sabor el valor vendido y la venta total Considere que una factura puede tener
 * varias paletas de diferentes sabores.
 *
 * @author Andres Camilo Gonzalez Velasquez cod: 20201187519 fecha: 04/01/2021
 */
public class ejercicio2 {

    public static void main(String[] args) {
        int li = 2500;
        int nu = 2800;
        int lu = 2600;
        int fr = 2000;
        int cr = 3000;
        Scanner num = new Scanner(System.in);
        Scanner lim = new Scanner(System.in);
        Scanner nue = new Scanner(System.in);
        Scanner lul = new Scanner(System.in);
        Scanner fre = new Scanner(System.in);
        Scanner cre = new Scanner(System.in);
        System.out.println("Digite el numero de paletas vendidas esta semana: ");
        int venp = num.nextInt();
        int i;
        for (i = 01; i <= venp; i++) {
            System.out.println("cuantas paletas de limon vendio: ");
            int limo = lim.nextInt();
            System.out.println("cuantas paletas de nuez vendio: ");
            int nuez = nue.nextInt();
            System.out.println("cuantas paletas de lulo vendio: ");
            int lulo = lul.nextInt();
            System.out.println("cuantas paletas de fresa vendio: ");
            int fres = fre.nextInt();
            System.out.println("cuantas paletas de crema vendio: ");
            int crem = cre.nextInt();
            int sum = limo + nuez + lulo + fres + crem;
            if (sum == venp) {
                System.out.println("\n\n\n\n\n\n\n");
                System.out.println("________________________________");
                System.out.println("        -Reporte semanal-");
                System.out.println("-Paletas de limon vendidas: " + limo +", total: "+(limo * li));
                System.out.println("-Paletas de nuez vendidas: "+ nuez +", total: "+(nuez * nu));
                System.out.println("-Paletas de lulo vendidas: " + lulo+", total: "+(lulo * lu));
                System.out.println("-Paletas de fresa vendidas: " + fres+", total: "+(fres * fr));
                System.out.println("-Paletas de crema vendidas: " + crem+", total: "+(crem * cr));
                System.out.println("");
                int total1 = limo*li;
                int total2 = nuez * nu;
                int total3 = lulo * lu;
                int total4 = fres * fr;
                int total5 = crem * cr;
                System.out.println("Total de paletas vendidas: " + venp+", dinero total: "+(total1+total2+total3+total4+total5));
                i=venp+1;
            } else {
                System.out.println("Numero de ventas erroneo!");
            }
        }
    }
}
