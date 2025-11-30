// Sort String array using Bubble Sort (alphabetically)
package BubbleSort;

import java.util.Arrays;

public class Ques28 {
    public static void main(String[] args) {
        String[] arr = { "Gaurav", "Adya", "Garima", "Ram" };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int u = 0; u < arr.length - i - 1; u++) {
                 if(arr[u].compareTo(arr[u+1]) > 0){
                    String sort = arr[u];
                    arr[u] = arr[u + 1];
                    arr[u + 1] = sort;


                 }
            }
            
        }
                System.out.println("Sorted Array (Ascending): " + Arrays.toString(arr));


    }
}
