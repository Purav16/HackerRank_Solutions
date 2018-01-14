import java.io.*;
import java.util.*;
public class Solution
{
    public static void main(String[] args)
 {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String rev="";
        int l=A.length();
        for(int i=l-1;i>=0;--i)
        {
            rev+=A.charAt(i);
        }   
        //System.out.println(rev);
        if(rev.equalsIgnoreCase(A))
          System.out.println("Yes") ;
        else
            System.out.println("No");
    }
}
