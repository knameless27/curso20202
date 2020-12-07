/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;
import java.util.Scanner;
/**
    Una empresa automotriz necesita un sistema para seleccionar el tipo de carro
    (auto, SUV o camioneta) lo cual debe de aparecer en un menú, y el color (negro
    blanco o rojo) en otro menú. Al final se necesita que despliegue la selección realizada
    Nota. Debe de anidarse una estructura de selección múltiple dentro de otra.

 * @author Andres Camilo Gonzalez Velasquez
 * cod: 20201187519
 * fecha: 07/12/2020
 */
public class ejercicio13 {
    public static void main(String[] args) {
        Scanner selec = new Scanner(System.in);
        Scanner color = new Scanner(System.in);
        String aut = "Auto", suv = "SUV", cam = "Camioneta", neg = "Negro", blan = "Blanco", roj = "Rojo";
        System.out.println("Escriba el numero del tipo de carro: ");
        System.out.println("1. Auto");
        System.out.println("2. SUV");
        System.out.println("3. Camioneta");
        int sel = selec.nextInt();
        switch(sel)
        { //despues de separar los datos, complete el formulario con la opcion deseada.
            case 1:
                System.out.println("Escriba el numero del color que desea: ");
                System.out.println("1. Negro");
                System.out.println("2. Blanco");
                System.out.println("3. Rojo");
                int col = color.nextInt();
                switch(col)
                {
                    case 1:
                        System.out.println("Gracias por comprar, su compra fue de un "+ aut +" de color " + neg);
                        break;
                    case 2:
                        System.out.println("Gracias por comprar, su compra fue de un "+ aut +" de color " + blan);
                        break;
                    case 3:
                        System.out.println("Gracias por comprar, su compra fue de un "+ aut +" de color " + roj);
                        break;
                    default:
                        System.out.println("Caracter Erroneo.");
                }
                break;
            case 2:
                System.out.println("Escriba el numero del color que desea: ");
                System.out.println("1. Negro");
                System.out.println("2. Blanco");
                System.out.println("3. Rojo");
                int col2 = color.nextInt();
                switch(col2)
                {
                    case 1:
                        System.out.println("Gracias por comprar, su compra fue de un "+ suv +" de color " + neg);
                        break;
                    case 2:
                        System.out.println("Gracias por comprar, su compra fue de un "+ suv +" de color " + blan);
                        break;
                    case 3:
                        System.out.println("Gracias por comprar, su compra fue de un "+ cam +" de color " + roj);
                        break;
                    default:
                        System.out.println("Caracter Erroneo.");
                }
                break;
            case 3:
                System.out.println("Escriba el numero del color que desea: ");
                System.out.println("1. Negro");
                System.out.println("2. Blanco");
                System.out.println("3. Rojo");
                int col3 = color.nextInt();
                switch(col3)
                {
                    case 1:
                        System.out.println("Gracias por comprar, su compra fue de un "+ aut +" de color " + neg);
                        break;
                    case 2:
                        System.out.println("Gracias por comprar, su compra fue de un "+ suv +" de color " + blan);
                        break;
                    case 3:
                        System.out.println("Gracias por comprar, su compra fue de un "+ cam +" de color " + roj);
                        break;
                    default:
                        System.out.println("Caracter Erroneo.");
                }
                break;
            default:
                System.out.println("Caracter erroneo.");
        }
    }
}
