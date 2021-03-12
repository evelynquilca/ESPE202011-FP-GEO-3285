/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.taxes;

/**
 *
 * @author hp
 */
public class BasicTax {
    
    public static float computeIva(Float basePrice, float percentegeValue){
        float iva;
        iva= basePrice * percentegeValue /100;
        return iva;
         
    }
}
