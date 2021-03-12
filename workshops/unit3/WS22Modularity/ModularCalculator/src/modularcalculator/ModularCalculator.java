/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modularcalculator;

import java.util.Scanner;
import utils.BasicOperation;


/**
 *
 * @author hp
 */
public class ModularCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float operand1;
        float operand2;
        float result=0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter two numbers --> ");
        System.out.println("First Number --> ");        
        operand1 = input.nextFloat();
        System.out.println("Second Number --> ");        
        operand2 = input.nextFloat();
        
        System.out.println(" --- ADITION --- ");
        result= BasicOperation.addTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "+" + operand2 + "=" + result );
        
        System.out.println(" --- SUBSTRACTION --- ");
        result= BasicOperation.subtractTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "-" + operand2 + "=" + result );
        
        System.out.println(" --- MULTIPLICATION --- ");
        result= BasicOperation.multiplyTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "*" + operand2 + "=" + result );
        
        System.out.println(" --- DIVISION --- ");
        result= BasicOperation.divideTwoNumbers(operand1, operand2);
        System.out.println(operand1 + "/" + operand2 + "=" + result );
        
    }
    
}
