/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int ladoa=3, ladob=3, ladoc=7, ladod=7;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el lado del rectangulo: " );
     
        ladoa=scanner.nextInt ();
        System.out.println("Ingrese el lado del rectangulo: " + ladoa );
        
        ladob=scanner.nextInt ();
        System.out.println("Ingrese el lado del rectangulo: " + ladob);
       
        ladoc=scanner.nextInt();
        System.out.println("Ingrese el lado del rectangulo: " + ladoc);
        
        ladod=scanner.nextInt();
        System.out.println("Ingrese el perimetro del rectangulo: " + ladod );
        
        System.out.println("El perimetro del rectangulo es: " +
                perimetrorectangulo(ladoa+ ladob+ ladoc+ ladod));
                } 

   

 










    
