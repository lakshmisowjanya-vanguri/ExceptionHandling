package taskday6;
import java.util.*;
public class Example1{  
	   void checkAge(int age) throws Exception{  
		if(age<18)  
		   throw new Exception("'Access denied - You must be at least 18 years old.");  
		else  
		   System.out.println("Eligible for voting");  
	   }  
	   public static void main(String args[]){  
		Example1 obj = new Example1();
		Scanner s=new Scanner(System.in);
		System.out.println("enter age");
		int n=s.nextInt();
		try {
			obj.checkAge(n);  
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("End Of Program");  
	   }  
	}