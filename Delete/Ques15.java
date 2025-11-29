// Insert multiple elements (dynamic)
package Delete;

import java.util.Arrays;
import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] newArray = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            newArray[i] = sc.nextInt();
        }

        System.out.println("Inserted Array : " + Arrays.toString(newArray));
        System.out.println();
        System.out.print("Enter the Index to insert : ");
        int index = sc.nextInt();
        System.out.println("Confirmed Index : " + index);

        if (index < 0 || index > arr.length) {
            System.out.println("Invalid Index");
        } else {
            int[] newArr = new int[arr.length + newArray.length];

            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];

            }

            for (int i = 0; i < newArray.length; i++) {
                newArr[index + i] = newArray[i];

            }
            for (int i = index; i < arr.length; i++) {
                newArr[newArray.length + i] = arr[i];
            }

            System.out.println("After insertion: " + Arrays.toString(newArr));

        }

    }

}
