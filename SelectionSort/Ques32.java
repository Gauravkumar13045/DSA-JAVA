// Find Minimum & Maximum using Selection Sort Logic

package SelectionSort;

public class Ques32 {
    public static void main(String[] args) {
        int[] arr = { 3, 8, 2, 9, 7 };

        for (int i = 0; i < arr.length - 1; i++) {
            int sort = i;
            for (int u = i  + 1; u < arr.length; u++) {
                if (arr[sort] > arr[u]) {
                    sort = u;

                }

            }
            int dec = arr[i];
            arr[i] = arr[sort];
            arr[sort] = dec;

        }
        System.out.println("Minimum : " + arr[0]);
        System.out.println("Maximum : " + arr[arr.length-1]);


    }
}
