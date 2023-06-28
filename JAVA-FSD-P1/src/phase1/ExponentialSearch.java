package phase1;

import java.util.Arrays;

public class ExponentialSearch {

	public static void main(String[] args) {
		// must be a sorted array only
		int A[]= {10,20,30,40,50,60,70,81,96,111,123,156,179,189,199,205,230,250,260};
		// if unsorted can use Array.sort method to do the job
		int key =149; // can be dynamic & hard coded 
		int i=0; // Initializer
		boolean flag =false; 
		//this code is able find key at index 0
		if(A[0]==key)
			flag =true;
		else {	//can find from index 1
			for(i=1;i<A.length;i=i*2) {  
				// if either the condition become true break the loop 
				if(A[i]>key)
					break;
				}
			// give the array Array,low,high ,key  to inbuilt BS to find element
			// if element not found returns a negative value
			i=Arrays.binarySearch(A,i/2,A.length, key);

			}
		
		// check conditon
		if(flag==false && i<0 ) {
			System.out.println("Not found");
		}
		else 
			System.out.println("Found at "+i);
		
}
}
