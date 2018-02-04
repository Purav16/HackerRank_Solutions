import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int j;
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
            
        }
        in.close();
        
        for(j=n-1;j<n;j--){
            System.out.print(arr[j]+" ");
        }
    }
}

