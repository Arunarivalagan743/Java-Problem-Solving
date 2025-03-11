
//Write a program to extract the seconds in a given sentence
//
//For example:
//
//Input	Result
//Today the time is 09:11:33: Check it out
//33
//This is great time 09:33:17: Check it out
//17
//Answer:(penalty regime: 0 %)
//Language
//        java
import java.util.*;
        import java.util.regex.*;
public class ExtractSecondsInAString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Pattern pattern = Pattern.compile("\\b(\\d{2}:\\d{2}:\\d{2})\\b");
        Matcher matcher = pattern.matcher(s);
        if(matcher.find())
        {
            String t = matcher.group(1);
            String f[] = t.split(":");
            System.out.print(f[2]);
        }
    }

}
//Feedback
//Input	Expected	Got
//Today the time is 09:11:33: Check it out
//33
//        33
//This is great time 09:33:17: Check it out
//17
//        17
//What is it?  03:13:37: Check it out
//37
//        37
//Passed all tests!
