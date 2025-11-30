// Sort array in descending order using Bubble Sort
package BubbleSort;

import java.util.Arrays;

public class Ques25 {
    public static void main(String[] args) {
        int[] arr = { 23, 52, 95, 45, 85, 65 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int u = 0; u < arr.length - i - 1; u++) {
                if (arr[u] < arr[u + 1]) {
                    int big = arr[u];
                    arr[u] = arr[u + 1];
                    arr[u + 1] = big;
                }

            }

        }
        System.out.println("Sorted Array (Decending): " + Arrays.toString(arr));

    }
}
