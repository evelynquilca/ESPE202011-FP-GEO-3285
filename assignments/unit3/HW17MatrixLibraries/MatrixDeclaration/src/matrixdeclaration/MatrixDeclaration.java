/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrixdeclaration;

import static ec.edu.espe.matrix.BasicMatrix.addTwoMatrices;
import static ec.edu.espe.matrix.BasicMatrix.prettyPrinMatrix;
import static ec.edu.espe.matrix.BasicMatrix.readMatrix;
import static ec.edu.espe.matrix.BasicMatrix.subtractionTwoMatrices;
import static ec.edu.espe.matrix.BasicMatrix.transpose;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class MatrixDeclaration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int columns;
        int rows;
        float[][] matrixA;
        float[][] matrixB;
        float[][] t;
        float[][] matrixC;
        Scanner input = new Scanner(System.in);
        
        System.out.println("--- Evelyn Quilca Matrix --- ");
        System.out.println(" Enter the Matrix Dimentions--> ");
        System.out.print("\n columns ---> ");
        rows = input.nextInt();

        System.out.print("\n rows ---> ");
        columns = input.nextInt();

        matrixA = new float[rows][columns];
        matrixB = new float[rows][columns];
        matrixC = new float[rows][columns];
        t = new float[rows][columns];

        System.out.println(" Enter the elements of the matrix ");
        matrixA = readMatrix(rows, columns, "Matrix A", input);
        matrixB = readMatrix(rows, columns, "Matrix B", input);

        for (int tab = 0; tab <= rows / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("--> Matrix A");

        prettyPrinMatrix(rows, columns, matrixA);
        System.out.println("");

        System.out.println("--> Matrix B");

        prettyPrinMatrix(rows, columns, matrixB);
        System.out.println("");

        transpose(columns, rows, t, matrixA);

        for (int tab = 0; tab <= rows / 2; tab++) {
            System.out.println("\t");
        }
        System.out.println("The Transpose of matrice is -->");

        prettyPrinMatrix(rows, columns, t);

        System.out.println("");
        System.out.println(" The subtraction of matrices is -->");
        matrixC = subtractionTwoMatrices(rows, columns, matrixA, matrixB);

        prettyPrinMatrix(rows, columns, matrixC);

        System.out.println("");
        System.out.println(" The sum of matrices is -->");

        matrixC = addTwoMatrices(rows, columns, matrixA, matrixB);

        prettyPrinMatrix(rows, columns, matrixC);

        System.out.println("");

        System.out.println("GOOD BYE");

    }

}
  