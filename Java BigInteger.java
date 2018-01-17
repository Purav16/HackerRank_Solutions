import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String One = sc.nextLine();
        String Two = sc.nextLine();
        BigInteger bigOne = new BigInteger(One);
        BigInteger bigTwo = new BigInteger(Two);
        System.out.println(bigOne.add(bigTwo));
        System.out.println(bigOne.multiply(bigTwo));
    }
}