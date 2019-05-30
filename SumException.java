package taskday6;
import taskday6.UserDefined;
import java.util.*;
public class SumException {
	void add(int a,int b,int c) throws UserDefined{
		if((a+b+c)>100) {
			throw new UserDefined("Please enter the numbers, which total is below 100");
		}
		else {
			System.out.println("total sum is"+(a+b+c));
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		SumException se=new SumException();
		
		System.out.println("enter 3 numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		try {
			se.add(a,b,c);
		} catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
