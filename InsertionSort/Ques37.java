// Implement Insertion Sort in Descending Order.

package InsertionSort;

import java.util.Arrays;

public class Ques37 {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 7, 5 };

        for (int i = 1; i < arr.length; i++) {
            int sort = arr[i];
            int u;

            for (u = i - 1; u >= 0 && sort > arr[u]; u--) {
                arr[u + 1] = arr[u];

            }
            arr[u + 1] = sort;

        }

        System.out.println("Sorted Array (Decending): " + Arrays.toString(arr));

    }
}
