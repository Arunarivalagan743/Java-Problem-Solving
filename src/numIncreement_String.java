//Write a program to increase every digit by 1 in a given string. If it is not a digit then the character should not be modified
//
//        Input Format
//
//        abc123ddee456
//
//        Output Format
//
//        abc234ddee567
//
//        Sample Input 0
//
//        000aaa11111bbbxxx000
//        Sample Output 0
//
//        111aaa22222bbbxxx111


import java.util.*;

public class numIncreement_String {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if(Character.isDigit(c))
            {
                int num = c -'0';
                num = (num+1)%10;
                str.append(num);
            }else{
                str.append(c);
            }
        }
        System.out.println(str.toString());

    }
}



