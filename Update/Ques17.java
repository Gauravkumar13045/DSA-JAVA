// Update first occurrence of a value
package Update;

import java.util.Arrays;

public class Ques17 {
    public static void main(String[] args) {
        int[] arr = { 5, 10 , 15, 10, 25, 10 };
        int oldValue = 10;
        int newValue = 49;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == oldValue){
                arr[i] = newValue;
                break;
            }
        }

                    System.out.println("After Updation: " + Arrays.toString(arr));

    }
}
