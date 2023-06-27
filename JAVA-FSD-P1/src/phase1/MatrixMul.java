package phase1;

public class MatrixMul {
	static int N=4;
	public static void main(String[] args) {
		int A[][] = 
			  { { 1, 1, 1, 1 },
                { 2, 2, 2, 2 },
                { 3, 3, 3, 3 },
                { 4, 4, 4, 4 } };
		
		int B[][]={ { 1, 1, 1, 1 },
					{ 2, 2, 2, 2 },
					{ 3, 3, 3, 3 },
					{ 4, 4, 4, 4 } };
		
		
		
		
		int C[][] = new int [N][N] ;
		Mul(A,B,C);
	}
	static void Mul(int A[][],int B[][],int C[][]) {
		
		
		 int i, j, k;
	        for (i = 0; i < N; i++) {
	            for (j = 0; j < N; j++) {
	                C[i][j] = 0;
	                for (k = 0; k < N; k++)
	                    C[i][j] += A[i][k]* B[k][j];
				
			}
						
				
		}
		
	        System.out.println("Result matrix"+ " is ");
	        for (i = 0; i < N; i++) {
	        	for (j = 0; j < N; j++)
	        		System.out.print(C[i][j]+ " ");
	        	System.out.println();
		
	}
	}}
