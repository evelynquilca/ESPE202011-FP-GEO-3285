/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw10functions;

import java.util.Scanner;

/**
 *
 * @author Quilca Evelyn
 */
public class HW10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

               Scanner input = new Scanner(System.in);
        int divd;
        int divr;
        float quotient = 0;
        int x = 0;
        int y = 0;
        int multiplicand;
        int result;
        int top = 12;
        
        System.out.println("AUTHOR: EVELYN QUILCA");
        System.out.println("Enter a number for divd -->");
        divd = input.nextInt();
        
        System.out.println("Enter a number for divr -->");
        divr = input.nextInt();
                
        
        quotient = showDivideTwoNumbers(divd, divr);

        System.out.println("Quotient is -> " + quotient);

        System.out.println("Enter a number for fuction -->");
        x = input.nextInt();
        y = showMultiplication(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);
        
        System.out.println("Enter a number for fuction -->");
        x = input.nextInt();
        y = showParabola(x);
        System.out.println("the value of -> " + x + " <- is equal to -> " + y);
        
        System.out.println("Enter number");
        multiplicand = input.nextInt();
        for (int multiplier = 1 ; multiplier <= top ; multiplier++){
            result = showTheMultiplicationTable (multiplicand, multiplier);
            System.out.println(multiplicand  + " x " + multiplier + " = " + result);
        }
}

    
    public static float showDivideTwoNumbers(int dividend, int divisor) {
        
        float quotient = 0.0F;

       
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int showMultiplication(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int showParabola(int x) {
        int y = 0;

        y = x * x + 3 * x + 1;

        return y;
    }
    
    public static int showTheMultiplicationTable(int multiplicand, int multiplier){
        int result;
        
        result = multiplicand*multiplier;
        
        return result;
    }

}
    
    

