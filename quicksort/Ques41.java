// Implement Quick Sort in Ascending Order using last element as pivot.
package quicksort;

public class Ques41 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 8, 1, 7 };

        quicksort(arr, 0, arr.length - 1);
        System.out.print("Sorted Array: ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void quicksort(int[] arr, int low, int high) {
        if (low < high) {
            int pivot = part(arr, low, high);

            quicksort(arr, low, pivot - 1);
            quicksort(arr, pivot + 1, high);
        }

    }

    public static int part(int[] arr, int low, int high) {
        int pivoter = arr[high];
        int i = low - 1;

        for (int u = low; u < high; u++) {
            if (arr[u] < pivoter) {
                i++;
                int temp = arr[i];
                arr[i] = arr[u];
                arr[u] = temp;
            }

        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;

    }

}
