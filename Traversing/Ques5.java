package Traversing;

public class Ques5 {
    public static void main(String[] args) {
        int[] arr = { 5, 10, 15, 20, 25 };
        int input = 75;
        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == input) {
                System.out.println(i);
                isFound = true;
                break;
            }

        }
        if (!isFound) {
            System.out.println("Not Found");
        }

    }
}
