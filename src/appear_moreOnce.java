//
//Develop a program that accepts a string as input and removes characters from the string which appear more than once.
//
//        Example 1:
//
//        Input: malayalam
//
//        Output: maly
//
//        Explanation:
//
//        In the given string “malayalam”, the letter “a” appears 4 times, “l” occurs 2 times and “m” occurs 2 times and hence all the occurrences of “a”,”l”,”m” are removed except for the first occurrence. So the output is “maly”.
//
//
//
//        Example 2:
//
//        Input: creation
//
//        Output: creation
//
//
//
//        Explanation:
//
//        In the given string “creation” no character occur more than once and there is no change in the output. The output is “creation”.
//
//        Sample Input
//        SriShakthi
//        Sample Output
//        Srihakt
import java.util.*;

public class appear_moreOnce {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        String sr = "";

        for (int i = 0; i < n; i++) {
            int count = 1;
            int flag =0;
            for ( int j = 0; j < n ; j++) {
                if (i != j && s.charAt(i) == s.charAt(j)) {
                    flag =1;
                    count++;
                }
            }
            if (count >= 2  && !sr.contains(String.valueOf(s.charAt(i)))) {
                sr += s.charAt(i);
            }
            else if(flag ==0)
            {
                sr+=s.charAt(i);
            }
        }
        if (sr.isEmpty()) {
            System.out.print(s);
        } else {
            System.out.print(sr);
        }
    }
}
