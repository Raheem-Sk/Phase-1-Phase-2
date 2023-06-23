package practiceAssisted;
	//class : Car
	class Car {
	String brand;
	String color;
	int year;
	// Constructor
	public Car(String brand, String color, int year) {
	 this.brand = brand;
	 this.color = color;
	 this.year = year;
	}
	public void displayDetails() {
	 System.out.println("Brand: " + brand);
	 System.out.println("Color: " + color);
	 System.out.println("Year: " + year);
	}
	}
	public class OopsPilars {
	public static void main(String[] args) {
	 // objects : Car class
	 Car car1 = new Car("Toyota", "Red", 2021);
	 Car car2 = new Car("Honda", "Blue", 2022);
	 // methods to Call the car objects to display details
	 System.out.println("Car 1 Details:");
	 car1.displayDetails();
	 System.out.println();
	 System.out.println("Car 2 Details:");
	 car2.displayDetails();
	}
	}
