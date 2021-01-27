/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyect;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Proyect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do{
            System.out.println("====== Calculator ======");
            System.out.println("1. -> The distance");

            System.out.println("2. -> GoodBye");
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1 -> {
                    int speed;
                    int weather;
                    int distance;
                    System.out.println("enter speed -> ");
                    speed = input.nextInt();
                    System.out.println("enter weather -> ");
                    weather = input.nextInt();                   
                    distance = weather * speed ;
                    System.out.println(" the distance is -->" +
                            distance);
                }
                               case 5 -> {
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option\n\n\n");

            }

        } while (option != 2);

    }
    }

double cateto1 = x – parametros.getX();
double cateto2 = y – parametros.getY();
double hipotenusa = Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
return hipotenusa;


Punto p1 = new Punto(1.5,2.5);
Punto p2 = new Punto(3.5,5.0);

//calculo de la distancia entre dos puntos
double distancia = p1.calcularDistanciaDesde(p2);
System.out.println(“La distancia de p1 a p2 es: ” + distancia);
}

}

