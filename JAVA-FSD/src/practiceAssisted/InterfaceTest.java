package practiceAssisted;



interface Animal {
	  public void animalSound(); // interface method (does not have a body)
	  public void sleep(); // interface method (does not have a body)
	  public void Name(String name); // interface do not have a body
	}

interface owner{
	public void OwnerName();
}
class Pig implements Animal,owner {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("we say wee wee");
	  }
	  public void sleep() {
	    // The body of sleep() is provided here
	    System.out.println("Zzz");
	  }
	public void Name(String name) {
		System.out.println("my name is "+name+"the pig & ");
	}
	@Override
	public void OwnerName() {
		System.out.println("randev billa");
	}
	
	}
class Dog implements Animal {
	  public void animalSound() {
	    // The body of animalSound() is provided here
	    System.out.println("The dog says: bow bow");
	  }
	  public void sleep() {
	    // The body of sleep() is provided here
	    System.out.println("ssssss");
	  }
	@Override
	public void Name(String name) {
	    System.out.println("I dont have a name");

	}
	}



public class InterfaceTest {

	public static void main(String[] args) {
		Pig p = new Pig();
		p.Name("Alice");
		p.animalSound();
		p.sleep();
		p.OwnerName();
		Dog D = new Dog();
		D.Name("jack");
		D.animalSound();
		D.sleep();
	}

}
