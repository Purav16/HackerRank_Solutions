
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author purav
 */
public class MD_Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of rows");
        int a = sc.nextInt();
        System.out.println("Enter Number of columns");
        int b = sc.nextInt();
        long[][] array2d = new long[a][b];
        System.out.println("Enter values for array");
        for ( int  i = 0 ; i < a ; i++ ){
            for ( int j = 0 ; j < b ; j++ ){
                array2d[i][j] = sc.nextLong();
            }
        }
        
        for ( int  i = 0 ; i < a ; i++ ){
            for ( int j = 0 ; j < b ; j++ ){
                System.out.print(" Element("+i+ "" +j +") is: "+array2d[i][j]);
            }
            System.out.println();
        }
        
    }
    
}
