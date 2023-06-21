package practiceAssisted;

public class ConstructorTypes {

	public static void main(String[] args) {
		// creating a object
		Student s1 = new Student();
		//calling a method
		s1.details();

	}

}

class Student {
	int regNo;
	String name;
	// this constructor does not have any parameters so default values will be assigned by Javac.
	void details() {
		System.out.println("Student "+name+" is having a regno : "+regNo);
	}
}