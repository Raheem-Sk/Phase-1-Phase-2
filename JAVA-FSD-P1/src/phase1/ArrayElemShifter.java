package phase1;

public class ArrayElemShifter {

	public static void main(String[] args) {
		// hard coded an array but can be made dynamic
		int A[] = {1,2,3,4,5,6,7,8,9,10};
		// hard coded no of shifts but can be made dynamic for runtime
		
		for(int i =0;i<5;i++) {        //outer loop to say tow many places to shift
			int temp = A[0];
			for(int j=0;j<A.length-1;j++) { // inner loop to actually shift positions
				A[j] = A[j+1];
			}
			A[A.length-1] = temp;
		}
		
		/// printing the Array after shifting
		for(int i=0;i<A.length;i++) {
		System.out.print(A[i]+" ");
	}}

}
