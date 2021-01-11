/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw02_int;

/**
 *
 * @author hp
 */
public class HW02_INT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                try (Scanner leer = new Scanner(System.in)) {
			short ladoa=0, ladob=0,ladoc=0, ladod=0;
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
