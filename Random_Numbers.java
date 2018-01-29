import java.util.Random;

public class Random_Numbers {
	public static void main(String[] args){
		int counter = 0;
		Random ran = new Random();
		for ( int i = 0 ; i < 10 ; i++ ){
			System.out.print(ran.nextInt(1000) + " ");
		}
		
	}

}
