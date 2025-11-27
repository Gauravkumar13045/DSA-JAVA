// Insert element at end
package Insert;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ques9 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25};
        int[] newArr = new int[arr.length + 1];
        int value = 630;

        for(int i = 0; i < arr.length; i++){
            newArr[i] = arr[i];

        }
            newArr[arr.length] = value;
               System.out.println("new Array : " + Arrays.toString(newArr));

    }
}
