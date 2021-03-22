/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class basicSearch {
    public int search(int elements[], int x){
        int n = elements.length;
        for (int i=0; i < n; i++){
            if (elements[i] == x)
                return i;
        }
        return -1;
    }         
}

    

