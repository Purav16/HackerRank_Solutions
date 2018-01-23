import java.util.Scanner;

public class Range {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		int L = sc.nextInt();
		System.out.println("Enter upper limit");
		int R = sc.nextInt();
		for( int i = L ; i <= R ; i++){
			System.out.println(i);
		}
	}

}
