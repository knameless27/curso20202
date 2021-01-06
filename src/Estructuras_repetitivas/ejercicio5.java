package Estructuras_repetitivas;

import java.util.Scanner;

/**
 * Un centro penitenciario tiene N internos registrados y requiere un reporte
 * con el nombre y la condena (en meses) de los internos con menos de 36 meses
 * de condena También debe mostrar la cantidad de internos que cumplen con dicha
 * condición.
 *
 * @author Andres Camilo Gonzalez Velasquez fecha: 06/01/2021 cod: 20201187519
 */
public class ejercicio5 {

    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        Scanner condena = new Scanner(System.in);
        Scanner preg = new Scanner(System.in);
        String[] name = new String[1000];
        int[] cond = new int[10000];
        int i;
        int num = 0;
        System.out.println("Digite los internos que quiere agregar");
        int pregun = preg.nextInt();
        for (i = 1; i <= pregun; i++) {
            System.out.println("Digite el nombre del interno #" + i + ": ");
            String nombr = nombre.nextLine();
            name[i] = nombr;
            System.out.println("Digite la condena de " + name[i] + " en meses: ");
            int conden = condena.nextInt();
            cond[i] = conden;
        }
        for (i = 1; i <= pregun; i++) {
            System.out.println("El reo " + name[i] + " tiene una condena de " + cond[i] + " meses");
            if (cond[i] < 36) {
                num++;
            }
        }
        System.out.println("La cantidad de reos con menos de 36 meses de condena son " + num);
    }
}
