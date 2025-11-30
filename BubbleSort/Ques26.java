// Optimize Bubble Sort → Stop early if already sorted
package BubbleSort;

import java.util.Arrays;

public class Ques26 {
    public static void main(String[] args) {
        int[] arr = { 23, 52, 95, 45, 85, 65 };

        for (int i = 0; i < arr.length  - 1; i++) {
        boolean isSwap = false;

            for (int u = 0; u < arr.length - i -1; u++) {
                if(arr[u] > arr[u + 1]){
                    int sort = arr[u];
                    arr[u] = arr[u + 1];
                    arr[u + 1] = sort;
                    isSwap = true;

                }
                
            }

            if(!isSwap){
                break;
            }
            
        }

                
        
        System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));

    }
}
