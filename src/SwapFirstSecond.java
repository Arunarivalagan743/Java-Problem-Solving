import java.util.*;

public class SwapFirstSecond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Convert number to string to access digits
        String numStr = String.valueOf(n);

        // Create an array to store digits
        int[] digits = new int[numStr.length()];

        // Store digits into the array
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
            int temp = digits[0];
            digits[0] = digits[numStr.length()-1];
            digits[numStr.length()-1] = temp;
        }

        // Print the array
        System.out.println("Digits in array: " + Arrays.toString(digits));
    }
}
