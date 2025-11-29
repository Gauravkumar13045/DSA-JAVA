// Search an element in array (basic)
package LinearSearch;

public class Ques20 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 30, 25, 40, 19 };
        int target = 104;
        int index = -1;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                index = i;
                System.out.println("Target found at " + index);
                break;
            }
        }
        if(index == -1){
            System.out.println("Target Not Found");
        }
        

    }
}
