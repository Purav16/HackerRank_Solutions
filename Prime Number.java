import java.util.Scanner;

public class Prime_Numbers {
	public static void main(String[] args){
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		for ( int i = 2 ; i< num/2 ; i++){
			if (num%i == 0){
				isPrime = false;
				break;
			}
		}
		
		if(isPrime){
			System.out.println(num + "is a prime number");
		}
		else{
			System.out.println(num+ "isnt a prime number");
		}
	}
}
		


