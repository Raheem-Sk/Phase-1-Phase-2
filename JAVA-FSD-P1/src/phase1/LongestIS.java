package phase1;

public class LongestIS {
	// method which finds longest sequence in ascending order
	static int Lsubseq(int A[]){
		// empty array of length L & initialized to 1 
	      int C[] = new int[A.length];
	      
	      int i, j, max = 0;
	      // main outer loop for iterating over the Array
	      for (i = 0; i < A.length; i++)
	         C[i] = 1;
	      //Inner loop
	      for (i = 1; i < A.length; i++)
	    	  
	      for (j = 0; j < i; j++)
	    	  
	      if (A[i] > A[j] && C[i] < C[j] + 1)
	    	  
	      C[i] = C[j] + 1;
	      
	      for (i = 0; i < A.length; i++)
	    	  
	      if (max < C[i])
	    	  
	      max = C[i];
	      
	      return max;
	   }
	
	   public static void main(String args[]){
		   
		   // predefined array
	      int A[] = {1,2,3,5,91,82,73,64,55,46,37,28,19};
	      
	      // Passing array to method 
	      System.out.println("longest increasing subsequence is " +  Lsubseq(A));
	      
	   }
	   
	}