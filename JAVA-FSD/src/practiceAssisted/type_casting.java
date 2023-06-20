package practiceAssisted;
public class type_casting {

	public static void main(String[] args) {
		//implicit type casting
		//char > integer > float > long > double
		System.out.println("Implicit typeCasting\n");
		char a = 'A';
		System.out.println("value of a :"+a);
		int b = a;
		System.out.println("value of b :"+b);
		float c = 'd';
		System.out.println("value of a :"+c);
		long d = '~';
		System.out.println("value of b :"+d);
		double e = d;
		System.out.println("value of a :"+e);
		
		//explicit type casting
		//double > long  > float  > integer >  char
		System.out.println("\nExplicit typeCasting\n");
		double f = 1234.123;
		System.out.println("value of a :"+f);
		long g = (long) f;
		System.out.println("value of a :"+g);
		float h = (float) g;
		System.out.println("value of a :"+h);
		int i = (int) h;
		System.out.println("value of a :"+i);
		char j = (char)i;
		System.out.println("value of a :"+j);

		}
}
