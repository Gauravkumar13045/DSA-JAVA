//   Perform Selection Sort in Descending Order
package SelectionSort;

import java.util.Arrays;

public class Ques30 {
    public static void main(String[] args) {
        int[] arr = { 23, 52, 95, 45, 85, 65 };

        for (int i = 0; i < arr.length - 1; i++) {
            int sort = i;
            for (int u = i + 1; u < arr.length; u++) {
                if (arr[sort] < arr[u]) {
                    sort = u;
                }

            }

            int dec = arr[i];
            arr[i] = arr[sort];
            arr[sort] = dec;
        }
        System.out.println("Sorted Array (Descending): " + Arrays.toString(arr));

    }
}
