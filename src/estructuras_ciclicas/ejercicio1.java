
package estructuras_ciclicas;
import java.util.Scanner;
/**
 * Una clínica de maternidad necesita un sistema para determinar cuántos bebés han nacido recientemente
 * Dicho sistema solicita al usuario capturar la cantidad de nacimientos (N)
 * el nombre de cada bebé y su sexo (implemente un ciclo do-while para validar la captura
 * siendo M para masculino y F para femenino)
 * Al final, debe imprimir la cantidad de bebés de cada sexo.
 * @author Andres Camilo Gonzalez Velasquez
 * fecha: 04/01/2021
 * cod: 20201187519
 */
public class ejercicio1 {

    public static void main(String[] args) {
        Scanner bbs = new Scanner(System.in);
        Scanner nom = new Scanner(System.in);
        Scanner sx = new Scanner(System.in);
        System.out.println("Digite cuantos bebes han nacido: ");
        int bebes = bbs.nextInt();
        int sal = bebes;
        int lim = 0;
        int m=0;
        int f=0;
        do {
            lim++;
            int exit = 0;
            System.out.println("Digite el nombre del bebe #" + lim);
            String name = nom.nextLine();
            System.out.println("Digite el sexo del bebe #" + lim + " "
                    + "(escriba M si es masculino y F si es femenino)");
            String sex = sx.nextLine();
            do {
                switch (sex) {
                    case "M":
                        m++;
                        exit++;
                        break;
                    case "F":
                        f++;
                        exit++;
                        break;
                    default:
                        System.out.println("Caracter erroneo");
                        break;
                }
            } while (exit == 0);
        } while (lim < sal);
        System.out.println("Los bebes de sexo masculinos son: "+m);
        System.out.println("Los bebes de sexo femeninos son: "+f);
    }
}
