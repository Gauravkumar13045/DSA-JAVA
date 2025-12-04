// Count total swaps & comparisons during Sorting
package SelectionSort;

import java.util.Arrays;

public class Ques31 {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 2, 9, 7 };
        int com = 0;
        int swap = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            int sort = i;

            for (int u = i + 1; u < arr.length; u++) {
                com++;
                if (arr[sort] > arr[u]) {
                    sort = u;

                }

            }

            if (sort != i) {
                int dec = arr[i];
                arr[i] = arr[sort];
                arr[sort] = dec;
                swap++;
            }

        }
        System.out.println("Comparison : " + com);
        System.out.println("Swaps : " + swap);

    }

}
