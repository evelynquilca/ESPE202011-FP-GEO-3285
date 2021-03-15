/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.matrix;

import java.util.Scanner;

/**
 *
 * @author QUILCA EVELYN
 */
public class BasicMatrix {
    
public static float[][] subtractionTwoMatrices(int columns, int rows, float[][] matrixA, float[][] matrixB) {
        float[][] matrixC;
        matrixC = new float[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrixC[i][j] = matrixA[i][j] - matrixB[i][j];
            }
        }
        return matrixC;

    }

    public static float[][] readMatrix(int columns, int rows, String matrixName, Scanner input) {
        float[][] matrix;
        matrix = new float[columns][rows];
        for (int i = 0; i < columns; i++) {
            System.out.println("---ROW Numbers " + (i + 1) + "---");
            for (int j = 0; j < rows; j++) {
                System.out.print(matrixName + "[" + (i + 1) + "] [" + (j + 1) + "] -> ");
                matrix[i][j] = input.nextFloat();
            }
        }
        return matrix;
    }

    public static void transpose(int rows, int columns, float[][] t, float[][] matrixA) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                t[i][j] = matrixA[j][i];
            }
        }

    }

    public static float[][] addTwoMatrices(int columns, int rows, float[][] matrixA, float[][] matrixB) {
        float[][] matrixc;
        matrixc = new float[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                matrixc[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixc;
    }

    public static void prettyPrinMatrix(int columns, int rows, float[][] matrix) {
        for (int i = 0; i < columns; i++) {
            System.out.println("");
            for (int j = 0; j < rows; j++) {
                if (j == 0) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == columns - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print("\t");
                    }
                }
                System.out.print(matrix[i][j]);
                if (j > -1 && j < (rows - 1)) {
                    System.out.print("\t");
                }
                if (j == (rows - 1)) {
                    if (i == 0) {
                        System.out.print("\t");
                    } else if (i == columns - 1) {
                        System.out.print("\t");
                    } else {
                        System.out.print(" \t");
                    }
                }
            }
        }
        System.out.print("");
    }

}