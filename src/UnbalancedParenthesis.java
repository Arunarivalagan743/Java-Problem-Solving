import java.util.Scanner;
import java.util.Stack;

public class UnbalancedParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String in = sc.nextLine();
        Stack<Character> st = new Stack<>();
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < in.length(); i++) {
            if(in.charAt(i)==')'||in.charAt(i)==']'||in.charAt(i)=='}')
            {
                res.append(in.charAt(i));
             while(st.peek()!='(')
             {
                 res.append(st.pop());
             }
             res.append(st.pop());
             break;
            }
            else {
                st.push(in.charAt(i));
            }

        }
        System.out.println(res.reverse());
    }
}
///input = (abc)))
//output =(abc)