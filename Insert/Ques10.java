// Insert element at specific index
package Insert;

import java.util.Arrays;

public class Ques10 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int index = 2;
        int value = 65;
        int[] newArr = new int[arr.length + 1];

        for(int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = value;


        for(int i = index; i < arr.length; i++){
            newArr[i + 1] = arr[i];
        }
        System.out.println("" + Arrays.toString(newArr));
        


    }
}
