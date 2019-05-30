package taskday6;

public class TryExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		System.out.println("first try block");
	try {
		System.out.println("second try block");
	try {
		int a[]= {1,2,3,4};
		a[5]=0;
		System.out.println("third try block");	
	} catch(ArithmeticException e1) {
		System.out.println(e1);
	}
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		
	}
	} catch(Exception e2) {
		System.out.println(e2);
	}
	System.out.println("end of th eprogramme");
	

}
	

}