
public class First {
	public static String var2 = "Instance variable/ inside a class but outside any method, constructor or any block";
	public static String var1 = "hey";
	
	First(String a){
		// instance variable converted into loacal variable
		// instance_variable = local_variable
		// target_variable = input_variable
		var2 = a;
		System.out.println(var2);
	}
		public static String display(){
			return var2;
			}
public static void main(String[] args){
		String str = "This is local variable"; 
		System.out.println("Hello there: " + str);
		String variable = "Inside method which is local";
		System.out.println(variable + "This variable type is: ");
		
		System.out.println("VAriable type: " + var2);
		new First("Hello there");
		First first = new First("Hello I am class object");
		first.display();
		//	var1 = "I am class/static variable I only have 1 value in whole program";
		System.out.println(var1);
	}

}
