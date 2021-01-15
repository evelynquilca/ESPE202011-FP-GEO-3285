/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw07menus;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW07Menus {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        boolean mainLoop = true;
        int option;

        do {
            System.out.println(" ========= Calculator =======");
            System.out.println("1. -> Additiot");
            System.out.println("2. -> Subtraction");
            System.out.println("3. -> Multiplication");
            System.out.println("4. -> Division");
            System.out.println("5. -> Exit");

            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1:
                    int addend1;
                    int addend2;
                    int sum;
                    System.out.println("enter addend 1 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 2 -> ");
                    addend2 = input.nextInt();
                    sum = addend1 + addend2;
                    System.out.println(" the Addition is -->" + sum);
                    break;
                case 2:
                     int addend3;
                    int addend4;
                    int difference;
                    System.out.println("enter addend 2 -> ");
                    addend1 = input.nextInt();
                    System.out.println("enter addend 3 -> ");
                    addend3 = input.nextInt();
                    difference = addend1 - addend3;
                    System.out.println("The subtraction is -->" + difference);
                    
                    break;
                case 3:
                    int addend5;
                    int addend6;
                    int product;
                    System.out.println("enter addend 5 -> ");
                    addend5 = input.nextInt();
                    System.out.println("enter addend 6 -> ");
                    addend6 = input.nextInt();
                    product = addend5 * addend6;
                    System.out.println("The Multiplication-->" + product);                    

                    break;
                case 4:
                    int addend7;
                    int addend8;
                    int quotient;
                    System.out.println("enter addend 7 -> ");
                    addend7 = input.nextInt();
                    System.out.println("enter addend 8 -> ");
                    addend8 = input.nextInt();
                    quotient= addend7 / addend8;
                    System.out.println("The Division -->" + quotient);    

                    break;
                case 5:
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option\n\n\n");
                    break;

            }

        } while (option != 5);

    }

}