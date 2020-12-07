/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionales;
import java.util.Scanner;

/**
 * Carlos Pedraza - COD: 12345678
 * 
 */
public class ventapc {
    
     public static void main(String[] args) {
         final int PRECIO=500;
         Scanner input = new Scanner(System.in);
         int cantpc=0;
         double vrcompra,vrdto,vrpagar,dto;
         System.out.print("Número de PC a comprar: ");
         cantpc=input.nextInt();
         if(cantpc<5){
             dto=10;
         }
         else{
             if(cantpc<10){
                 dto=20;
             }
             else{
                 dto=40;
             }
         }
         vrcompra=PRECIO*cantpc;
         vrdto=vrcompra*dto/100;
         vrpagar=vrcompra-vrdto;
         System.out.println("Cant. PC=     "+cantpc);
         System.out.println("Vr. Compra=   "+vrcompra);
         System.out.println("Vr. Descuento="+vrdto);
         System.out.println("Vr. Pagar=    "+vrpagar);
  
     }
    
}
