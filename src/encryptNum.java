import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class encryptNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        String num = String.valueOf(n);
        for (char i :num.toCharArray()) {
           a.add((Character.getNumericValue(i) + 5) % 10);

        }
        int tem = a.get(0);
        int tem1 = a.get(2);
        int tem2 = a.get(1);
        int tem3 = a.get(3);
        a.set(0, tem1);
        a.set(2, tem);
        a.set(1, tem3);
        a.set(3, tem2);
        if(a.get(0) == 0){
            a.remove(0);
        }

        a.forEach(System.out::print);



    }
}
