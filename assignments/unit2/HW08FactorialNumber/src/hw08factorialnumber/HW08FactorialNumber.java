/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw08factorialnumber;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW08FactorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int factorial =1;
        int number;
        factorial=1;
        
        do{
            System.out.println("---Factorial Calculator---");            
            System.out.println("Enter number");
            System.out.println("Exit");
        
        
         Scanner input = new Scanner(System.in);
         number=input.nextInt();
         
         if (number <= 15 && number>=0){
                  System.out.println("The factorial number of -->" + number);
                  for (int i=number; i > 0 ; i--) {
                      factorial = factorial * i;
                      
                  }
                  System.out.println("The factorial number is --> " + factorial);
                  
    }
         
        
    } while(number <=15 && number>=0 );
    
    System.out.println("Good Bye");
                         
    }
    
}
