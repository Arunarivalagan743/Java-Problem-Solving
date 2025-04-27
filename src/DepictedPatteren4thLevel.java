import java.util.Scanner;

public class DepictedPatteren4thLevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s =2*n-1;
        for (int i = 0; i < s; i++) {
            for (int j = 0; j < s; j++) {
                System.out.print("Depicted pattern : " + " " +  (n- Math.min(Math.min(i,j),Math.min(s-1-i,s-1-j))+" "));


            }

            System.out.println();
        }


    }
}
