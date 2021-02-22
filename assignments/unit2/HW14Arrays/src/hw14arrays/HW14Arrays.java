/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw14arrays;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW14Arrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do { 
        System.out.println("        WELCOME TO MENU     ");            
        System.out.println("-------  1. Ages of Students -------");
        System.out.println("------- 2. Gaseous Brands -------");
        System.out.println("------- 3. Exit -------  ");        
        System.out.println("Enter you menu option -->");
            option = input.nextInt(); 
            switch (option) {

                case 1 -> {            
        int[] agesStudents;
        String[] student = {"Alexandra Sanchez", "Alex Farinango", 
            "Alex Amaguaña", "Neyder Ichau", "Roberto Molina", "Martiza Espin",
            "Judy Morocho", "Naydelin Rivadeneira", "Melany Shiñin","Keyli Quilca"};

        
        int n;
        System.out.println("Enter the name of the students -> ");
        n = input.nextInt();

        agesStudents = new int[n];
        
//        age[0] = 17;
//        age[1] = 19;
//        age[2] = 15;
//        age[3] = 16;
//        age[4] = 15;
//        age[5] = 17;
//        age[6] = 19;
//        age[7] = 15;
//        age[8] = 19;
//        age[9] = 18;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the age " + (i + 1) + " -> ");
            agesStudents[i] = input.nextInt();
        }

        for (int ages : agesStudents) {
            System.out.println("the ages of the students are " + ages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("number of students " + (i + 1) + " -> " + agesStudents[i]);
        }

        for (String students : student) {
            System.out.println("students name -> " + students);
        }
        
    }
                case 2 -> {                

        int[] gaseousBrand;
        String[] gaseous = {"Coca Cola", "Big Cola", 
            "Tropical", "Inka Cola", "Pepsi"};

        int n;
        System.out.println("prices of different brands -> ");
        n = input.nextInt();

        gaseousBrand = new int[n];
        
//        gaseous[0] = 1;
//        gaseous[1] = 0.50;
//        gaseous[2] = 1;
//        gaseous[3] = 0.75;
//        gaseous[4] = 1;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter the name of the gaseous " + (i + 1) + " -> ");
            gaseousBrand[i] = input.nextInt();
        }

        for (int gaseous : gaseousBrand) {
            System.out.println("the prices of the gaseous " + gaseous);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("number of the gaseous " + (i + 1) + " -> " + gaseousBrand[i]);
        }

        for (String prices : gaseous) {
            System.out.println("students name -> " + prices);
        }
                }
                case 3 -> {
                    System.out.println("------- Good Bye -------");
                    System.exit(0);
               }

                default -> System.out.println("Invalid option\n\n\n");

            }
        } while (option != 3);
    }  
}
        

       


