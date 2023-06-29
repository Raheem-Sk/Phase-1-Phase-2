package phase1;

public class SelectionSort {
	// access specifier
	private void SSort(int[] A){
		int min;int j;int temp;
		for (int i=0;i<A.length-1;i++) {
				min = i;
			for(j=i+1;j<A.length;j++) {
				if(A[min]>A[j]) {
					min = j;
				}
					
				}
				temp = A[i];
				A[i]=A[min];
				A[min] = temp;
				
			
		}
	}
	public static void main(String[] args) {
		int A[] = {10,6,8,9,2,4,5,5,6,7,9,2,6,82,96,52,65};
		SelectionSort X = new SelectionSort();
		X.SSort(A);
		// display
		for(int k = 0;k<A.length;k++) {
			System.out.println(A[k]);
		}

	}

}
