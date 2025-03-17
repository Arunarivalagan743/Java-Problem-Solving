
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        reverseLetters(s);


    }

    // Function to reverse letters and numbers while keeping punctuation and spaces intact
    private static void reverseLetters(String s) {
        Stack <Character> st = new Stack<>();
        Map<Character,Character> m = new HashMap<>();
        m.put('}','{');
        m.put(']','[');
        m.put(')','(');
        boolean v = true;
        for(char i:s.toCharArray())
        {
            if(m.containsKey(i))
            {
                char top = st.empty() ? '#':st.pop();
                if(top!=m.get(i))
                {
                    v = false;
                    break;
                }
            }
            else{
                st.push(i);
            }
        }
        if (!st.isEmpty()) v = false; // If stack is not empty, invalid

        // Convert true/false to "True"/"False" before printing
        System.out.println(v ? "True" : "False");
    }
}



