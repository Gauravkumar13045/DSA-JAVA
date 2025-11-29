// Update all occurrences of a value
package Update;

import java.util.Arrays;

public class Ques18 {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 10, 25, 10 , 19};
        int oldValue = 10;
        int newValue = 56;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == oldValue){
                arr[i] = newValue;
            }
        }
                            System.out.println("After Updation: " + Arrays.toString(arr));

     }
}
