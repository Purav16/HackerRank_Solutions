package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex3 {
	public static void main(String[] args){
		// make the pattern variable and object with checking regex
		Pattern ptr = Pattern.compile("puravdesai\\d\\d");
		
		
		// make the matcher variable & object with input string
		Matcher m = ptr.matcher("puravdesai16");
		
		//check if works or not
		if(m.matches()){
			System.out.println("Yes it matches");
		}
	}

}
