import java.util.*;
public class determinantMatrix {
    static int determinant(int d[][],int n){
        if(n==1){
            return d[0][0];}
        if(n==2){
            return d[0][0]*d[1][1] - d[0][1]*d[1][0];}
        int det =0;
        for(int i =0;i<n;i++)
        {
            int mat[][] = cof(d,n,i);
            det+= d[0][i] *determinant(mat,n-1)*(i%2==0 ?1:-1);
        }
        return det;
    }




    static int[][] cof(int[][] mat, int n, int col) {
        int[][] sub = new int[n - 1][n - 1];
        for (int i = 1; i < n; i++) {
            int subCol = 0;
            for (int j = 0; j < n; j++) {
                if (j == col) continue;
                sub[i - 1][subCol++] = mat[i][j];
            }
        }
        return sub;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int d[][] = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                d[i][j]= sc.nextInt();
            }

        }

        System.out.println("Determinant of the matrix =" + determinant(d, n));
    }
}