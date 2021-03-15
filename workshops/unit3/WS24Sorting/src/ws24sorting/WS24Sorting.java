/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ws24sorting;

/**
 *
 * @author QUILCA EVELYN
 */
public class WS24Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

         int [] integersToSort = { 5 , 1 , 6 , 2 , 7 , 9 };

        System.out.println("Unsorted integers");
        printArray(integersToSort);
        sortByBubbleSort(integersToSort);
        System.out.println("");
        printArray(integersToSort);

         int [] integersToSort2 = { 9 , 3 , 4 , 8 , 5 };

        System.out.println("Unsorted integers");
        printArray(integersToSort2);
        sortByBubbleSort(integersToSort2);
        System.out.println("");
        printArray(integersToSort2);

    }

    public static void sortByBubbleSort(int integers[]) {

        //for (int i = 0; i < integers.length - 1; i++) {
        //
        //}
        int n = integers.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if(integers[j] > integers[j+1])
                {
                    //swap
                    temp = integers[j];
                    integers[j] = integers[j+1];
                    integers[j+1] = temp;

                }
                System.out.print("sorting --> ");
                printArray(integers);

            }
            System.out.println("");

        }


    }

    public static void printArray(int[] integers){
        int n = integers.length;
        for (int i = 0 ; i <n;i++){
            System.out.print(integers[i] + " , ");
        }
        System.out.println("");
    }

}
