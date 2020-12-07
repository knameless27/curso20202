/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;
import java.util.Scanner;
/**
 * Calcular la utilidad que un trabajador recibe en el reparto anual de utilidades
 * si a este se le asigna un porcentaje de su salario mensual que depende
 * de su antigüedad en la empresa de acuerdo con la siguiente tabla:
Tiempo					        Utilidad
	Menos de 1 año					5 % del salario
	1 año o más y menos de 2 años			7% del salario
	2 años o más y menos de 5 años			10% del salario
	5 años o más y menos de 10 años			15% del salario
	10 años o más					20% del salario
 * @author Andres camilo Gonzalez Velasquez
 * cod: 20201187519
 * fecha: 05/12/2020
 */
public class ejercicio9 {

    public static void main(String[] args) {
        int años=0;
        int total;
        Scanner anos = new Scanner(System.in);
        Scanner sal = new Scanner(System.in);
        Scanner mes = new Scanner(System.in);
        System.out.println("¿Lleva meses trabajando para la empresa? (responda 'y' o 'n')");
        String m3s = mes.nextLine();
        if (m3s.equals("n")) {
            System.out.println("Escriba los años que lleva trabajando para la empresa: ");
            años = anos.nextInt();
        }
        System.out.println("Escriba su salario: ");
        int sala = sal.nextInt();
        int porcen = 0;
        if (m3s.equals("y")) { //despues de recoger los datos, separe la gente que trabajo menos de 1 año y luego les calcule el reparto del salario
            porcen = porcen + 5;
            int porsala = (porcen * sala) / 100;
            total = porsala+ sala;
            System.out.println("Su reparto mas su salario es de: "+total);
        } else {
            if (años >= 1 && años < 2) {
                porcen = porcen + 7;
                int porsala = (porcen * sala) / 100;
                total = porsala+ sala;
                System.out.println("Su reparto mas su salario es de: "+total);
            } else {
                if (años >= 2 && años < 5) {
                    porcen = porcen + 10;
                    int porsala = (porcen * sala) / 100;
                    total = porsala+ sala;
                    System.out.println("Su reparto mas su salario es de: "+total);
                } else {
                    if (años >= 5 && años < 10) {
                        porcen = porcen + 15;
                        int porsala = (porcen * sala) / 100;
                        total = porsala+ sala;
                        System.out.println("Su reparto mas su salario es de: "+total);
                    } else {
                        if (años >= 10) {
                            porcen = porcen + 20;
                            int porsala = (porcen * sala) / 100;
                            total = porsala+ sala;
                            System.out.println("Su reparto mas su salario es de: "+total);
                        }
                    }
                }
            }
        }
    }
}
