
public class code {
	public static void main(String[] args){
		System.out.println("Result is displayed using method:"+menthod_Name());
		int num = 10;
		System.out.println("Result is displayed using method_2"+method_2(num));
		
	}

	public  static String method_2(int num) {
		
		String answer;
		if (num%2 == 0){
			answer = "Even";
		}
		else{
			answer = "Odd";
		}
		return answer;
	}

	private static String menthod_Name() {
		
		String result = "This is the result";
		return result;
	}

}
