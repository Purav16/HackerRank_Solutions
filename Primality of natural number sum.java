import java.util.Scanner;

public class Sum_Of_Natural_Numbers {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("PHow many natural number yo uwant to put? ");
		int limit = sc.nextInt();
		int sum = (limit * limit+1) / 2;
		System.out.println("Sum is: " + sum);
		boolean isPrime = false;
		if (sum % 2 != 0){
			isPrime = false;
			//break;
		}
		else if(sum %3 != 0){
			isPrime = false;
			//break;
		}
		else if(sum %5 != 0){
			isPrime = false;
			//break;
		}
		else if(sum %7 != 0){
			isPrime =false;
		}
		else{
			isPrime = true;
		}
		
		System.out.println("Primality of sum is: " + isPrime);
		
		
	}

}
