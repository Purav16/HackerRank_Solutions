
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
public class Groups {
    public static int find_groups(int[] array, int total){
        int no_of_groups = 0;
        
        for ( int i = 0 ; i < array.length ; i++ ){
            for ( int j = 1 ; j < array.length ; j++ ){
                int product = array[i] * array[j];
                if (product <= total){
                   no_of_groups++; 
                }
            }
        }
        
        return no_of_groups;
    }
    public static void main(String[] args){
    /*    Scanner sc = new Scanner(System.in);
        System.out.println("Enter total: ");
        int total = sc.nextInt();
        int[] array = new int[10];
        System.out.println("Array Elements: ");
        for ( int i = 0 ; i < 10 ; i++ ){
            array[i] = sc.nextInt();
        }
*/      int [] array = {1,2,3,4,5,6,7,8,9,10};
        int total = 10;      
        System.out.println("Groups with less than " + total + " total is: " + find_groups(array,total));
    }
    
}
