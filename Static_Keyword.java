
public class Static_Class {
	static int order_no;
	static String order_name;
	// Creating a constructor
	Static_Class( int no , String name){
		this.order_no = no;
		this.order_name = name;
		}
		// Creating a method
		static void  information(){
			System.out.println("Order_no is: " + order_no + " & Order_name is: " + order_name);
		}
		public static void main(String[] args){
		
			Static_Class obj1 = new Static_Class(1,"Purav");	
			Static_Class obj2 = new Static_Class(2,"RO16");
			
			obj1.information();
			obj2.information();
		}
		
	}


