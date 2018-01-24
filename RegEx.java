package regex;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Revisited {
	public static void main(String[] args){
	
		String input = "Hello there how are you? ";
		String regex = ".*H*.";
		boolean b;
		
		// method 1 Pattern.matches()
		// STEP: 1
		b = Pattern.matches(regex, input);
		System.out.println("Pattern Matched?: " + b);
		
		// Pattern compiling
		// STEP: 2
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		System.out.println("Pattern for which we are checking for is: " + p);
		
		// Pattern.matches using matcher class
		// STEP: 3
		Matcher m = p.matcher(input);
		b = m.matches();
		System.out.println("Pattern Matched?: " + b);
		
		
		
		
	}

}
