package phase1;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		int A[] = {1,12,3,4,5,6,7,8,9};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the value that you want to find ?\n");
		int key = s.nextInt();
		s.close();
		boolean flag =false;
		int i=0;
		// for loop to traverse the Array
		for (i=0;i<A.length;i++) 
		{ // if to compare
			if(A[i]==key) 
			{ // when the value at index equals to key
				flag =true;
				break;
			}
		}
		// when flag is true displays the index of the element.
		if(flag==true)
		System.out.println("Value found at index : "+i);
		else
		System.out.println("Value not found");
		

	}

}
