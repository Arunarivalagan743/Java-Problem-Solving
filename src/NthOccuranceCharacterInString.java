import java.util.*;

public class NthOccuranceCharacterInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s =sc.nextLine();
        int count =0;

        char c = sc.next().charAt(0);
        int n = sc.nextInt();

        for (int i = 0; i <s.length(); i++) {
            if(s.charAt(i)== c)
            {
                count = count +1;
                if (count ==n)
                {
                    System.out.println(i);
                    return;
                }

            }

        }

        System.out.println("-1");
    }

}
