/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author purav
 */
public class Sub_Groups_Array {
    public static void main(String[] args){
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        String ans = "";
        for ( int i = 0 ; i < a.length ; i++ ){
            if (a[i]%3 == 0){
                ans = "Fizz";
                break;
            }
            else if (a[i] % 5 == 0){
                ans = "Buzz";
                break;
            }
            else if ( (a[i]%3 == 0) & (a[i]%5 == 0)){
                ans = "FizzBuzz";
                break;
            }
        }
        System.out.println(ans);
    }
    
}
