package practiceAssisted;


//// creating a thread using inheritance / extending

public class Threads extends Thread{
	
	public void run() {
		
		System.out.print(getName()+" got executed\n");
		
		
	}

	public static void main(String[] args) {
		
		Threads th1 = new Threads();
		Threads th2 = new Threads();
		Threads th3 = new Threads();

		//System.out.println(th1.getState());
		//th1.setPriority(6);
		//System.out.println(th1.getName());
		//th2.setPriority(7);
		//System.out.println(th2.getName());
		//th3.setPriority(10);
		//System.out.println(th3.getName());
		th1.start();
		th2.start();
		th3.start();


	}

}
