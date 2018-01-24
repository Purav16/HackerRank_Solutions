package regex;

import java.util.regex.Pattern;

public class Regex_split {
	public static void main(String[] args){
		String input = "This, is the input string";
		// 'i'
		String regex = " ";
		
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		String[] splitted_words = p.split(input);
		for (String var : splitted_words){
			System.out.print(var + " ");
		}
		System.out.println();
		System.out.println("Number of split strings: "+splitted_words.length);

	}

}
