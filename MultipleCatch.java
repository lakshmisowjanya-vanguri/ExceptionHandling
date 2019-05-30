package taskday6;
import java.util.*;
public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number");
		int n=s.nextInt();
		int sum=0;
		int a[]=new int[n];
		try {
			for(int i=0;i<a.length;i++) {
				a[i]=s.nextInt();
			}
			for(int i=0;i<a.length;i++) {
				a[i]=a[i+1];
				System.out.println(a[i]);
			}
			System.out.println("try block");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("catch block");
			System.out.println(e);
			
		} catch(ArithmeticException ae) {
			System.out.println(ae);	
		}
		
		
	}

}
