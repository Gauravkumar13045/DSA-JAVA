// Insert a new element into an already sorted array using Insertion Sort logic.
package InsertionSort;

import java.util.Arrays;

public class Ques39 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6, 7 };
        int[] newArr = new int[arr.length + 1];
        int target = 4;
        int i = 0, j=0;

        while(i < arr.length && arr[i] < target){
            newArr[j++] = arr[i++];
        }

        newArr[j++] = target;
        while(i < arr.length){
            newArr[j++] = arr[i++];
        }

      
        System.out.println("Array after insertion: " + Arrays.toString(newArr));

    }
}
