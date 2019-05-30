package taskday6;
import taskday6.UserDefined;
import java.util.*;
public class StringLength {
	void check(String str) throws UserDefined{
		if(str.length()>15) {
			throw new UserDefined("Please enter shorter name");
		}
		else {
			System.out.println(str);
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		StringLength sl=new StringLength();
		System.out.println("enter String");
		String str=s.nextLine();
		try {
			sl.check(str);
		} catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("program ends");
	}

}
