//
//The postal address is unique and it starts with a number followed by a character then by a space with a string "Sector" followed by space and then a letter.
//
//        Find out if a given string is a valid address or not
//
//        For example:
//
//        Input	Result
//        45D Sector X
//        True
//        33Y Setor X
//        False

import java.util.Scanner;

public class ValidAddressRegex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ad = scanner.nextLine();
        String p = "^\\d+[A-Z] Sector [A-Z]$";
        if (ad.matches(p)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
