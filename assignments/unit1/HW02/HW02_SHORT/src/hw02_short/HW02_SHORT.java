/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02_short;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW02_SHORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try (Scanner leer = new Scanner(System.in)) {
			short ladoa=(short)3.6, ladob=(short) 3.6, 
                                ladoc=(short) 7.5, ladod=(short) 7.5;
			System.out.println("Ingrese el lado a: ");
			ladoa=leer.nextShort ();       
			System.out.println("Ingrese el lado b: ");
			ladob=leer.nextShort ();
                        System.out.println("Ingrese el lado c: ");
                        ladoc=leer.nextShort ();
                        System.out.println("Ingrese el lado d: ");
                        ladod=leer.nextShort ();
                        
			System.out.println("El perimetro del rectangulo es: "
                                +ladoa +ladob +ladoc+ ladod);
		}
    } 
    
    private static Short perimetrorectangulo(short ladoa, short ladob,
            short ladoc, short ladod) {
	
		return (short) (ladoa+ ladob + ladoc + ladod);
	}
}
    