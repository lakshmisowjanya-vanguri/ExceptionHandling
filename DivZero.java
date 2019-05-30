package taskday6;

public class DivZero {
	public void division(int a, int b)throws ArithmeticException {
		if(b==0||a==0) {
			ArithmeticException ae=new ArithmeticException("Does not enter zero for Division");
			throw ae;
		} else {
			int c=a/b; 
			System.out.println("Result: "+c);
		}
	}
}