package practiceAssisted;

public class InnerClass {
	private String msg="Inner Classes";

	 void display(){  
		 class Inner{  
			 void msg(){
				 System.out.println(msg);
			 }  
	  }  
	  
	  Inner l=new Inner();  
	  l.msg();  
	 }  

	 
	public static void main(String[] args) {
		innerClass2  ob=new innerClass2 ();  
		ob.display();  
		}
	
		}
/*
		public class innerClass2 {

		
		}


		//anonymous inner class
		abstract class AnonymousInnerClass {
			   public abstract void display();
			}


			public class innerClass3 {

			public static void main(String[] args) {
			AnonymousInnerClass i = new AnonymousInnerClass() {

			         public void display() {
			            System.out.println("Anonymous Inner Class");
			         }
			      };
			      i.display();
			   }
			

	}*/


