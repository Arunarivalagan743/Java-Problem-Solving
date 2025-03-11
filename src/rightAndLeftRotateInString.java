


//         Given a set of strings you should alternatively rotate left and right. When a string is rotated left, the left most character shifts to the rightmost position. When a string is shifted right, the right most character gets shifted to the first position. Alternate rows should be shifted left and right. First row shifts left, second row shifts right, third row shifts left, fourth row shifts right. The number of characters to shift is given in the immediate next line. The very first row has a number N which represents the number of test cases. The 2nd row has the first string, third row has the number of characters to shift left, the 4th row has the second string, fifth row has the number of characters to shift right
//
//         Refer to sample input and output for more details.
//
//         5
//
//         Hello
//         1
//         Hello
//         1
//         ITVAC
//         2
//         ITVAC
//         2
//         Mercel
//         0
//         In the above, the first row indicates the number of test cases.
//
//         The second row gives the string in index 0, third row gives the number of positions the string has to shifted left
//
//         The fourth row gives the string in index 1, fifth row gives the number of positions the string has to shifted right
//
//         Note the integer given after the string determines the number of shifts to be made
//
//         Hello when shifted once to the left becomes elloH. The H from first position moves to the last and every other element moves one position to the left.
//
//         Hello when shifted once to the right becomes oHell. The o from last position moves to the first and every other element moves one position to the right.
//
//         The left and right shift happens alternatively.
//
//         Sample Input
//         5
//         Hello
//         1
//         Hello
//         1
//         ITVAC
//         2
//         ITVAC
//         2
//         Mercel
//         0
//         Sample Output
//         elloH
//         oHell
//         VACIT
//         ACITV
//         Mercel
//
//         For example:
//
//         Input	Result
//         3
//         Hello
//         1
//         They
//         2
//         Tricker
//         0
//         elloH
//         eyTh
//         Tricker
//         Answer:(penalty regime: 0 %)
//         Language
//         java
 import java.util.*;

 public class  rightAndLeftRotateInString {
     private static String leftRotate(String str, int d) {
         int len = str.length();
         d = d % len;
         return str.substring(d) + str.substring(0, d);
     }
     private static String rightRotate(String str, int d) {
         int len = str.length();
         d = d % len;
         return str.substring(len - d) + str.substring(0, len - d);
     }

     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         sc.nextLine();
         String[] results = new String[n];

         for (int i = 0; i < n; i++) {
             String str = sc.nextLine();
             int shift = sc.nextInt();
             sc.nextLine();
             if (i % 2 == 0) {
                 results[i] = leftRotate(str, shift);
             } else {
                 results[i] = rightRotate(str, shift);
             }
         }
         for (String res : results) {
             System.out.println(res);
         }

         sc.close();
     }
 }

// Feedback
// Input	Expected	Got
//5
// Hello
//1
// Hello
//1
// ITVAC
//2
// ITVAC
//2
// Mercel
//0
// elloH
//         oHell
// VACIT
//         ACITV
// Mercel
//         elloH
// oHell
//         VACIT
// ACITV
//         Mercel
//3
// Hello
//1
// They
//2
// Tricker
//0
// elloH
//         eyTh
// Tricker
//         elloH
// eyTh
//         Tricker
// Passed all tests!
//
//
