package emailValidation;
//importing java utility class for scanner
import java.util.*;
public class Emailvalidate {
	
	// This method will validate the users Email id
	static void Validator(String x) {
		
		String eMail[] = {"ravi@java.com","Robertdowney@java.com",
				"Dinesh@java.com","Fahad@java.com"};
		//flag to indicate if e-mail not found in array
		boolean flag =false;
		
		for (int i=0;i<eMail.length;i++)
		{
			if(eMail[i].equals(x))
			{
				System.out.println("Email-ID Verified");
				flag = true;
				break;
			}
		}
		
		if(flag == false)
		{
			System.out.println("Invalid Email-ID");
		}
		
	}
	//This is a  main method
	public static void main(String[] args) {
		//Asking user to enter email-id
		System.out.println("Enter the Email-ID :");
		Scanner S =new Scanner(System.in);
		//declared a string variable mail and accepted data
		String mail = S.next();
		// calling main method
		Validator(mail);

}
}
