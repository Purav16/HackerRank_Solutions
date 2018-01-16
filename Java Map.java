import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Map m=new HashMap();
		Scanner in = new Scanner(System.in);
	      int n=in.nextInt();
	      in.nextLine();
	      for(int i=0;i<n;i++)
	      {
	         String name=in.nextLine();
	         int phone=in.nextInt();
	         m.put(name, phone);
	         in.nextLine();
	      }
	      while(in.hasNext())
	      {
	         String s=in.nextLine();
	         Integer no=null;
	         no=(Integer)m.get(s);
	         if(no != null ){
	        	 System.out.println(s+"="+no);
	         }else{
	        	 System.out.println("Not found");
	         }
	      }
	      in.close();	
    }}