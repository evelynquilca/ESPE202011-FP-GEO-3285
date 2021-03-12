/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws21functions;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class WS21Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            int rice1;
            int rice2;
            int time1;
            int time2;
            double gradeC;
            double gradeF;
            char option = 0;            
            do{
            System.out.println("AUTHOR: EVELYN QUILCA");
            System.out.println(" R A N G E R S : ");
            System.out.println(" ");
            
            computeOvenDegrees(input);
            
            computeCookinTime(input);
            
        } while (option != 'L');
        System.out.println("<---Bye--->");
    
     }
    }

    private static void computeCookinTime(Scanner input) {
        int rice1;
        int rice2;
        int time1;
        int time2;
        System.out.println("Cookin time of a rice");
        System.out.println("Enter the value of the rice1: ");
        rice1 = input.nextInt();
        System.out.println("Enter the value of the rice2: ");
        rice2 = input.nextInt();
        System.out.println("Enter the value of the time1: ");
        time1 = input.nextInt();
        time2 = ( rice2 * time1 ) / rice1;
        System.out.println("Value of the time2 is = " + time2);
    }

    private static void computeOvenDegrees(Scanner input) {
        double gradeC;
        double gradeF;
        System.out.println("Oven Degrees");
        System.out.println("Enter degrees centidrade:");
        gradeC = input.nextDouble();
        gradeF = 32 + (9 * gradeC / 5);
        System.out.println(gradeC +" ºC = " + gradeF + " ºF");
    }
}