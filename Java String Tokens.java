import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] hello = s.split("[ !,?._'@]+");
        System.out.println(hello.length);
        for (int i = 0 ; i < hello.length ; i++ ){
        System.out.println(hello[i]);
        }
        scan.close();
    }
}