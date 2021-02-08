/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw11recursionexample;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW11RecursionExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
       int Exponent;
       int Index ;
       
            System.out.println("<------ CALCULATOR ------>");


            System.out.println("Enter to Index");
            Index = input.nextInt();
            System.out.println("Enter to Exponent");
            Exponent = input.nextInt();
            int Result = (int) Math.pow(Index, Exponent);

            System.out.println(Index + " Raised to the " + Exponent + 
                    " is equal to " + Result);

            System.out.println("Good Bye");
    }
}
