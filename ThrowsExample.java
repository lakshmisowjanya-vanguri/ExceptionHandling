package taskday6;
import java.util.*;
public class ThrowsExample {
	void a(int a,int b) throws ArithmeticException {
			int k=a/b;
			System.out.println("a method");
		
	}
	 void b(int a, int b) throws ArrayIndexOutOfBoundsException{
		 a(a,b);
		 int a1[]=new int[4];
		  a1[1]=5;
		  a1[5]=10;
		
		 System.out.println("b method");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter two number");
		int a=s.nextInt();
		int b=s.nextInt();
		ThrowsExample e=new ThrowsExample();
		try{ 
			e.b(a,b);
		} catch(ArithmeticException ae) { 
			System.out.println("parent block"+ae);
			} catch(ArrayIndexOutOfBoundsException ae) {
				System.out.println(ae);
			}
		System.out.println("end of the profgrmme");
	}

}
