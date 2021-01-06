package Estructuras_repetitivas;

import java.util.Scanner;

/**
 * La casa del adulto mayor tiene 37 personas registradas y requiere un reporte
 * de los adultos con más de 85 años Para ello implementa un sistema en el que
 * se capturan el nombre y la edad de cada persona e imprime los datos de
 * quienes cumplen con la condición solicitada.
 *
 * @author Andres Camilo Gonzalez Velasquez fecha: 06/01/2021 cod: 20201187519
 */
public class ejercicio4 {

    public static void main(String[] args) {
        String[] nombres = new String[370];
        int[] edades = new int[370];
        Scanner age = new Scanner(System.in);
        Scanner preg = new Scanner(System.in);
        Scanner nomb = new Scanner(System.in);
        System.out.println("Digite cuantas personas nuevas quiere agregar: ");
        int num = preg.nextInt();
        int i;
        for (i = 1; i <= num; i++) {
            System.out.println("Digite el nombre de la persona #" + i);
            String nombr = nomb.nextLine();
            nombres[i] = nombr;
            System.out.println("Digite la edad de " + nombres[i]);
            int edd = age.nextInt();
            edades[i] = edd;
        }
        for (i = 1; i <= num; i++) {
            if (edades[i] > 85) {
                System.out.println(nombres[i] + " es mayor de 85 años");
            }
        }
    }
}
