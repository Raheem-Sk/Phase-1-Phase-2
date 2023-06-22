package practiceAssisted;

public class ArraysConcept {

	public static void main(String[] args) {
		//single-dimensional array
		int a[]= {10,20,30,40,50};
		for(int i=0;i<a.length;i++) {
		System.out.println("Elements of array a: "+a[i]);
		}


		//multidimensional array
		int[][] b = {
		            {2, 4, 6, 8}, 
		            {3, 6, 9, 5},
		            {1, 54, 4 ,65 , 51}
		            };
		      
		      System.out.println("\nLength of row 1: " + b[2][1]);

	}

}
