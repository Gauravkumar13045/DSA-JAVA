// Implement Insertion Sort in Ascending Order on an integer array.

package InsertionSort;

import java.util.Arrays;

public class Ques36 {
    public static void main(String[] args) {
        int[] arr = { 6, 3, 5, 8, 2, 0 };

        for (int i = 1; i < arr.length; i++) {
            int sort = arr[i];
            int u;

            for (u = i - 1; u >= 0 && sort < arr[u]; u--) {
                arr[u + 1] = arr[u];
            }
            arr[u + 1] = sort;

        }
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));

    }
}
