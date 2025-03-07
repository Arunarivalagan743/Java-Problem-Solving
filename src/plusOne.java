import java.util.*;

public class plusOne {
    public static void main(String[] args) {
        int digits[] = {9, 9, 9};  // Example input

        ArrayList<Integer> res = new ArrayList<>();
        int c = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + c;
            res.add(0, sum % 10);
            c = sum / 10;
        }

        if (c > 0) {
            res.add(0, c);
        }

        int[] result = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            result[i] = res.get(i);
        }

        System.out.println(Arrays.toString(result));
    }
}
