package Estructuras_repetitivas;

import java.util.Scanner;

/**
 * 6.	Una empresa distribuidora de huevos cuenta con N repartidores, los cuales
 * al final de su jornada laboral, entregan un reporte con la venta realizada.
 * Implemente un ciclo para capturar el nombre y la venta (en dinero) de cada
 * repartidor y al final muestre el nombre y la venta de los repartidores con
 * mayor y menor monto.
 *
 * @author Andres Camilo Gonzalez Velasquez fecha: 06/01/2021 cod: 20201187519
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner rep = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner ven = new Scanner(System.in);
        System.out.println("Digite cuantos repartidores hay: ");
        int repar = rep.nextInt();
        String[] repart = new String[1000];
        int[] vents = new int[1000];
        int i;
        for (i = 1; i <= repar; i++) {
            System.out.println("Digite el nombre del repartidor #" + i);
            String name = nom.nextLine();
            repart[i] = name;
            System.out.println("Digite el valor total de la venta de " + name + ": ");
            int sale = ven.nextInt();
            vents[i] = sale;
        }
        int mayor, menor;
        String maname, meven;
        maname = meven = repart[1];
        mayor = menor = vents[1];
        for (i = 1; i <= repar; i++) {
            if (vents[i] > mayor) {
                mayor = vents[i];
                maname = repart[i];
            }
            if (vents[i] < menor) {
                menor = vents[i];
                meven = repart[i];
            }

        }
        System.out.println("El repartidor con mayor monto fue " + maname + " y su monto fue de " + mayor);
        System.out.println("El repartidor con menor monto fue " + meven + " y su monto fue de " + menor);
    }
}
