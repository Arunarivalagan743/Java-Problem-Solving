import java.util.Scanner;

public class pattern_3rdlevel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Take input N
        int c = N;
        int b = (N * 2) - 3;
        int g =0;
        if (N >= 4 && N < 10) {
            System.out.println("Value of N: " + N);
            int a =N +1;

            for (int i = 0; i < N;i++) {
                int num = N;
                for (int j = 0; j <= i; j++){
                    System.out.print(num);
                    num--;
                }

                for(int k =0;k<b;k++)
                {
                    System.out.print(c);
                }
                b = b-2;
                num++;
                c= c - 1;
                int gum = N;
                if(i==N-1){
                    num = 2;
                    for(int l = 1;l<=i ;l++){

                        System.out.print(num++);
                    }
                }
                else{
                    for(int l =0;l<=i;l++)
                    {

                        System.out.print(num++);



                    }
                }


                System.out.print("\n");
            }
        }

        sc.close();
    }
}
