import java.util.*;

public class buyToSell {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int minPrice = p[0];
        int minDay = 1;
        int max = 0;
        int b = 1, s = 1;

        for (int i = 1; i < n; i++) {
            if (p[i] - minPrice > max) {
                max = p[i] - minPrice;
                b = minDay;
                s = i + 1;
            }

            if (p[i] < minPrice) {
                minPrice = p[i];
                minDay = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(b + " " + s);


    }
}
