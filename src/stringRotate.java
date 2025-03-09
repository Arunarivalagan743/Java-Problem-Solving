//Check if two strings are rotations of each other. Refer to sample input and output. Rotation can be left rotation or right rotation
//
//For example:
//
//Input	Result
//Hello
//        lleHo
//Not a rotation of each other
//Hello
//        elloH
//Hello and elloH are rotation of each other
//Hello
//        oHell
//Hello and oHell are rotation of each other
import java.util.*;
public class stringRotate{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String c = str2 + str2;
        if(c.contains(str1)){
            System.out.print(str1+" and "+str2+" are rotation of each other");
        }
        else{
            System.out.print("Not a rotation of each other");
        }

    }
}