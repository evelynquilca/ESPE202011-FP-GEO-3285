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
public class Searcher {
     public int  findInteger(String[] Integers, String dataIntegers, String searchInteger) {
    
        int n = Integers.length;
        for (int i = 0; i < n; i++) {
            if (Integers[i] == null ? dataIntegers == null : Integers[i].equals(dataIntegers)) {
                
                return i;
            }
        }
        return -1;
    }
}
