// Count total number of shifts and comparisons in Insertion Sort.

package InsertionSort;

import java.util.Arrays;

public class Ques38 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 7, 5 };
        int comparisons = 0;
        int shifts = 0;

        for (int i = 1; i < arr.length; i++) {
            int sort = arr[i];
            int u;

            for (u = i - 1; u >= 0; u--) {
                comparisons++;
                if (arr[u] > sort) {
                    arr[u + 1] = arr[u];
                    shifts++;
                } else {
                    break;
                }

            }

            arr[u + 1] = sort;

        }
        System.out.println("Total Comparisons: " + comparisons);
        System.out.println("Total Shifts: " + shifts);
        System.out.println("Sorted Array (Decending): " + Arrays.toString(arr));

    }
}