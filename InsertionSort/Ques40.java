//  Apply Insertion Sort on a String array (alphabetical order).
package InsertionSort;

public class Ques40 {
    public static void main(String[] args) {
        String[] arr = { "Gaurav", "Radha", "Sita", "Ram" };

        for (int i = 1; i < arr.length; i++) {
            String sorted = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareTo(sorted) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = sorted;

           

        }
         System.out.println("Sorted Array (Alphabetical): ");
            for (String s : arr) {
                System.out.print(s + " ");
            }

    }

}
