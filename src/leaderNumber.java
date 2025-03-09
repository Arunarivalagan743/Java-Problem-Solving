import  java.util.*;
public class leaderNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        int max= 0;
        int ind =0;
        int i =0;
        int count =0;
        for ( i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if(a[i] > max)
            {
                max =a[i];
                ind =i;
            }
        }
        for (int j = ind+1; j < a.length ; j++) {
            if(max > a[j])
            {
                count = count +1;
            }

        }
        if(count == 0)
        {
            System.out.print("No");
        }
        else if(count == a.length - ind - 1){
            System.out.println("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}