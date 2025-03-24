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
        char c[] = s.toCharArray();
        LinkedHashSet<Character> ts = new LinkedHashSet<>();
        for (int i = 0; i < c.length; i++) {
            ts.add(c[i]);
        }
       Iterator<Character> it = ts.iterator();
        while(it.hasNext())
        {
            System.out.print(it.next());
        }

    }
}
