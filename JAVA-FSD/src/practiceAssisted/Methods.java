package practiceAssisted;

public class Methods {
	int z=50;
	public static void main(String[] args)
	{
		//assigning result to Ans
		Methods M = new Methods();
		System.out.println("Cube of a number is : "+M.z);
		//call by Value
		CallByValue(5);
		System.out.println("Cube of a number is : "+M.z);
	}
	//method
	static int CallByValue(int z) {
		// method variables are limited to method only.
		z = z^3;
		return z;
		
	}

}
