//
//Write a program to sort the words in a sentence
//
//        Input Format
//
//        hello, how are you today?
//
//        Output Format
//
//        are hello, how today? you

import java.util.*;

public class SortStringsInSentence {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String s = sc.nextLine();
        String st[] = s.split(" ");
        TreeSet<String> t = new TreeSet<>();
        for (int i = 0; i < st.length; i++) {
          t.add(st[i]);
        }
        for (String value:t)

            // Printing the values inside the object
            System.out.print(value + " ");
        {

        }
    }
}
