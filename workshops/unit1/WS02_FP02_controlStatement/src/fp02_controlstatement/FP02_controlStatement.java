/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp02_controlstatement;

import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class FP02_controlStatement {

    private static PrintStream System;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.println("    Please enter an integer --");
        int num = scanner.nextInt();
       if (num % 2 == 0) {
            System.out.prinln("   The number entered is even--" + num
            );
        } else {
            System.out.println("    the number entered is odd--" + num);
        }
    }
    
}
