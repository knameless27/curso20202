/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;
import java.util.Scanner;
/**
     6 Tomando como base los resultados obtenidos en un laboratorio de análisis clínicos
     * un médico determina si una persona tiene anemia o no
     * lo cual depende de su nivel de hemoglobina en la sangre, de su edad y de su sexo.
     * Si el nivel de hemoglobina que tiene una persona es menor que el rango que le corresponde
     * se determina su resultado como positivo y en caso contrario como negativo.
     * La tabla en la que el medico se basa para obtener el resultado es la siguiente:
		EDAD					NIVEL HEMOGLOBINA
		0 - 1 mes					13    - 26 g%
		> 1 y < = 6 meses				10    - 18 g%
		> 6 y < = 12 meses				11    - 15 g%
		> 1 y < = 5 años				11.5 - 15 g%
		> 5 y < = 10 años				12.6 - 15.5 g%
		> 10 y < = 15 años				13    - 15.5 g%
		Mujeres > 15 años				12    - 16 g%
		Hombres > 15 años				14    - 18 g%

 * @author andres camilo gonzalez velasquez
 * cod: 20201187519
 * fecha: 04/12/2020
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner edad = new Scanner(System.in);
        Scanner hemo = new Scanner(System.in);
        Scanner sex = new Scanner(System.in);
        Scanner mes = new Scanner(System.in);
        System.out.println("¿El paciente es mayor de 12 meses de edad? (responda 'y' o 'n'): ");
        String numm = mes.nextLine();
        System.out.println("Escriba La edad del paciente: ");
        int numed = edad.nextInt();
        System.out.println("Escriba la hemoglobina del paciente: ");
        double numhe = hemo.nextInt();
        System.out.println("Escriba el sexo del paciente (escriba 'm' o 'f'): ");
        String secso = sex.nextLine();
        if (numm.equals("y")) { //despues de recoger los datos, separe la cantidad de hemoglobina y luego clasifique los generos.
            if (numed > 1 && numed <= 5) {
                if (numhe < 11.5 && numhe > 15) {
                    System.out.println("Positivo para neumonia");
                } else {
                    System.out.println("Negativo para neumonia");
                }
            } else {
                if (numed > 5 && numed <= 10) {
                    if (numhe < 12.6 && numhe > 15.5) {
                        System.out.println("Positivo para neumonia");
                    } else {
                        System.out.println("Negativo para neumonia");
                    }
                } else {
                    if (numed > 10 && numed <= 15) {
                        if (numhe < 13 && numhe > 15.5) {
                            System.out.println("Positivo para neumonia");
                        } else {
                            System.out.println("Negativo para neumonia");
                        }
                    } else {
                        if (numed > 15) {
                            if (secso.equals("m")) {
                                if (numhe < 14 && numhe > 18) {
                                    System.out.println("Positivo para neumonia");
                                } else {
                                    System.out.println("Negativo para neumonia");
                                }
                            } else {
                                if (numhe < 12 && numhe > 16) {
                                    System.out.println("Positivo para neumonia");
                                } else {
                                    System.out.println("Negativo para neumonia");
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (numm.equals("n")) {
                if (numed == 0 || numed == 1) {
                    if (numhe < 13 && numhe > 26) {
                        System.out.println("Positivo para neumonia");
                    } else {
                        System.out.println("Negativo para neumonia");
                    }
                } else {
                    if (numed > 1 && numed <= 6) {
                        if (numhe < 10 && numhe > 18) {
                            System.out.println("Positivo para neumonia");
                        } else {
                            System.out.println("Negativo para neumonia");
                        }
                    } else {
                        if (numed > 6 && numed <= 12) {
                            if (numhe < 11 && numhe > 15) {
                                System.out.println("Positivo para neumonia");
                            } else {
                                System.out.println("Negativo para neumonia");
                            }
                        }
                    }
                }
            } else {
                System.out.println("Caracter erroneo.");
            }
        }
    }
}
