package taskday6;

import taskday6.UserDefined;;
class M{
 void method()throws UserDefined {
	 int a=10;
	 int j=0;
	 if(j==0) {
		 System.out.println("device operation performed");
		 throw new UserDefined("j should be changed");
	 }
 }
}
class TestThrows3{
   public static void main(String args[]) { 
     M m=new M();
     try {
     m.method();
     } catch(UserDefined e) {
    	 System.out.println(e);
     }
    System.out.println("normal flow...");
  }
}
