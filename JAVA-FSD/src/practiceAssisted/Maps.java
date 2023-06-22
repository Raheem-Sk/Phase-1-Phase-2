package practiceAssisted;
import java.util.*;
public class Maps {

	public static void main(String[] args) {

				//Hashmap
				HashMap<Integer,String> hm=new HashMap<Integer,String>();      
			      hm.put(1,"Tim");    
			      hm.put(2,"Mary");    
			      hm.put(3,"Catie");

			       
			      System.out.println("\nThe elements of Hashmap are ");  
			      for(int  m: hm.keySet()){    
			       System.out.println(m+" "+hm.get(m));    
			      }
			      
			     //HashTable
			       
			      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
			      
			      ht.put(4,"Ales");  
			      
			      ht.put(7,"John");
			      ht.put(5,"Rosy");  
			      ht.put(6,"Jack"); 
			      
			      System.out.println("\nThe elements of HashTable are ");  
			      for(int  m: ht.keySet()){    
				       System.out.println(m+" "+ht.get(m));    
				      }
			      
			      
			      //TreeMap
			      
			      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
			         
			      map.put(9,"Carlotte");    
			      map.put(10,"Catie");   
			      map.put(8,"Annie"); 
			      System.out.println("\nThe elements of TreeMap are ");  
			      for(int l:map.keySet()){    
			       System.out.println(l+" "+map.get(l));    
			      }    
			      
			   }  
		

	}


