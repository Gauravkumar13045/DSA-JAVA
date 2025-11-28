// Delete element at specific index
package Delete;

import java.util.Arrays;

public class Ques13 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int[] newArr = new int[arr.length - 1];
        int index = 1;

        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];

        }

        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i+1];

        }
        System.out.println("" + Arrays.toString(newArr));

    }
}
