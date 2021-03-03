/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quishpet11;

import static quishpet11.QuishpeT11.search;

/**
 *
 * @author hp
 */
public class QuishpeT11 {

    /**
     * @param args
     */
    public static void main(String[] args) {
          float average, total = 0;  
		for (int i = 0; i < array.length; i++) {
			total = total + array[i];
		}	
		average = total / array.length; 
		return average; 
	}

	public static String search (int [] array, int value){
		for(int i = 0; i < array.length; i++) {
			if (array[i] == value) {
				String answer = "The value " + value + " is in the position " + (i+1) + ".";
				return answer; 
			} 
		}
		String answer2 = "The value is not in this array. Please, try again.";
		return answer2;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		// Arrays: 
		int [] array1 = new int[5]; 
		float [] array2 = new float[3];
		int [] array3 = {12, 23, 34, 98, 87, 65, 0};
		// Input data in array1 and array2: 
		for (int i = 0; i < array1.length; i++) {
			System.out.println("Input the integer " + (i+1) + " in the array1: ");
			array1[i] = input.nextInt();
		}
		System.out.println("");
		for (int i = 0; i < array2.length; i++) {
			System.out.println("Input the float " + (i+1) + " in the array2: ");
			array2[i] = input.nextFloat();
		}
		System.out.println("");
		float averageFloatArray = average(array2);
		System.out.println("The average of the elements in the array 2 is: " + averageFloatArray);
		
		System.out.println("");
		System.out.println("Input a value (integer) to search in the array 3: ");
		int numberToSearch = input.nextInt();
		System.out.println(search(array3, numberToSearch));
		input.close();
    }
    
}
