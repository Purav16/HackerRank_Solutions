public class Constructior_with_Parameters {
	int emp_id;
	String emp_name;
	String city;
	double emp_salary;
	// Creating constructor with various parameters
	Constructior_with_Parameters(int id, String name, String city1, double salary){
		this.emp_id = id;
		this.emp_name = name;
		this.city = city1;
		this.emp_salary = salary;
	}
	
	// Creating a method for the constructor
	void information(){
		System.out.println("Id: "+emp_id+" Name: "+emp_name);
		//String str = "information is: "+emp_id+ emp_name+ city+ emp_salary;
		//return str;
	}
	
	// Main method
	public static void main(String[] args){
	// Creating constructor objects
		Constructior_with_Parameters obj1 = new Constructior_with_Parameters(1,"Purav","LA",100000.0);
		Constructior_with_Parameters obj2 = new Constructior_with_Parameters(2,"RO16","LB",1000000.0);
		obj1.information();
		obj2.information();
	}
}
