package taskday6;
import taskday6.DivZero;
import java.util.*;
class ArthException {
	public static void main(String args[]) {
		System.out.println("Enter any two number: ");
		Scanner s=new Scanner(System.in);
		try {
			int a=s.nextInt();
			int b=s.nextInt(); 
			DivZero dz=new DivZero();
			dz.division(a, b);
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("end of the programme");
	}	
}