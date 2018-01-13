import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int rotation = sc.nextInt();
        int[] array1 = new int[n];
         for ( int i = 0 ; i < n ; i++ )
        {
            array1[(i + n - rotation)%n] = sc.nextInt();
        }
        for ( int i = 0 ; i < n ; i++ ){
            System.out.print(array1[i] + " ");
        }
       
    }
}