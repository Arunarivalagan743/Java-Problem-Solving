import java.util.*;

public class PhoneLettersCombinations {
    // Mapping of digits to letters
    public static final String[] KEYPAD = {
            "",    "",    "abc", "def", "ghi", "jkl",
            "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> getCombinations(String digits) {
        if (digits.isEmpty() || digits.contains("1") || digits.contains("0")) {
            return List.of("No Combination of Strings");
        }

        List<String> result = new ArrayList<>();
        generateCombinations(digits, 0, "", result);
        return result;
    }

    private static void generateCombinations(String digits, int index, String current, List<String> result) {
        if (index == digits.length()) {
            result.add(current);
            return;
        }

        String letters = KEYPAD[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            generateCombinations(digits, index + 1, current + letter, result);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String digits = scanner.next();

        // Get combinations and print
        System.out.println(String.join(" ", getCombinations(digits)));

        scanner.close();
    }
}
