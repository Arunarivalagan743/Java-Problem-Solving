//Given a Binary Number as a string, print its 1’s and 2’s complements.
//
//        1’s complement of a binary number is another binary number obtained by toggling all bits in it, i.e., transforming the 0 bit to 1 and the 1 bit to 0.
//
//Examples:
//
//        1's complement of "0111" is "1000"
//
//        1's complement of "1100" is "0011"
//
//        2’s complement of a binary number is 1 added to the 1’s complement of the binary number.
//
//Examples:
//
//        2's complement of "0111" is "1001"
//
//        2's complement of "1100" is "0100"
//
//
//For example:
//
//Input	Result
//1100
//        1's complement: 0011
//        2's complement: 0100
//        1
//        1's complement: 0
//        2's complement: 1
//
//

import java.util.Scanner;

public class onesComp_TwoComp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bin = sc.next();
        String ones = "";
        for (char b : bin.toCharArray()) {
            if(b =='0')
            {
                ones+='1';
            }
            else{
                ones+='0';
            }
        }

        int onesComp = Integer.parseInt(ones, 2);
        int twoComp = onesComp + 1;
        String two = Integer.toBinaryString(twoComp);
        while (two.length() < bin.length()) {
            two = "0" + two;
        }
        System.out.println("1's complement: " + ones);
        System.out.println("2's complement: " + two);
    }
}
