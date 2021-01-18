/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw04menus;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW04Menus {

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
            System.out.println("1. -> The perimeter of a rectangle");
            System.out.println("2. -> The perimeter of a square");
            System.out.println("3. -> The area of a rectangle");
            System.out.println("4. -> The area of a square");
            System.out.println("5. -> GoodBye");
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1 -> {
                    int L1;
                    int L2;
                    int L3;
                    int L4;
                    int perimeter;
                    System.out.println("enter L 1 -> ");
                    L1 = input.nextInt();
                    System.out.println("enter L 2 -> ");
                    L2 = input.nextInt();
                    System.out.println("enter L 3 -> ");
                    L3 = input.nextInt();
                    System.out.println("enter L 4 -> ");
                    L4 = input.nextInt();                    
                    perimeter = L1 + L2 + L3 + L4;
                    System.out.println(" the perimeter of rectangle is -->" +
                            perimeter);
                }
                case 2 -> {
                    int L5;
                    int L6;
                    int L7;
                    int perimeter2 = 0;
                    System.out.println("enter L 5 -> ");
                    L5 = input.nextInt();
                    System.out.println("enter L 6 -> ");
                    L6 = input.nextInt();
                    System.out.println("enter L 7 -> ");
                    L7 = input.nextInt();
                    int perimeter = L5 + L6 + L7;
                    System.out.println("The perimeter of square is -->" + 
                            perimeter2);
                }
                case 3 -> {
                    int base;
                    int altura;
                    int area;
                    System.out.println("enter base -> ");
                    base = input.nextInt();
                    System.out.println("enter altura -> ");
                    altura = input.nextInt();
                    area = base * altura;
                    System.out.println("The area of rectangle is-->" + area);
                }
                case 4 -> {
                    int base2;
                    int altura2;
                    int area2;
                    System.out.println("enter base -> ");
                    int base = input.nextInt();
                    System.out.println("enter altura -> ");
                    int altura = input.nextInt();
                    int area = (base * altura) / 2;
                    System.out.println("The area of square is -->" + area);
                }
                case 5 -> {
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option\n\n\n");

            }

        } while (option != 5);

    }

}

