//
//Given a string s, find the first non-repeating character in it and return its position. If it does not exist, return -1.
//
//
//
//        Example 1:
//
//        Input: s = "itvac"
//        Output: 1
//        Example 2:
//
//        Input: s = "lovecodinglife"
//        Output: 3
//        Example 3:
//
//        Input: s = "aabb"
//        Output: -1


import java.util.*;
public class first_non_repeating{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count =0;
        int r =0;
        char d =' ';
        int st =0;
        int flag =0;
        int n = s.length();
        int y =0;
        for( st =0;st<s.length();st++)
        {
            for(int i =0;i<s.length();i++)
            {
                if(flag ==0)
                {
                    if(st!=i)
                    {
                        d = s.charAt(st);
                        if(d!=s.charAt(i))
                        {
                            count  = count +1 ;
                            if (count == n - 1)
                            {
                                y = st;
                                System.out.print(y +1);
                                flag = 1;
                            }
                        }

                    }

                }
            }

            count =0;

        }

        if(flag==0){
            System.out.print("-1");
        }

    }
}