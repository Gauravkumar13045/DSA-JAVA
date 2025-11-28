// Delete element at end
package Delete;

import java.util.Arrays;

public class Ques12 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < arr.length - 1; i++) {
            newArr[i] = arr[i];

        }
        System.out.println("" + Arrays.toString(newArr));

    }
}
