class Mycar{
	
	public  String name(){
		String name = "It's superclass car";
		return name;
	}
}
public class Car extends Mycar{
	public String name(){
		String name = "It's subclass car";
		return name;
		
	}
	
	public static void main(String[] args){
		Car a = new Car();
		System.out.println("Method of "+ a.name());
		Mycar b = new Mycar();
		System.out.println("Method of "+ b.name());
		Mycar c = new Car();
		System.out.println("Method of "+ c.name());
		super.name();
		
	}
	
}