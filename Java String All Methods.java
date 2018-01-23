
public class One {
	public static void main(String[] args){
		String str1 = "Hello there";
		String str2 = "hey hey hey hey";
		
		// String lengths
		System.out.println("String 1 length" + str1.length());
		System.out.println("String 2 length" + str2.length());
		
		// Stirng compareTo function
		System.out.println("String 1 and String 2 comparision " + str1.compareTo(str2));
		
		// Concate
		System.out.println(str1.concat("How are you?"));
		System.out.println(str1.concat(str2));
		
		// is empty function
		System.out.println("String is empty or not? " + str1.isEmpty());
		System.out.println("String is empty or not? " + str1.isEmpty());
		
		// Trim function to remove leading and trailing spaces
		System.out.println("      Hey there      ".trim());
		System.out.println(str1.trim());
		
		// String toLowercase
		System.out.println(str1.toLowerCase());
		
		
		// String toUpperclass
		System.out.println(str2.toUpperCase());
		
		// String replace methods
		System.out.println("hey there".replace('t', 'a'));
		System.out.println(str2.replace("hey", "hi"));
		
		// value of
		boolean b = true;
		System.out.println(str1.valueOf(b));
		
		// contains method
		System.out.println(str1.contains("Hello"));
		System.out.println(str2.contains("hi"));
		
		// equals() and equalsIgnoreCase() methods
		String str3 = "ONE";
		String str4 = "One";
		System.out.println(str1.equals(str2));
		System.out.println(str3.equalsIgnoreCase(str4));
		
		// toCharArray
		// converts to ASCII values
		char[] array = str1.toCharArray();
		for(int i : array){
			System.out.print(i +  ", ");
		}
		System.out.println();
		for ( int i = 0 ; i < array.length ; i++ ){
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// starts with & ends with
		System.out.println("Hello there".startsWith("hello"));
		System.out.println("str2".endsWith("oo"));
		
		// GetByte
		byte[] b1 = "hey".getBytes();
		for ( int i = 0 ; i < b1.length ; i++ ){
		System.out.print(b1[i] + " ");
		}

	}

	

}
