package phase1;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArraySum {
	// sum method
	static void sum(int A[],int L,int R) {
		int Sum =0;
		if((L<=R)&&(R<=A.length)) {
		for (int i=L;i<=R;i++) {
			Sum=Sum+A[i];
		}
		System.out.println("Sum of All elements from "+L+" to "+R+" in the array is : "+Sum);
		}
		else
			System.out.println("Range Invalid ");
	
	}
	/// driving method 
	public static void main(String[] args) {
		int L ,R;
		// predefined array can be modified to run time
		int A[] = {1,7,34,4,45,6,77,8,94};
		/// exception handling for input mismatch or different data type
		try {
		Scanner sc = new Scanner(System.in);
		// display & ask lower range
		System.out.println("Enter the Lower range where you want to Start\n");
		L=sc.nextInt();
		// display & ask higher range
		System.out.println("Enter the Higher range where you want to End\n");
		R=sc.nextInt();
		sc.close();
		sum(A,L,R);
		}
		catch(ArrayIndexOutOfBoundsException | InputMismatchException e) {
			System.out.println("Invalid data type or range");
		}
		
		}

}
