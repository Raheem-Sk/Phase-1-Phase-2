package phase1;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {

	public static void main(String[] args) {
		int A[] = {11,14,28,30,24,5,96,17,86,39,100};
		Arrays.sort(A);
		System.out.println("Enter the K");
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		System.out.println(A[k-1]);
		sc.close();
	}	
	

}
