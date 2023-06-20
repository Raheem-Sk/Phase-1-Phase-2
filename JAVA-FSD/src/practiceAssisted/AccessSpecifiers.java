package practiceAssisted;
//This is a main method access specifiers default & public
public class AccessSpecifiers extends D{
	public static void main(String[] args) 
	{
		//Initializing an object & accessing default access method
		A a = new A();
		a.defaultAccess();
		//Initializing an object & accessing Public access method
		B b = new B();
		b.PublicAccess();
		//Accessing Private Access method
		PrivateAccess(); //Not accessible in other class 
		//Protected access 
		D d = new D();
		d.ProtectedAccess();
		
	}
	//only accessible to this class
	private static void PrivateAccess()
	{
		System.out.println("This is method has Private class ");
	}

}

class A{
	//default access specifier method across package
		void defaultAccess()
		{
			System.out.println("This is method has Default Access.");
		}
}

class B{
	//Public access specifier method accessible in & out of package
		public void PublicAccess()
		{
			System.out.println("This is method has Public class ");
		}	
}

class C{
	//Private access specifier method but beyond this class it is not accessible
		private void PrivateAccess()
		{
			System.out.println("This is method has Private class ");
		}
		
}

class D{
	//this class can be accessed only by its sub-class as we extended it.
		protected void ProtectedAccess()
		{
			System.out.println("This is method has Protected class ");
		}
	
}


