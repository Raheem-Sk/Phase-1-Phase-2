package practiceAssisted;

public class Methods {

	public static void main(String[] args) {
		//assigning result to Ans
		int Ans = multiply(5,6);
		System.out.println("Multiplictaion of two numbers is : "+Ans);
			
	}
	// this the method that is called from main method
	public static int multiply(int x,int y) {
		int z = x*y;
		return z;
		
	}

}
