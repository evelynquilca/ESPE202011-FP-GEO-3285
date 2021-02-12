/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws13task;

import java.util.Scanner;

/**
 *
 * @author Evelyn Quilca
 */
public class WS13Task {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;
        
        do{
            System.out.println("====== Calculator ======");
            System.out.println("1. -> The area of a circle");
            System.out.println("2. -> The area of a pentagono ");
            System.out.println("3. -> The area of a triangle");
            System.out.println("4. -> The calculate speed");
            System.out.println("5. -> The calculate dezplazamiento");
            System.out.println("6. -> The calculate final speed");            
            System.out.println("7. -> GoodBye");
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1 -> {
                    showAreaCircle();
                }
                case 2 -> {
		    showAreaPentagono(input);
			                                                
                }

                case 3 -> {
                    showAreaTriangle(input);
    }
                
                case 4 -> {
                    computeSpeed(input);
                    
                }
                case 5 -> {
                    computeDezplazamiento(input);                    
                    
                }

                case 6 ->{
                    computeFinalSpeed(input);
                }
            
                case 7 -> {
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option\n\n\n");

            }

        } while (option != 7);

    }

    private static void computeFinalSpeed(Scanner input) {
        double vf;
        double vo;
        double g;
        double t;
        double result;
        System.out.println("Formule: Vf = Vo - g*t");
        System.out.println("Ingresa vf");
        vf = input.nextDouble();
        System.out.println("Ingresa vo");
        vo = input.nextDouble();
        System.out.println("Ingresa g");
        g = input.nextDouble();
        System.out.println("Ingresa t");
        t = input.nextDouble();
        
        result= (vo - (g*t));
        
        System.out.println(" The final speed is -->");
        System.out.println("vf=" + vo + "-" + g + "*" + t);
        System.out.println("vf=" + result);
    }

    private static void computeDezplazamiento(Scanner input) {
        double vo;
        double t;
        double a;
        double result;
        System.out.println("Formula: x = vo*t + 1/2 a * t^2 ");
        System.out.println("Ingresa vo");
        vo = input.nextDouble();
        System.out.println("Ingresa t");
        t = input.nextDouble();
        System.out.println("Ingresa a");
        a = input.nextDouble();
        result = ((vo * t) + (a / 2) * (t * t));
        System.out.println(" ");
        System.out.println("The desplazamiento is -->");
        System.out.println("x = " + vo + "*" + t + " + 1/2 *" + a + " * " + t + "^2");
        System.out.println("x = " + result);
    }

    private static void computeSpeed(Scanner input) {
        int distance;
        int time;
        int speed;
        System.out.println("Enter the distance");
        distance= input.nextInt();
        System.out.println("Enter the time");
        time= input.nextInt();
        
        speed= distance / time;
        System.out.println("The speed is --> " + speed );
    }

    private static void showAreaTriangle(Scanner input) {
        double base;
        double altura;
        double result;
        
        System.out.print("Enter the base ");
        base = input.nextDouble();
        
        System.out.print("Enter the altura ");
        altura = input.nextDouble();
        
        result = ((base*altura)/2);
        
        System.out.print("The area of triangle is " + result);
    }

    private static void showAreaPentagono(Scanner input) {
        double radio;
        double lado;
        double apotema;
        double area;
        System.out.println("Enter the lado of pentagono");
        lado = input.nextDouble();
        
        System.out.println("Enter the radio of pentagono");
        radio = input.nextDouble();
        
        System.out.println("Enter the apotema of pentagono");
        apotema = input.nextDouble();
        
        if ((radio == 0) && (apotema == 0)){
            area = 1.72048 * Math.pow(lado,2);
        } else if (apotema == 0) {
            apotema = Math.sqrt(Math.pow(radio, 2)-Math.pow(lado/2, 2));
            area = ((lado*5)*apotema)/2;
        } else {
            area = ((lado*5)*apotema)/2;
        }
        
        System.out.println("The área of pentagono is -->" + area);
    }

    private static void showAreaCircle() {
        double area;
        double radio = 0.4;
        
        area = Math.PI * Math.pow(radio, 2);
        System.out.printf("\nEl área del circulo de radio %.2f es %.2f.", radio, area);
    }

}

