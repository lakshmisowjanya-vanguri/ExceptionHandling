package taskday6;
import java.util.*;
public class ExceptionExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter two numbers");
		i=s.nextInt();
		j=s.nextInt();
		try {
			k=i/j;
			System.out.println("try block will be executed");
		} catch(ArithmeticException e) {
			System.out.println(e);
			System.out.println("catch  block will be executed");
		}
		System.out.println(k);
		System.out.println("end of the programme");
	}

}
