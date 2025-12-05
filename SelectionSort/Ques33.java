// Use Selection Sort to sort a String array (A → Z)

package SelectionSort;

import java.util.Arrays;

public class Ques33 {
    public static void main(String[] args) {
        String[] arr = { "A", "K", "E", "P", "D" };

        for (int i = 0; i < arr.length-1; i++) {
            int sort = i;

            for (int u = i + 1; u < arr.length; u++) {
                if (arr[sort].compareTo(arr[u]) > 0) {
                    sort = u;
                }

            }

            String inc = arr[i];
            arr[i] = arr[sort];
            arr[sort] = inc;

        }

        System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));

    }
}
