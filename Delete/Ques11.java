// Delete element at beginning
package Delete;

import java.util.Arrays;

public class Ques11 {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25};
        int[] newArr = new int[arr.length-1];
        
        for (int i = 0; i < arr.length-1; i++) {
            newArr[i] = arr[i+1];



            
        }

        System.out.println("" + Arrays.toString(newArr));




         
    }
}
