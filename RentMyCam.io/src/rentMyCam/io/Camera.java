package rentMyCam.io;

/// defined  a class camera
public class Camera {
	public static int getRent() {
		return Rent;
	}
	public void setRent(int rent) {
		Rent = rent;
	}
	/// class variables
	String CamName;
	String Model;
	static int Rent;
	
	// Constructor to set state to instance object
	Camera(String CamName,String Model,int Rent) 
	{
		this.CamName =CamName;
		this.Model = Model;
		Camera.Rent = Rent;
		
	}
	// can write methods
	void Display() {
		System.out.println(CamName+" "+"Added");
	}
}
