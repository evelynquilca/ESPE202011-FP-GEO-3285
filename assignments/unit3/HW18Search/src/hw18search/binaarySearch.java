/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw18search;

/**
 *
 * @author hp
 */
public class binaarySearch {
    
    public int binarySarch(int elements[], int left, int right, int x) {
        int n = elements.length;
        if (right >= left) {
            int mid = left + (right - left) / 2;
            if (elements[mid] == x) {
                return mid;
            }

            if (elements[mid] > x) {
                return binarySearch(elements, left, mid - 1, x);
            }

            return binarySearch(elements, mid + 1, right, x);

        }
        return -1;
    }
}

