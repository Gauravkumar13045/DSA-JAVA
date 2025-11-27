// Insert at Beginning 
package Insert;

import java.util.Arrays;

public class Ques8 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int value = 0;
        int[] newArr = new int[arr.length + 1];

        newArr[0] = value;
        
        for (int i = 0; i < arr.length; i++) {
            newArr[i + 1] = arr[i];

        }
        System.out.println("new Array : " + Arrays.toString(newArr));

    }
}