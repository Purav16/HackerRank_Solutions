
public class Singleton_2 {
	// first instance
	private static Singleton_2 sc = null;
	
	// private constructor
	private Singleton_2(){
		System.out.println("This is private");
	}
	
	// one static method that uses the instance
	private static Singleton_2 prin(){
		if (sc ==null){
			sc = new Singleton_2();
		}
		return sc;
		
	}
	
	public static void main(String[] args){
		Singleton_2 s2 = new Singleton_2();
		System.out.println(s2.prin());
	}

}
