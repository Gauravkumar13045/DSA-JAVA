// Copy Array to Another Array

package Traversing;

import java.util.Arrays;

public class Ques7 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int[] newArr = new int[arr.length];

        for(int i = 0; i<arr.length;i++){
            newArr[i] = arr[i];

        }
        System.out.println("new Array : " + Arrays.toString(newArr));

    }
}
