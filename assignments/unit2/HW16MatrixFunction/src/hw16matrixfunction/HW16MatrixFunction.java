/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw16matrixfunction;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class HW16MatrixFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int [][] a;
        int [][] b;
        int [][] c;
        int m =0;
        int n=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the matrix dimesions");
        System.out.println("\n m->");
        m= input.nextInt();
        
        System.out.println("\n n->");
        n= input.nextInt();
        
        a= new int[m][n];
        b= new int[m][n];
        c= new int[m][n];
        
        
         System.out.println("------Enter the elements of the matrix-------");
         
         a=readMatrixElements(m, n, "A",input);
         b=readMatrixElements(m, n, "A",input);
         
         for(int tab=0; tab<= n/2; tab++){
           System.out.println("\t");   
         }
           System.out.println(" A");
           
           prettyPrintMatrix(m, n, a);
           System.out.println("");
           
           System.out.println(" B ");
            prettyPrintMatrix(m, n, b);
            
            
          for(int tab=0; tab<= n/2; tab++){
           System.out.println("\t");    
    }
         
         System.out.println("--The multiplication of matrices is--");
         
         c = multiplicationTwoMatrices(m, n, a, b);
          prettyPrintMatrix(m, n, c);
}

    public static int[][] readMatrixElements(int m, int n, String matrixName, Scanner input) {
        float [][] matrix;
        matrix=new int [m][n];
        for(int i=0; i< m; i++){
            System.out.println("--Row Numbers" + (i+1) + "--");
        for(int j=0; j< n; j++){
             System.out.print(matrixName + "[" + (i+1) + "][" + (j+1)+ "] ->");
             matrix[i][j] = input.nextFloat();
        }
        }
        return matrix;
        }


    public static int[][] multiplicationTwoMatrices(int m, int n, int[][] a, int[][] b) {
        int[][] c;
        c = new int [m][n];
        
        for(int i=0; i< m; i++){
            for (int j=0; j< n; j++){
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        return c;
    }

    public static void prettyPrintMatrix(int m, int n, int[][] matrix) {
        for (int i=0; i< m; i++){
            System.out.println("");
            for(int j=0; j< n; j++){
                if(j== 0){
                    if(i== 0){
                     System.out.println("\t");
                    }else if (i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)){
                    System.out.println("\t");
                }
                if ( j== (n - 1)){
                    if (i == 0){
                        System.out.println("\t");
                    } else if ( i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
    }
    public static void printMatrix(int m, int n, int[][] matrix){
        for (int i=0; i< m; i++){
            System.out.println("");
            for(int j=0; j< n; j++){
                if(j== 0){
                    if(i== 0){
                     System.out.println("\t");
                    }else if (i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
                System.out.println(matrix[i][j]);
                if (j > -1 && j < (n - 1)){
                    System.out.println("\t");
                }
                if ( j== (n - 1)){
                    if (i == 0){
                        System.out.println("\t");
                    } else if ( i == m - 1){
                        System.out.println("\t");
                        
                    }else{
                        System.out.println("\t");
                    }
                }
            }
        }
        System.out.println("");
     }
}
 
