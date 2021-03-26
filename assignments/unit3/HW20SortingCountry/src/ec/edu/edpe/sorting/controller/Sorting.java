/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.edpe.sorting.controller;

/**
 *
 * @author hp
 */
public class Sorting {
    public static String[] sort(String[] Integers) {
  
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5 - j; i++) {
                if (Integers[i].compareTo(Integers[i + 1]) > 0) {
                    String aux;
                    aux = Integers[i];
                    Integers[i] = Integers[i + 1];
                    Integers[i + 1] = aux;
                }
            }
        }
        return Integers;
    }
}
    
