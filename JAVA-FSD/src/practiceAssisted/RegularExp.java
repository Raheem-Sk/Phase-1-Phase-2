package practiceAssisted;

import java.util.Scanner;
import java.util.regex.*;

public class RegularExp {

	public static void main(String[] args) {
		

			//String pattern = "s";
			//String check = "Regular Expressions";
			Pattern p = Pattern.compile("@GMAIL.COM",Pattern.CASE_INSENSITIVE);
			System.out.println("enter your email id");
			Scanner s = new Scanner(System.in);
			String ID = s.next();
			Matcher c = p.matcher(ID);
			
			if(c.find()== true)
		      	System.out.println("Welcome");
			else
		      	System.out.println("Incorrect E-mail ID");

				
	}
}


