//Given a password entered by the user, check its strength using the below constraints and display either the password is strong or password is not strong.
//
//        Input Format
//
//The first line contains the given string
//
//        Constraints
//
//A password is strong if it has :
//
//        1. At least 8 characters
//
//2. At least one special char
//
//3. At least one number
//
//4. At least one upper and one lower case char.
//
//Output Format
//
//Display either Your Password is Strong or Your Password is Not Strong
//
//
//For example:
//
//Input	Result
//raKesh@1995kumar
//Your Password is Strong
//%ba7rnf
//Your Password is Not Strong
import java.util.*;
public class validPassword{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.length()< 8)
        {
            System.out.println("Your Password is Not Strong");
            return;
        }
        boolean num= false;
        boolean sp = false;
        boolean up = false;
        boolean low = false;
        for(char c : str.toCharArray())
        {
            if(Character.isDigit(c)) num = true;
            if(!Character.isLetterOrDigit(c)) sp = true;
            if(Character.isUpperCase(c)) up = true;
            if(Character.isLowerCase(c)) low = true;
        }
        if(num && sp && up && low)
        {
            System.out.println("Your Password is Strong");
        }
        else{
            System.out.println("Your Password is Not Strong");
        }
    }
}