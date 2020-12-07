/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuras_condicionales;
import java.util.Scanner;
/**
 * Un proveedor de reproductores de música ofrece un descuento del 10% sobre el precio sin IVA
 * de algún aparato, si este cuesta U$500 o más. Además, independientemente de esto
 * ofrece un 5% de descuento si la marca es “NOSY”. Determinar cuánto pagara
 * con IVA incluido, un cliente cualquiera por la compra de su aparato. El IVA es del 19%.
 * @author Andres camilo gonzalez velasquez
 * cod: 20201187519
 * fecha: 04/12/2020
 */
public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int opc;
        System.out.println("Tienda Virtual.");
        System.out.println("1. Nosy");
        System.out.println("2. GL");
        System.out.println("3. MIPANASONIC");
        System.out.println("4. Salir");
        System.out.println("Seleccione la opción:");
        opc=input.nextInt();
        switch(opc)
        { //despues de hacer el menu, hice otros submenus en los cuales aplicaba los descuentos necesarios.
            case 1:
                System.out.println("Productos Nosy:");
                System.out.println("1. Mhc-02 Precio: U$1000");
                System.out.println("2. Mhc-420 Precio: U$600");
                System.out.println("3. Mhc-69 Precio: U$300");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opcion:");
                Scanner var1=new Scanner(System.in);
                int nos = var1.nextInt();
                switch(nos)
                    {
                        case 1:
                            int mhc02 = 1000;
                            double nosys1 = (15*mhc02)/100;
                            double smhc02 = mhc02-nosys1;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+smhc02);
                            break;
                        case 2:
                            int mhc420 = 600;
                            double nosys2 = (15*mhc420)/100;
                            double smhc420 = mhc420-nosys2;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+smhc420);
                            break;
                        case 3:
                            int mhc69 = 300;
                            double nosys3 = (15*mhc69)/100;
                            double iva = (19*mhc69)/100;
                            double smhc69 = (mhc69 - nosys3)+iva;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+smhc69);
                            break;
                        case 4:
                            System.out.println("Saliendo del menu...");
                            break;
                            default:
                                System.out.println("Opcion equivocada...");
                    }
                break;
            case 2:
                System.out.println("Productos GL:");
                System.out.println("1. ON2DN Precio: U$1000");
                System.out.println("2. 0D1N Precio: U$600");
                System.out.println("3. TH04 Precio: U$300");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opcion:");
                Scanner var2=new Scanner(System.in);
                int gl = var2.nextInt();
                switch(gl)
                    {
                        case 1:
                            int on2 = 1000;
                            double gl1 = (10*on2)/100;
                            double son = on2-gl1;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+son);
                            break;
                        case 2:
                            int od = 600;
                            double gl2 = (10*od)/100;
                            double sod = od-gl2;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+sod);
                            break;
                        case 3:
                            int th = 300;
                            double iva = (19*th)/100;
                            double sth = th + iva;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+sth);
                            break;
                        case 4:
                            System.out.println("Saliendo de la tienda virtual...");
                            break;
                            default:
                                System.out.println("Opcion equivocada...");
                    }
                break;
            case 3:
                System.out.println("Productos MIPANASONIC:");
                System.out.println("1. AKX440 Precio: U$1000");
                System.out.println("2. AK47 Precio: U$600");
                System.out.println("3. AKX420 Precio: U$300");
                System.out.println("4. Salir");
                System.out.println("Seleccione una opcion:");
                Scanner var3=new Scanner(System.in);
                int snic = var3.nextInt();
                switch(snic)
                    {
                        case 1:
                            int ak440 = 1000;
                            double snic1 = 10/100*ak440;
                            double sak1 = ak440-snic1;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+sak1);
                            break;
                        case 2:
                            int ak47 = 600;
                            double snic2 = 10/100*ak47;
                            double sak2 = ak47-snic2;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+sak2);
                            break;
                        case 3:
                            int ak420 = 300;
                            double iva = (19*ak420)/100;
                            double sak3 = ak420 + iva;
                            System.out.println("El total a pagar aplicando descuentos");
                            System.out.println("mas iva es de: U$"+sak3);
                            break;
                        case 4:
                            System.out.println("Saliendo de la tienda virtual...");
                            break;
                        default:
                            System.out.println("Opcion equivocada...");
                    }
                break;
            case 4: 
                System.out.println("Saliendo de la tienda virtual...");
                break;
            default:
                System.out.println("Opcion equivocada...");
        }    
    }
}
