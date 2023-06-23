package practiceAssisted;

public class ExceptionHandling{
	// this class declares Arithmetic exceptions
	public static void main(String[] args) {
		try {
		int s =10/0;
		}
		catch(ArithmeticException a) {
			System.out.println("You cannot divide a number by Zero "+a);
		}
		finally {
			System.out.println("Exception occured & successfully caught");
		}
		System.out.println("Hello i am still running even an exception is occured");
		int A = 10+10;
		System.out.println("Sum of 2 no is :"+A);
	}

}
