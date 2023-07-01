package rentMyCam.io;

import java.util.ArrayList;
import java.util.Scanner;

public class MyWallet {
	private static float Bal;
	
	public static float getBal() {
		return Bal;
	}
	public static void setBal(float bal) {
		Bal = bal;
	}
	
	public static void Wallet(ArrayList<Camera> list) {
		Scanner sc = new Scanner(System.in);
		// created a wallet object

		System.out.println("YOUR CURRENT WALLET BALANCE IS -INR "+getBal());
		System.out.println("DO YOU WANT TO DEPOSIT MORE AMOUNT TO YOU WALLET..? (1.YES  /  2.NO)\n");
		if(sc.nextInt()==1) {
		System.out.println("Enter the Deposit Amount (INR) - ");
		int Deposit  = sc.nextInt();
		setBal(Deposit);
		System.out.println("YOUR WALLET BALANCE UPDATED SUCCESSFULLY.");
		System.out.println("YOUR CURRENT WALLET BALANCE IS -INR "+getBal());
		}
		LoginPage.Menu(list);
	}
}
