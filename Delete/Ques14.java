// Delete element by value (if found)
package Delete;

import java.util.Arrays;

public class Ques14 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int value = 25;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {

                index = i;
                break;

            }
        }

        if (index == -1) {
            System.out.println("invalid Number");
        } else {
            int[] newArr = new int[arr.length - 1];

            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }

            for(int u = index; u < newArr.length; u++){
                newArr[u] = arr[u + 1];
            }
            System.out.println("After deletion: " + Arrays.toString(newArr));

        }
    }
}
