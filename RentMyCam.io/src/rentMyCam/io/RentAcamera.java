package rentMyCam.io;

import java.util.ArrayList;
import java.util.Scanner;

public class RentAcamera {

	public static void Rent(ArrayList<Camera> list) {
		int i=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("CamID\tBrand\tModel\tPrice(per day)\tStatus");
		System.out.println("=============================================================");
		for(Camera c : list) {	
		System.out.println(i+"\t"+c.CamName+"\t"+c.Model+"\t"+c.Rent);
			i=i+1;
		}
		System.out.println("Enter the Camera-ID you want to rent\n");
		int opt = sc.nextInt();
		System.out.println(opt);
		if (MyWallet.getBal()>= Camera.getRent()) {
			MyWallet.setBal(MyWallet.getBal()-Camera.getRent());
			System.out.println("Success");
			
		}
		else
			System.out.println("You cant afford");
		
		LoginPage.Menu(list);
		
	}

}
