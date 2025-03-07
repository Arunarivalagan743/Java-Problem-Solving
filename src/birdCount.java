import java.util.*;
public class birdCount{
    public static void main(String args[]){
        Scanner sc  =  new Scanner (System.in);
        int n = sc.nextInt();
        int a [] = new int [n];
        for (int i = 0; i < a.length ; i++) {
            a[i] = sc.nextInt();
        }
        HashMap <Integer,Integer> bc = new HashMap<>();
        for (int b :a) {
            bc.put(b,bc.getOrDefault(b,0)+ 1);
        }

        System.out.println(bc);
        int max = 0;
        int val = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> en : bc.entrySet()) {
            int bt = en.getKey();
            int bf = en.getValue() ;
            if(bf > max || (bt < val && bf == max))
            {
                max = bt;
                val = bf;

            }
        }

        System.out.println(bc);
        System.out.println(max);
    }
}