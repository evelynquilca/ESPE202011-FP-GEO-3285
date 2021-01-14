/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws03iterations;

/**
 *
 * @author hp
 */
public class WS03Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int i;
        i = 0;

        System.out.println("==== This is a while loop from 1 to 33 ====");

        while (i < 33) {
            System.out.println("i -> " + (i + 1));
     i++;
     
    }
        
    System.out.println("Multiplication Tables : 33");
        int top=12;
        int product=0;
        int table = 33;
        for (int e = 1 ; e <= top ; e++){
            product = table * e;
            System.out.println("33 * " + e + " = " + product);
        }
        
    System.out.println("Multiplication table : 25");    
        int top =25;
        int product=0;
        int table = 25;       
        for (int x = 1; x <= top; x++){
            product = table * x;
            System.out.println("25 * " + x + " = " + product);
        }

    }
    

