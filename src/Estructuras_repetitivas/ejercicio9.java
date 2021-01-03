package Estructuras_repetitivas;

import java.util.Scanner;

/**
 * 9.	Una compañía ha tenido un excelente año y desea premiar a sus empleados
 * con un aumento de salarios. Los sueldos deben ajustarse a la siguiente forma:
 *
 * Sueldo actual	Aumento Hasta $9,000	20 % $9,001 - $13,000	17 % $13,001 - $
 * 18,000	12 % Sobre $18,000	6 %
 *
 * La compañía tiene 50 empleados. Diseñe un algoritmo en diagrama de flujo que
 * lea el nombre de cada empleado y su sueldo actual, y que imprima el nombre,
 * el sueldo actual y el sueldo aumentado. Al final de la lista debe
 * proporcionar también, el monto total de la nómina actual y el monto total de
 * la nueva nómina que incluye los aumentos mencionados.
 *
 * @author Andres Camilo Gonzalez Velasquez fecha: 08/01/2021 cod:20201187519
 */
public class ejercicio9 {

    public static void main(String[] args) {
        //p*v)/100
        String[] name = new String[51];
        int[] salact = new int[51];
        double[] aumen = new double[51];
        double nomsin = 0, nomcon = 0;
        Scanner preg = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner sal = new Scanner(System.in);
        System.out.println("Digite cuantos empleados quiere revisar (maximo 50): ");
        int prgn = preg.nextInt();
        int i;
        for (i = 1; i <= prgn; i++) {
            System.out.println("Digite el nombre del empleado #" + i);
            String nombr = nom.nextLine();
            name[i] = nombr;
            System.out.println("Digite el sueldo actual de " + name[i]);
            int sala = sal.nextInt();
            salact[i] = sala;
            nomsin = salact[i] + nomsin;
            if (salact[i] <= 9000) {
                aumen[i] = (0.20 * salact[i]) / 100;
                nomcon = aumen[i] + nomcon;
            } else if (salact[i] >= 9001 && salact[i] <= 13000) {
                aumen[i] = (0.17 * salact[i]) / 100;
                nomcon = aumen[i] + nomcon;
            } else if (salact[i] >= 13001 && salact[i] <= 18000) {
                aumen[i] = (0.12 * salact[i]) / 100;
                nomcon = aumen[i] + nomcon;
            } else if (salact[i] > 18000) {
                aumen[i] = (0.06 * salact[i]) / 100;
                nomcon = aumen[i] + nomcon;
            }
        }
        for (i = 1; i <= prgn; i++) {
            System.out.println("El sueldo actual de " + name[i] + " es de " + salact[i] + " y su sueldo aumentado es de " + (salact[i]+aumen[i]));
        }
        System.out.println("\n\n\n");
        System.out.println("La nomina sin los sueldos aumentados es de: " + nomsin);
        System.out.println("Y la nomina con los aumentos es de: " + (nomsin+nomcon));
    }
}
