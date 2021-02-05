/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws11recursion;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class WS11Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // DONE

        Scanner scanner = new Scanner(System.in);
        int variable1;
        int variable2;
        int multiplication;
        int sum;
        float division;
        int module;
        int table1;
        int table2;
        char option;

        do {
            System.out.println("==HELLO== ");
            System.out.println("Enter the variable 1: ");
            variable1 = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter the variable 2: ");
            variable2 = scanner.nextInt();
            scanner.nextLine();

            if (variable1 % 2 == 0 && variable2 % 2 == 0) {
                showMultiplication(variable1, variable2);

            } else if (variable1 % 3 == 0 && variable2 % 3 == 0) {
                showAddition(variable1, variable2);

            } else if (variable1 % 7 == 0 && variable2 % 7 == 0) {
                showModules(variable1, variable2);

            } else if (variable1 % 11 == 0 && variable2 % 11 == 0) {
                for (int i = 1; i <= 12; i++) {
                    table1 = variable1 * i;
                    System.out.println(variable1 + " * " + i + " = " + table1 + "\n");
                }
                for (int j = 1; j <= 12; j++) {
                    table2 = variable1 * j;
                    System.out.println(variable2 + " * " + j + " = " + table2 + "\n");
                }
            } else if (variable1 % 13 == 0 && variable2 % 13 == 0) {
                showDivision(variable1, variable2);

            } else {
                System.out.println("Invalid option");
            }

            System.out.println("<===TRY AGAIN===>?/ENTER ANY LETTER/ LATER (L)\"");
            option = scanner.nextLine().charAt(0);
            
        } while (option != 'L');
        System.out.println("<---Bye--->");
    }

    private static void showDivision(int variable1, int variable2) {
        float division;
        division = variable1 / variable2;
        System.out.println("The division of " + variable1 + " / " + variable2 + " = " + division);
    }

    private static void showModules(int variable1, int variable2) {
        int module;
        module = variable1 % variable2;
        System.out.println("The module of " + variable1 + " % " + variable2 + " = " + module);
    }

    private static void showAddition(int variable1, int variable2) {
        int sum;
        sum = variable1 + variable2;
        System.out.println("The sum of " + variable1 + " + " + variable2 + " = " + sum);
    }

    private static void showMultiplication(int variable1, int variable2) {
        int multiplication;
        multiplication = variable1 * variable2;
        System.out.println("The multiplication of " + variable1 + " * " + variable2 + " = " + multiplication);
    }
}        
    
    
