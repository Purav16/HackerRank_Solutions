
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
public class TIme {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Please enter speed of the vehicle");
        double speed = sc.nextDouble();
        System.out.println("Please enter distance to be travelled");
        int distance = sc.nextInt();
        double time  = distance/speed;
        System.out.println("Time taken to travel is: " + time + "Seconds");
    }
    
}
