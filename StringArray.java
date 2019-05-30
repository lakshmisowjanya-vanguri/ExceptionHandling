package taskday6;
import taskday6.UserDefined;
import java.util.*;
public class StringArray {
	void check(String a[] ,String str) throws UserDefined {
		int count=0;
		 for(int i=0;i<a.length;i++) {	
			 if(a[i].equals(str)) {	
					 System.out.println("valid entry");
					 count++;
					
				 } 
		 }
		 if(count==0) {
				 throw new UserDefined("You are not Enrolled for the class");
		 }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s=new Scanner(System.in);
		StringArray sa=new StringArray();
		System.out.println("enter number");
		int n=s.nextInt();
		System.out.println("enter names");
		String a[]=new String[n];
		 for(int j=0;j<n;j++) {
			 a[j]=s.next();
		 }
		 System.out.println("enter names to check");
		 String str=s.next();
		try {
			sa.check(a,str);
		} catch(UserDefined e) {
			System.out.println(e);
		}
		System.out.println("program ends");
	}

}