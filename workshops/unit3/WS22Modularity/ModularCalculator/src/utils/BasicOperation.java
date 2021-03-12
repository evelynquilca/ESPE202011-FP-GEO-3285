/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

/**
 *
 * @author hp
 */
public class BasicOperation {
    
    //addition, multiplication, divisio, multiplication
    
    public static float addTwoNumbers(float addend1, float addend2){
        float sum=0;
        sum = addend1 + addend2;
        return sum;
    }

    public static float subtractTwoNumbers(float minuend, float subtrahend){
        float substraction=0;
        substraction = minuend - subtrahend;
        return substraction;
}
 
    public static float multiplyTwoNumbers(float multiplying, float multiplier){
        float multiplication=0;
        multiplication = multiplying * multiplier;
        return multiplication;
}
    
    public static float divideTwoNumbers(float dividend, float divisor){
        float quotient=0;
        quotient = dividend / divisor;
        return quotient;
}

}
