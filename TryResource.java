package taskday6;
import java.util.*;
public class TryResource {
	
	public static void main(String[] args) {

		try(Scanner s=new Scanner(System.in);){
			System.out.println("enter anything : ");
			int n=s.nextInt();
			System.out.println("try block");
			System.out.println(n);
		} catch(InputMismatchException i) {
			System.out.println(i);
			System.out.println("catch block");
		}
 		System.out.println("hello.......");
	}

} 
