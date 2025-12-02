// Perform Selection Sort in Ascending Order
package SelectionSort;

import java.util.Arrays;

public class Ques29 {
    public static void main(String[] args) {
        int[] arr = { 23, 52, 95, 45, 85, 65 };

        for (int i = 0; i < arr.length-1; i++) {
            int small = i;
            for (int u = i + 1; u < arr.length; u++) {
                if (arr[small] > arr[u]) {
                    small = u;
                }
            }
            int sort = arr[i];
            arr[i] = arr[small];
            arr[small] = sort;

        }
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));

    }
}
