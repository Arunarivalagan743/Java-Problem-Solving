//Write a program which finds the number of occurrences of each word in a given set of strings.
//
//        Input:
//
//        This There Next Where Why There Why
//
//        Output:
//
//        This 1
//        There 2
//        Next 1
//        Where 1
//        Why 2
//
//
//        For example:
//
//        Input	Result
//        This is the programming practice
//        This 1
//        is 1
//        the 1
//        programming 1
//        practice 1


import java.util.*;
public class NumberOccurencesInSrtringInSentence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String st[] = s.split(" ");
        Map<String,Integer> h = new LinkedHashMap<>();
        for(int i =0;i<st.length;i++)
        {
            h.put(st[i], h.getOrDefault(st[i],0)+1);
        }
        for(Map.Entry<String,Integer> entry :h.entrySet())
                {
                    System.out.println(entry.getKey()+  entry.getValue());
                }


    }
}
