package practiceAssisted;

class InvalidMailException extends Exception{
	
	//constructor for custom exception
	public InvalidMailException(String str) {
		
	
}
}
public class ExcepTionsHandiling{  		
		//using throws keyword to a method to catch custom throw
		static void Validte(String S) throws InvalidMailException {
	
			if(S.contains("@gmail.com"))
				System.out.println("Welcome people");
			else
				//throwing a custom error when mailId not having @gmail.com
				throw new InvalidMailException("Not a Valid google mail ID");
}

		public static void main(String[] args) {
			// this block will try if code is tend to give exception
			try {
				Validte("shaikgmail.com");
			//catch block  will catch those errors
			}
			catch (InvalidMailException em) {
				//printing the exception
				System.out.println("Exception occured "+em);
			}
			//finally block get executed irrespective of Exception caught or not
			finally {
				System.out.println("Finally exception is caught");
			}
		}
}
