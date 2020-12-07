/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;
import java.util.Scanner;
/**
 * 12 Un supermercado realiza una tómbola con todos los clientes
 * si son hombres tienen que sacar de una canasta una bolita la cual tiene
 * un número grabado y si son mujeres lo mismo pero de otra canasta
 * los premios se dan bajo la siguiente tabla:	

	HOMBRES				MUJERES
	# Bolita		Premio		# bolita		Premio
	1		Desodorante		1		Loción
	2		Six-Pack de cerveza	2		Bikini
	3		Camiseta		3		Crema para la cara
	4		Pantaloneta		4		Plancha para el cabello
	5		Sudadera		5		Esmalte de uñas	
 * @author Andres Camilo Gonzalez Velasquez
 * cod: 20201187519
 * fecha: 07/12/2020
 */
public class ejercicio12 {
    public static void main(String[] args) {
        Scanner sex = new Scanner(System.in);
        Scanner bol = new Scanner(System.in);
        System.out.println("Escribe tu genero ('m' o 'f'): ");
        String gen = sex.nextLine();
        System.out.println("Escribe la bolita que sacaste: ");
        int bola = bol.nextInt();
        if (gen.equals("m")) {
            switch (bola) {
                case 1: //separe los generos y entregue los premios (no entendi que tenia que hacer en este punto xd)
                    System.out.println("Felicidades, Has ganado un Desodorante!!");
                    break;
                case 2:
                    System.out.println("Felicidades, Has ganado un Six-Pack de cerveza!!");
                    break;
                case 3:
                    System.out.println("Felicidades, Has ganado una Camiseta!!");
                    break;
                case 4:
                    System.out.println("Felicidades, Has ganado una Pantaloneta!!");
                    break;
                case 5:
                    System.out.println("Felicidades, Has ganado una Sudadera!!");
                    break;
                default:
                        System.out.println("Opcion equivocada.");
                    break;

            }
        } else {
            if (gen.equals("f")) {
                switch (bola) {
                    case 1:
                        System.out.println("Felicidades, Has ganado una Locion!!");
                        break;
                    case 2:
                        System.out.println("Felicidades, Has ganado un Bikini!!");
                        break;
                    case 3:
                        System.out.println("Felicidades, Has ganado una Crema para la cara!!");
                        break;
                    case 4:
                        System.out.println("Felicidades, Has ganado una Plancha para el cabello!!");
                        break;
                    case 5:
                        System.out.println("Felicidades, Has ganado un Esmalte de uñas!!");
                        break;
                    default:
                        System.out.println("Opcion equivocada.");
                        break;
                }
            } else {
                System.out.println("Caracter Erroneo.");
            }
        }
    }
}
