// Write a Java program to reverse an array using traversal.

package Traversing;

import java.util.Arrays;  
public class Ques6 {
    public static void main(String[] args){
        int[] arr = { 5, 10, 15, 20, 25 };

        for(int u = arr.length - 1; u >= 0; u--){
            System.out.print(arr[u] + " ");
        }

        System.out.println("\nOriginal Array: " + Arrays.toString(arr));
    }
}
