/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw15matrixoperation;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hp
 */
public class HW15MatrixOperation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println(" CALCULATOR MATRIX MULTIPLICATION ");
        System.out.println("Enter the number of rows of the matrix ->");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns of the matrix ->");
        int n = scanner.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];

        
        System.out.println("Data: matrix A -> ");
        for (int i = 0; i < m; i++) {                   
            for (int j = 0; j < n; j++) {
                a[i][j] = scanner.nextInt();
                System.out.print("a [ " + (i + 1) + "] [ " + (j + 1) + "] :" );
                a[i][j]= scanner.nextInt();

            }
        }
        System.out.println("Data: matrix B -> ");
        for (int i = 0; i < m; i++) {                    
            for (int j = 0; j < n; j++) {
                b[i][j] = scanner.nextInt();
                System.out.print("b [ " + (i + 1) + "] [ " + (j + 1) + "] :" );
                 b[i][j]= scanner.nextInt();
            }
        }
        System.out.println("Multiplication of the two matrix is -> ");
        for (int i = 0; i < m; i++) {
            
        
            for (int j = 0; j < n; j++) {
                c[i][j] = a[i][j] * b[i][j];
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }
        
    }