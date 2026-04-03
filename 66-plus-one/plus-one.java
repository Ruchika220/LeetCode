import java.util.*;

class Solution {

    // Function to add one to number
    public int[] plusOne(int[] digits) {

        // Traverse from last digit
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;   // add 1
                return digits; // return result
            }

            digits[i] = 0; // if digit is 9 → make it 0
        }

        // If all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;

        return result;
    }

    // Main method to test
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input size
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();

        int[] digits = new int[n];

        // Input digits
        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }

        // Call function
        Solution obj = new Solution();
        int[] result = obj.plusOne(digits);

        // Print result
        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}