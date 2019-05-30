package taskday6;

import java.nio.file.FileSystemNotFoundException;

public class TryCatchExampe {
	public static void main(String[] args) {
		try{
			try {
				int a=10/0;
			} catch(ArithmeticException ae) {
				System.out.println(ae);
				System.out.println("child try block");
			}try {
				int a[]=new int[5];
				a[10]=5;
			} catch(FileSystemNotFoundException f) {
				System.out.println(f);
				System.out.println("inner child try block");
			}
		}catch(Exception e) {
			System.out.println(""+e);
			System.out.println("parent try block");
		}
		System.out.println("end of the programme");
	}

}
