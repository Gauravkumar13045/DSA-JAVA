// Count how many times value appears
package LinearSearch;

public class Ques21 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 20, 10, 25, 10, 19 };
        int count = 0;
        int value = 10;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == value){
                count++;
                
            }
        }
        System.out.println(count);

    }
}
