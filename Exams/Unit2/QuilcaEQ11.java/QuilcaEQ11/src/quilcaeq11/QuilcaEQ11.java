/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quilcaeq11;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class QuilcaEQ11 {

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
            System.out.println("1. -> Sum of 5 integers ");
            System.out.println("2. -> Average ");
            System.out.println("3. -> Matrix");           
            System.out.println("4. -> GoodBye");
            
            System.out.println("Enter your menu option --> ");
            option = input.nextInt();

            switch (option) {

                case 1 -> {
                    computeSumOf5Numbers();

}
               case 2 -> {

                    computeAverage();
    }

                case 3 -> {
                    int array[]= new int [] ( 12,23,34,98,87,65,0);
                    for (i=0 ; i <7 ; i ++){
                    System.out.print("12,23,34,98,87,65,0");
    }
                }
                case 4 -> {
                    System.out.println("Good Bye my friend");
                    System.exit(0);
                }
                default -> System.out.println("Invalid option\n\n\n");

            }

        } while (option != 7);

    }        

    private static void computeAverage() {
        int i ;
        float sum=0;
        float prom=3;
        Scanner sc=new Scanner(System.in);
        int[ ] a = new int[3];
        
        for (i=0 ; i <3 ; i ++){
            System.out.println("Enter the int in the position: "+(i+1));
            
            a[i]=sc.nextInt();
        }
        for ( i = 0; i < a.length; i++) {
            sum =sum + a[i];
            
            prom = sum / a.length;
        }
        System.out.println("The average is: "+prom);
    }

    private static void computeSumOf5Numbers() {
        int i;
        int sum=0 ;
        Scanner sc=new Scanner(System.in);        
        
        int[ ] a = new int[5];
        
        for (i=0 ; i <5 ; i ++){
            System.out.println("Enter the interger : "+(i+1));
            
            a[i]=sc.nextInt();
        }
        for ( i = 0 ; i<5;i++){
            sum=sum+a[i];
            
        }
        System.out.println("The sum is: "+sum);
    }
    }
    

