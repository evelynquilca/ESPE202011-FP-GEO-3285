/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02_float;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW02_FLOAT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float perimetrorectangulo;
        
        
try (Scanner leer = new Scanner(System.in)) {
			float ladoa=0, ladob=0, ladoc=0, ladod=0;
			System.out.printf("Ingrese el lado a: ");
			ladoa=leer.nextFloat ();       
			System.out.printf("Ingrese el lado b: ");
			ladob=leer.nextFloat ();
			System.out.printf("Ingrese el lado c: ");
			ladoc = leer.nextFloat();
			System.out.printf("Ingrese el lado d:");
			ladod=leer.nextFloat();

                        System.out.printf("El perimetro del rectangulo es: " 
                                + ladoa + ladob + ladoc + ladod);
}
    }
}

    
                        
                  

   


