
//Identify the different data types present in an input string and report their counts.  Each of the substrings, separated by one or more spaces, is one of either the String, Integer, or Double type.  Print the results on 3 lines in the order shown in the example.  If a type does not occur, report that type with a count of O.
//
//
//
//        For example:
//
//        Input	Result
//        can you give me 10 bucks puff in 7.5 or 7
//        string 8
//        integer 2
//        double 1
//        Answer:(penalty regime: 0 %)
//        Language
//        java
import java.util.*;
public class findDatatypeInString{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str[]= s.split(" ");
        int d =0;
        int i =0;
        int st =0;
        for(String a:str)
        {
            if(isdouble(a))
            {
                d++;
            }
            else if(isint(a))
            {
                i++;
            }
            else{
                st++;
            }

        }
        System.out.println("string " +st);
        System.out.println("integer "+i);
        System.out.println("double "+d);
    }
    private static boolean isdouble(String sub )
    {
        try{
            Double.parseDouble(sub);
            return sub.contains(".");
        }
        catch(NumberFormatException e)
        {
            return false;
        }
    }
    private static boolean isint(String sub)
    {
        try{
            Integer.parseInt(sub);
            return true;
        }
        catch(NumberFormatException e){
            return false;

        }
    }
}



//Feedback
//Input	Expected	Got
//can you give me 10 bucks puff in 7.5 or 7
//string 8
//integer 2
//double 1
//string 8
//integer 2
//double 1
//Cost of Ice cream is 100
//string 5
//integer 1
//double 0
//string 5
//integer 1
//double 0
//Passed all tests!
//
