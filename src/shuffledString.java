//You are given a string s and an integer array indices of the same length. The string s will be shuffled such that the character at the ith position moves to indices[i] in the shuffled string.
//
//Return the shuffled string.
//
//
//For example:
//
//Input	Result
//codeleet
//4 5 6 7 0 1 2 3
//leetcode
//        hello
//3 2 1 0 4
//lleho
//        abc
//0 1 2
//abc
import java.util.*;
public class shuffledString{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n[] = new int [str.length()];
        HashMap <Integer,Character> hm = new HashMap<>();
        for(int i =0;i<str.length();i++)
        {
            n[i] = sc.nextInt();
            hm.put(n[i],str.charAt(i));
        }
        for(int i =0;i<hm.size();i++)
        {
            System.out.print(hm.get(i));
        }
    }
}