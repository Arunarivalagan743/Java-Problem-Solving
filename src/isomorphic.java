//
//given two strings s and t, determine if they are isomorphic.
//
//        Two strings s and t are isomorphic if the characters in s can be replaced to get t.
//
//        All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
//
//
//
//        Example 1:
//
//        Input: s = "egg", t = "add"
//
//        Output: true
//
//        Explanation:
//
//        The strings s and t can be made identical by:
//
//        Mapping 'e' to 'a'.
//        Mapping 'g' to 'd'.
//
//        Example 2:
//
//        Input: s = "foo", t = "bar"
//
//        Output: false
//
//        Explanation:
//
//        The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.
//
//        Example 3:
//
//        Input: s = "paper", t = "title"
//
//        Output: true
//
//
//
//        Constraints:
//
//        1 <= s.length <= 5 * 104
//        t.length == s.length
//        s and t consist of any valid ascii character.

import java.util.*;

public class isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        if (str.length() != str2.length()) {
            System.out.println("false");
            return;
        }
        HashMap<Character, Character> hs = new HashMap<>();
        HashMap<Character, Character> sh = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char char1 = str.charAt(i);
            char char2 = str2.charAt(i);
            if (hs.containsKey(char1)) {
                if (hs.get(char1) != char2) {
                    System.out.println("false");
                    return;
                }
            } else {
                hs.put(char1, char2);
            }
            if (sh.containsKey(char2)) {
                if (sh.get(char2) != char1) {
                    System.out.println("false");
                    return;
                }
            } else {
                sh.put(char2, char1);
            }
        }
        System.out.println("true");
    }
}
