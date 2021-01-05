package Estructuras_repetitivas;
import java.util.Scanner;
/**
 * 3.	El sistema meteorológico local requiere un sistema para capturar la 
 * temperatura promedio de cada día de la semana e imprimir el nombre del día 
 * y un mensaje de la percepción de la temperatura de acuerdo 
 * con el valor capturado según la siguiente tabla:

Temperatura	Mensaje
Menor o igual que cero	Congelante
1 a 10°C	Muy frío
11 a 20°C	Frío
21 a 24°C	Templado
25 a 29°C	Agradable
30 a 35°C	Caliente
36°C o más	Muy caliente

 * @author Andres Camilo Gonzalez Velasquez
 * cod: 20201187519
 * fecha: 05/01/2021
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner ques = new Scanner(System.in);
        int i = 1;
        int [] tempd = new int[8];
        String [] dia = {"a","lunes","martes","miercoles","jueves","viernes","sabado","domingo"};
        for(i=1;i<=7;i++)
        {
            System.out.println("Digite la temperatura promedio del dia "+dia[i]);
            int temp = ques.nextInt();
            tempd[i]=temp;
            
        }
        for (i = 1; i <= 7; i++) {
            if (tempd[i] <= 0) {
                System.out.println("La temperatura del dia " + dia[i] + " es congelante");
            } else if (tempd[i] >= 1 && tempd[i] <= 10) {
                System.out.println("La temperatura del dia " + dia[i] + " es muy frio");
            } else if (tempd[i] >= 11 && tempd[i] <= 20) {
                System.out.println("La temperatura del dia " + dia[i] + " es frio");
            } else if (tempd[i] >= 21 && tempd[i] <= 24) {
                System.out.println("La temperatura del dia " + dia[i] + " es templado");
            } else if (tempd[i] >= 25 && tempd[i] <= 29) {
                System.out.println("La temperatura del dia " + dia[i] + " es agradable");
            } else if (tempd[i] >= 30 && tempd[i] <= 35) {
                System.out.println("La temperatura del dia " + dia[i] + " es caliente");
            } else if (tempd[i] >= 36) {
                System.out.println("La temperatura del dia " + dia[i] + " es muy caliente");
            }
        }
    }
}
