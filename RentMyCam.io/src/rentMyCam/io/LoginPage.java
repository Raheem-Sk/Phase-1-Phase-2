package rentMyCam.io;

import java.util.ArrayList;
import java.util.Scanner;

public class LoginPage {
	//remove x for normal functionality in main x
	public static void main(String[] args) {
		// Application Banner  
		ArrayList<Camera> list=new ArrayList<Camera>();

		System.out.println("+--------------------------------------+");
		System.out.println("| WELCOME TO CAMERA RENTAL APPLICATION |");
		System.out.println("+--------------------------------------+");
		Scanner sc = new Scanner(System.in);
		String UserId;
		System.out.println("Enter Username :\n");
		UserId = sc.next();
		// if user id is correct allows to access menu else error message 
		if(UserId.equals("root")) {
			Menu(list);
		}
		else {
			System.out.println("Incorrect Username.try Again..!");
		}
	}
						//////////////////////////// MAIN MENU ///////////////////////////
		public static void Menu(ArrayList<Camera> list) {
		int choice;
		System.out.println("\n1.MY CAMERA\n2.RENT A CAMERA\n3.VIEW ALL CAMERAS\n4.MY WALLET\n5.EXIT\n");
		System.out.println("\nEnter your choice :");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		switch (choice) {
		case 1:
			// call MyCam method which handles all operations related to camera
			MyCamera.MyCam(list);
			break;
		case 2:
			// renting module
			RentAcamera.Rent(list);			
			break;
		case 3:
			// view module
			ViewAllCams.View( list);
			break;
		case 4:
			// This method will handles all operations related to Wallet 
			MyWallet.Wallet(list);
			break;
		case 5:
			System.out.println("Exit");
			break;	
		default:
			throw new IllegalArgumentException("Incorrect choice : " + choice);
		}
	
	
		
	}
	
}

