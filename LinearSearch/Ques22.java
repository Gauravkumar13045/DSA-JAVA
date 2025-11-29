// Search last occurrence of a value
package LinearSearch;

public class Ques22 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 10, 25, 10, 19 };
        int target = 10;
        int lastIndex = -1;  

 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                lastIndex = i;  
            }
        }

  
        if (lastIndex == -1) {
            System.out.println("Target Not Found");
        } else {
            System.out.println("Last occurrence of " + target + " is at index " + lastIndex);
        }
    }
}
