/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayquiz.pkg22.pkg02.pkg21;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class ArrayQuiz220221 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner input = new Scanner(System.in);
        
        boolean mainLoop = true;
        int option;

        do { 
        System.out.println("        WELCOME TO MENU     ");            
        System.out.println("-------  1. CANDIDATES WITH VOTES PERCENTAGE -------");
        System.out.println("------- 2. Exit -------  ");        
        System.out.println("Enter you menu option -->");
            option = input.nextInt(); 
            switch (option) {

                case 1 -> {            
        int[] candidatesName;
        String[] candidates = {"Andres Arauz", "Yaku Perez", 
            "Guillermo Lasso", "Xavier Hervas", "Pedro Freile", "Isidro Romero",
            "Lucio Gutierrez", "Gerson Almeida", "Ximena Peña","Guillermo Celi"};
        float[] percentageOfCandidates = { 32.7F, 19.74F, 19.38F, 15.69F, 2.08F, 1.86F, 1.78F, 1.73F, 1.54F, 0.91F};
        
        int n;
        System.out.println("Enter the number of the candidates -> ");
        n = input.nextInt();

        candidatesName = new int[n];
        
//        percentege[0] = 32.7;
//        percentege[1] = 19,74;
//        percentege[2] = 19.38;
//        percentege[3] = 15.69;
//        percentege[4] = 2.08;
//        percentege[5] = 1.86;
//        percentege[6] = 1.78;
//        percentege[7] = 1.73;
//        percentege[8] = 1.54;
//        percentege[9] = 0.91;

        for (String candidates : candidates) {
            System.out.println("candidates name -> " + candidates);
        }
        for (int i = 0; i < percentageOfCandidates.length ; i++) {
            System.out.println("percentage of candidates " + (i + 1) + " -> " + percentageOfCandidates[i]);        
    }
                }
                case 2 -> {
                    System.out.println("------- Good Bye -------");
                    System.exit(0);
               }

                default -> System.out.println("Invalid option\n\n\n");

            }
        } while (option != 2);
    }  
}
            
