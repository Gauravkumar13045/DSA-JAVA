// Count number of swaps and comparisons
package BubbleSort;

public class Ques27 {
    public static void main(String[] args) {
        int[] arr = { 23, 52, 95, 45, 85, 65 };
        int compare = 0;
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int u = 0; u < arr.length - i - 1; u++) {
                compare++;
                if (arr[u] > arr[u + 1]) {
                    int sort = arr[u];
                    arr[u] = arr[u + 1];
                    arr[u + 1] = sort;
                    swaps++;

                }

            }

        }
        System.out.println("swaps : " + swaps + " compare : " + compare);

    }
}
