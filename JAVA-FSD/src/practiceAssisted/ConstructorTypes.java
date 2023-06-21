package practiceAssisted;

public class ConstructorTypes {

	public static void main(String[] args) {
		// creating a object
		// 1st instance object of class student 
		Student s1 = new Student();
		// 2nd instance object of class student 
		Student s2 = new Student();
		//calling a 1st object & its methods with constructors
		System.out.print(s1+"\n");
		s1.getInfo(1, "Raheem");
		s1.details();
		//calling a 1st object & its methods with constructors
		System.out.print(s2+"\n");
		s2.getInfo(2, "Shaik");
		s2.details();


	}

}

class Student {
	int regNo;
	String name;
	// this constructor does not have any parameters so default values will be assigned by Javac.
	void details() {
		System.out.println("Student "+name+" is having a regno : "+regNo);
		
	}
	void getInfo(int r, String n) {
		this.regNo = r;
		this.name = n;
	}
	
}







