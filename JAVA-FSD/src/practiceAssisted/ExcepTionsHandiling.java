package practiceAssisted;

class InvalidMailException extends Exception{
	
	//constructor for custom exception
	public InvalidMailException(String str) {
		
	
}
}
public class ExcepTionsHandiling{  		
		
		static void Validte(String S) throws InvalidMailException {
	
			if(S.contains("@gmail.com"))
				System.out.println("Welcome people");
			else
				//throwing an error when mailId not having @gmail.com
				throw new InvalidMailException("Not a Valid google mail ID");
}

		public static void main(String[] args) {
			// this block will try if code is tend to give exception
			try {
				Validte("shaik@gmail.com");
				//catch block  will catch those errors
			}
			catch (InvalidMailException em) {
				System.out.println("Exception occured "+em);
			}
		}
}
