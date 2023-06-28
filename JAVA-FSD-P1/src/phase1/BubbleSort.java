package phase1;

public class BubbleSort {

	public static void main(String[] args) {
		//array
		int A[]= {10,1,3,2,5,6,4,7,8,4,9,33};
		// Outer loop
		for(int j=0;j<A.length-1;j++) {
		//Inner  loop
		for(int i=0;i<A.length-1;i++) {
			// Ascending order
			if(A[i]>A[i+1]) {
				int temp =A[i];
				A[i]=A[i+1];
				A[i+1]=temp;
			}
		}}
		for(int i=0;i<A.length;i++) {
			System.out.println(A[i]);
		}
	
	}
}
