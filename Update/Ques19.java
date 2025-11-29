// If value exists → increase it by 10%
package Update;

import java.util.Arrays;

public class Ques19 {
    public static void main(String[] args) {
        double[] arr = { 5, 100, 20, 100, 25, 100, 19 };
        double oldValue = 100;
        double increase = 0.1; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == oldValue) {
                arr[i] = arr[i] + arr[i] * increase; 
            }
        }

        System.out.println("After Updation: " + Arrays.toString(arr));
    }
}
