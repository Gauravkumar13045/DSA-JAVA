// Search in 2D array (matrix)
package LinearSearch;

public class Ques23 {
    public static void main(String[] args) {
        int[][] arr = {
                { 10, 20, 30 },
                { 40, 50, 60 },
                { 70, 80, 90 }
        };
        int target = 80;
        boolean found = false;

        outer:
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    System.out.println("Founded the Target at row " + row + ", col " + col);
                    found = true;
                    break outer;
                }

            }
        }

        if (!found) {
            System.out.println("Not found");
        }

    }
}
