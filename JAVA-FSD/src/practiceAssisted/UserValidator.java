package practiceAssisted;

import java.util.Scanner;

public class UserValidator {
	static boolean validate(String U,String P) {
		if(U.equalsIgnoreCase("User") && P.equals("rootuser"))
			  return true;
		else
			return false;
	}

	public static void main(String[] args) {
		int count=1;
		while(count<4) {
		
		System.out.println("Enter UserName");
		Scanner s = new Scanner(System.in);
		String UserId = s.next();
		System.out.println("Enter PassWord");
		String Pwd = s.next();
		if(validate(UserId,Pwd)) {
			System.out.println("Wellcome "+UserId);
			break;
		}
		else 		
			System.out.println("Invalid userID or Password "+(3-count)+" trys Remaing");
		
		count++;
		
	}
		}
	
	
}
