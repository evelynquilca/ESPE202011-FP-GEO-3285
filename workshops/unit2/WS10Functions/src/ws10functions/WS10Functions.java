/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws10functions;

/**
 *
 * @author Quilca Evelyn
 */
public class WS10Functions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int divd = 6;
        int divr = 12;
        float quotient = 0;
        int x = 0;
        int y = 0;

        //call to divideTwoNumbers() function
        quotient = divideTwoNumbers(divd, divr);

        System.out.println("Quotient of 6 and 12 is -> " + quotient); //0.6 or ?

        y = f(4);
        System.out.println("4^2 -> " + y);

        y = f(-4);
        System.out.println("-4^2 -> " + y); //16
        
        x = -1;
        y = f(x);
        System.out.println("the square of -> " + x + " <- is equal to -> " + y);

    }

    //function definition
    //return data type    name     parameter1   parameter2
    public static float divideTwoNumbers(int dividend, int divisor) {
        //body of the function
        float quotient = 0.0F;

        //             6        12   -> 0.6
        // float     int        int
        quotient = (float) dividend / (float) divisor;

        return quotient;
    }

    public static int f(int x) {
        int y = 0;

        y = x * x;

        return y;
    }

    public static int g(int x) {
        int y = 0;

        y = x * x + 2 * x + 1;

        return y;
    }

}