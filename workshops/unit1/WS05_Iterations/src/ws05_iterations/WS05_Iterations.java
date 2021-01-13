/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws05_iterations;

/**
 *
 * @author hp
 */
public class WS05_Iterations {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        i= 0;
        
        System.out.println("==== This is a while loop from 1 to 10 ====");
        
        while ( i<10 ){
            System.out.println("i -->" +(i+1));
            //i += 1;
            i++;
            //i=i+1
        }
        
        System.out.println("First 5 even numbers");
        i=2;
  
        System.out.println("Firs 5 odd numbers");
        
        for(int j=1 ; j < 10 ; j+=2){
            System.out.println("odd number ->"+ j);
        }
        System.out.println("Multiplication Tables : 7");
        int top=12;
        int product=0;
        int table=7;
        for (int j= 1 ; j<= top ; j++){
            product = table * j;
            System.out.println("7 *" + j + " = " + product);
            
    
        }
    }
    
}
