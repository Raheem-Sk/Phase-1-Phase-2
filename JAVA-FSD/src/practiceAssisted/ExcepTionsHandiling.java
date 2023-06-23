package practiceAssisted;

public class ExcepTionsHandiling  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a= 20;
		int b= 0;
		try {
		int sum = a/b;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}

