package rentMyCam.io;

import java.util.ArrayList;
import java.util.Scanner;

public class MyCamera {
	
		public static void MyCam(ArrayList<Camera> list) {
		//Creating empty array list of objects of data type camera
		//ArrayList<Camera> list=new ArrayList<Camera>();
		// variables and functions required
		int MyCamChoice;
		Scanner sc = new Scanner(System.in);
		do {
		//shows options
		System.out.println("\n1.ADD\n2.REMOVE\n3.VIEW MY CAMERAS\n4.GO TO PREVIOUS MENU\n");
		// accepts choice
		MyCamChoice = sc.nextInt();
		// switch according to choice
		switch (MyCamChoice) {
		case 1:
			// Asking details required
			System.out.println("Enter the camera brand\n");
			String brand = sc.next();
			System.out.println("Enter the model\n");
			String model = sc.next();
			System.out.println("Enter the per day price\n");
			int price =sc.nextInt();
			// need to call a method to add new camera
			list.add(new Camera(brand,model,price));
			System.out.println("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST.");
			break;
			
			
		case 2:
			int i=1;
			System.out.println("CamID\tBrand\tModel\tPrice(per day)\tStatus");
			System.out.println("=============================================================");
			for(Camera c : list) {	
			System.out.println(i+"\t"+c.CamName+"\t"+c.Model+"\t"+c.Rent);
				i=i+1;
			}
			System.out.println("Enter the cameraID\n");
			int opt = sc.nextInt();
			list.remove(opt-1);
			System.out.println("Camera Successfully removed from list.");
			break;
		case 3:
			i=1;
			System.out.println("CamID\tBrand\tModel\tPrice(per day)\tStatus");
			System.out.println("=============================================================");
			for(Camera c : list) {	
			System.out.println(i+"\t"+c.CamName+"\t"+c.Model+"\t"+c.Rent+"\t\tavailable");
				i=i+1;
			}
			break;
		case 4:
			LoginPage.Menu(list);
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + MyCamChoice);
		}}
		while(true);
		
	}
	
	public static void main(String[] args) {
		
		//MyCam();
		
		
	}
	
	
	
	
	
	
}
