import java.util.Scanner;

public class Array_Rotation {
	
    public static void main(String[] args) {
    	int[] array = {1,2,3,4,5};
    	System.out.println("Please enter the number of rotations required:");
    	Scanner sc = new Scanner(System.in);
    	int rot = sc.nextInt();
    	int count = array.length - rot;
    	int[] new_array = new int[array.length];
    	System.out.println("Array copy reqiured of " + count +" elements");
    	int count1 = 0;
    	for ( int i = rot ; i < array.length ; i++ ){
    		new_array[i] = array[rot];
    		count1++;
    	}
    	for ( int i = (array.length - rot) ; i < rot ; i++ ){
    		new_array[count1] = array[i];
    	}
    	
    	for ( int i = 0 ; i < new_array.length ; i++ ){
    		System.out.print(new_array[i]+"");
    	}

        
        }
        
    }
