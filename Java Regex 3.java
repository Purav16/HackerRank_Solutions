package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reg_1 {
	public static void main(String[] args){
		String content = "This is s string where we will check RegEx";
		String pattern_string = ".*string.*";
		// Pattern.Matches() method
		boolean isMatch = Pattern.matches(pattern_string, content);
		System.out.println("Pattern matches? "+ isMatch);
		
		// pattern.compile() method
		// Pattern pattern = Pattern.compile(patternString, Pattern.CASE_INSENSITIVE);
		Pattern pattern = Pattern.compile(pattern_string,Pattern.CASE_INSENSITIVE );
		System.out.println(pattern);
		
		// pattern.matcher() method
		String content1 = "Hello hey there";
		String pattern_string2 = ".*h*.";
		Pattern p = Pattern.compile(pattern_string2, Pattern.CASE_INSENSITIVE);
		Matcher match = p.matcher(content1);
		boolean isMatched2 = match.matches();
		System.out.println("match is found? :" + isMatched2);
	}

}
