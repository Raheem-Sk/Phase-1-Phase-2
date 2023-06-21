package practiceAssisted;

public class Methods {
	public static void main(String[] args)
	{
		//in this method overloading same method takes 2 or 3 arguments
		Add(10,11);
		Add(10,11,12);
		
		mux(10,11);
		mux(10,11,12);

	}
	//method 1
	public static void Add(int x,int y) {
		System.out.println("Add of the two numbers is : "+(x+y));
		
	}
	public static void Add(int x,int y,int z) {
		System.out.println("Add of the three numbers is : "+(x+y+z));
		
	}
	public static void mux(int x,int y,int z) {
		System.out.println("Multiplication of the three numbers is : "+(x*y*z));
		
	}
	public static void mux(int x,int y) {
		System.out.println("Multiplication of the three numbers is : "+(x*y));
		
	}

}
