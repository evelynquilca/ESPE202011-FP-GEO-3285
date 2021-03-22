/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18search;

import static java.util.Arrays.binarySearch;
import java.util.Scanner;

/**
 *
 * @author QUILCA EVELYN
 */
public class HW18Search {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        int [] phonePrice = {150, 160, 200, 280, 300, 960, 430, 120, 220};
        int phone;
        int search;
        int binarySearch;
        
        Scanner input = new Scanner(System.in);
        System.out.println(" QUILCA EVELYN ");
        System.out.println(" ");
        System.out.println("--- L I N E A R  S E A R C H --- ");
        System.out.println(" ");
        
        System.out.println(" Enter the Phone Price ");
        phone= input.nextInt();
        System.out.println("the phone price " + phone + " the price of the phone is in the range: "+ search(phonePrice, phone));
        
               
        System.out.println("--- B I N A R Y  S E A R C H --- ");
        System.out.println(" ");
        
        System.out.println(" Enter the phone price ");
        phone= input.nextInt();
        System.out.println("the phone price " + phone + " the price of the phone is in the range: "+ binarySearch(phonePrice, phone));
    }
}
