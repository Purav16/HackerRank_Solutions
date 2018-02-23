
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
public class Hello {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter total numbers");
        System.out.println(System.in);
        int len = sc.nextInt();
        
        int[] numbers = new int[len];
        //String answer = "";
        System.out.println("Enter Numbers");
        for ( int i = 0 ; i < numbers.length ; i++ ){
            numbers[i] = sc.nextInt();
        }
        for ( int i = 0 ; i < numbers.length ; i++ ){
            if (numbers[i] % 15 == 0){
                System.out.println("FizzBizz");
            }
            else if(numbers[i] % 5 == 0){
                System.out.println("Fizz");
            }
            else if (numbers[i] % 3 == 0){
                System.out.println("Bizz");
            }
            else{
                System.out.println(numbers[i]);
            }
        }
        
    }
    
}
