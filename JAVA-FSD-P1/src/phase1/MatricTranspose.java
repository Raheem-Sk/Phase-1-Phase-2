package phase1;

public class MatricTranspose {

	public static void main(String[] args) {
		int A[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("\nmatric\n");
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
			System.out.print(" "+A[i][j]);
		}System.out.println();
			}
		
		System.out.println("\ntranspose matric\n");
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<A.length;j++) {
			System.out.print(" "+A[j][i]);
		}System.out.println();
			}
	}

}
