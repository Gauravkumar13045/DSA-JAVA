// Sort array in ascending order using Bubble Sort
package BubbleSort;

import java.util.Arrays;

public class Ques24 {
    public static void main(String[] args) {
        int[] arr = { 35, 90, 20, 80, 25, 40, 19 };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int u = 0; u < arr.length - 1 - i; u++) {
                if (arr[u] > arr[u + 1]) {
                    int big = arr[u];
                    arr[u] = arr[u + 1];
                    arr[u + 1] = big;

                }

            }

        }

        System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));
    }
}
