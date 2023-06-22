package practiceAssisted;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
				//creating array list
				System.out.println("ArrayList");
				ArrayList<String> city=new ArrayList<String>();   
			      city.add("Bangalore");//
			      city.add("Delhi");    
			      city.trimToSize();
			      System.out.println(city);  
				
				//creating vector
			      System.out.println("\n");
			      System.out.println("Vector");
			      Vector<Integer> vec = new Vector<Integer>();
			      vec.addElement(15); 
			      vec.addElement(30); 
			      System.out.println(vec);
				
				//creating linked list
			      System.out.println("\n");
			      System.out.println("LinkedList");
			      LinkedList<String> names=new LinkedList<String>();  
			      names.add("Alex");  
			      names.add("John");  	      
			      Iterator<String> itr=names.iterator();  
			      while(itr.hasNext()){  
			       System.out.println(itr.next());  
			       
			       //creating hashset
			       System.out.println("\n");
			       System.out.println("HashSet");
			       HashSet<Integer> set=new HashSet<Integer>();  
			       set.add(101);  
			       set.add(103);  
			       set.add(102);
			       set.add(104);
			       System.out.println(set);
			       
			       //creating linked hashset
			       System.out.println("\n");
			       System.out.println("LinkedHashSet");
			       LinkedHashSet<Boolean> set2=new LinkedHashSet<Boolean>();  
			       set2.add(true);  
			       set2.add(true);  
			       set2.add(true);
			       set2.add(false);	    
			       System.out.println(set2);
			      	} 
			      }  

	}
