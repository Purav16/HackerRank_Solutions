import java.util.Scanner;

public class String_Recursion {
	//String str = " this is the string";
	public static String reverse = "";
	
	public static String reverseString(String str){
		if (str.length() == 0 ){
			return str;
		}
		else {
			reverse = reverse +  str.charAt(str.length()-1) + reverseString(str.substring(0, (str.length()-1)));
			return reverse;
			
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		System.out.println("Reversed String: " + reverseString(str));
	}

}
