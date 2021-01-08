package Estructuras_repetitivas;

import java.util.Scanner;

/**
 * 8.	Un centro de salud cuenta con 1270 expedientes en su archivo y desea
 * identificar a las personas con mayor y menor peso. Para ello implementa un
 * sistema mediante el cual se capturan el nombre y peso de cada paciente y al
 * finalizar, se imprime el nombre y kgs. de las personas con mayor y menor
 * peso.
 *
 * @author Andres Camilo Gonzalez Velasquez fecha: 08/01/2021 cod: 20201187519
 */
public class ejercicio8 {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner pes = new Scanner(System.in);
        String[] name = new String[1000];
        int[] peso = new int[1000];
        int i;
        System.out.println("Digite el numero de personas que quiere agregar: ");
        int numb = num.nextInt();
        for (i = 1; i <= numb; i++) {
            System.out.println("Digite el nombre de la persona #" + i);
            String nomb = nom.nextLine();
            name[i] = nomb;
            System.out.println("Digite el peso en kg de " + name[i] + ": ");
            int pso = pes.nextInt();
            peso[i] = pso;
        }
        int mayor, menor;
        String maname, meven;
        maname = meven = name[1];
        mayor = menor = peso[1];
        for (i = 1; i <= numb; i++) {
            if (peso[i] > mayor) {
                mayor = peso[i];
                maname = name[i];
            }
            if (peso[i] < menor) {
                menor = peso[i];
                meven = name[i];
            }
        }
        System.out.println("La persona con mayor peso es "+maname+" y su peso es de "+mayor);
        System.out.println("La persona con menor peso es "+meven+" y su peso es de "+menor);
    }
}
