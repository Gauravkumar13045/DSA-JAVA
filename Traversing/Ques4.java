// Count Even & Odd Numbers

package Traversing;

import java.util.Arrays;

public class Ques4 {
    public static void main(String[] args) {
        int[] arr = {5,10,15,20,25};
        int even = 0;
        int odd = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                even++;

            }else{
                odd++;
            }


        }
         System.out.println(Arrays.toString(arr));
        System.out.println("even : " +  even);
        System.out.println("odd : " + odd);


    }
}
