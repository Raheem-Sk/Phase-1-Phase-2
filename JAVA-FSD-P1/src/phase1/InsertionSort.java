package phase1;

public class InsertionSort {

	public static void main(String[] args) {
		
			int arr[]= {9,12,3,21,44};
			insertionsort(arr);
			for(int i=0;i<arr.length;i++)
				System.out.println(arr[i]);
		}

		private static void insertionsort(int[] arr) {
			for(int j=1;j<arr.length;j++) {
				int key=arr[j];
				int i=j-1;
				while(i>-1 && arr[i]>key) {
					arr[i+1]=arr[i]; 
				}
				arr[i+1]=key;
			}
			
		

	}

}
