package practiceAssisted;


//// creating a thread using inheritance / extending
interface Second{
		void mimple();
}

public class Threads implements Runnable,Second{
	
	public void run() {
		
		System.out.print("I got executed\n");
		
		
	}

	public static void main(String[] args) {
		
		Threads th1 = new Threads();
		Thread th11 = new Thread(th1);
		//Threads th2 = new Threads();
		//Threads th3 = new Threads();

		//System.out.println(th1.getState());
		//th1.setPriority(6);
		//System.out.println(th1.getName());
		//th2.setPriority(7);
		//System.out.println(th2.getName());
		//th3.setPriority(10);
		//System.out.println(th3.getName());
		th11.start();
		//th2.start();
		//th3.start();
		th1.mimple();
		

	}

	@Override
	public void mimple() {
		System.out.println("i extecuted just now");
	}

}
