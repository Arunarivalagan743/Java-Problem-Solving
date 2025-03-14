//Write a program to reverse the words in a sentence except the numeric.It should capitalize the first letter post reversal.
//
//        For example:
//
//        Input	Result
//        there are 26 alphabets in english
//        Ereht Era 26 Stebahpla Ni Hsilgne
//        I26t is not a digit 1234
//        T26i Si Ton A Tigid 1234
//        Answer:(penalty regime: 0 %)
//        Language
//        java
import java.util.*;

public class reversewordsInsentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(reverseWords(input));
        scanner.close();
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.matches("\\d+")) {
                result.append(word).append(" ");
            } else {
                String reversed = reverseWithRegex(word);
                result.append(Character.toUpperCase(reversed.charAt(0)))
                        .append(reversed.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return result.toString().trim();
    }

    private static String reverseWithRegex(String word) {

        String lettersOnly = word.replaceAll("\\d", "");
        String reversedLetters = new StringBuilder(lettersOnly).reverse().toString();

        StringBuilder result = new StringBuilder(word);
        int letterIndex = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                result.setCharAt(i, reversedLetters.charAt(letterIndex++));
            }
        }
        return result.toString();
    }
}

//Feedback
//Input	Expected	Got
//there are 26 alphabets in english
//Ereht Era 26 Stebahpla Ni Hsilgne
//Ereht Era 26 Stebahpla Ni Hsilgne
//I26t is not a digit 1234
//T26i Si Ton A Tigid 1234
//T26i Si Ton A Tigid 1234
//Passed all tests!

