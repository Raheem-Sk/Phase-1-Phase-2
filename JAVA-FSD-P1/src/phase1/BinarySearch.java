package phase1;

public class BinarySearch {

	public static void main(String[] args) {
		// Binary search works only on Sorted array.
		//Array
		int A[] = {1,2,3,4,5,6,7,8,9};
		int start=0,val = 1;
		int end =A.length;
		boolean flag =false;
		int mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(A[mid]==val) {
				flag=true;
				break;}
			
			else if(A[mid]<val) {
				start =mid+1;
			}
			else {
				end=mid-1;
			}
		}
	System.out.println("at A["+mid+"] found");	
	}

}
