package practiceAssisted;

public class SleepWait {
	private static Object obj = new Object();
	public static void main(String[] args) throws InterruptedException {
		// main thread name
		System.out.println(Thread.currentThread().getName());
		// the thread will got sleep 5 seconds
		System.out.println("Going to sleep....");
		//Thread class use sleep method
		Thread.sleep(5000);
		//After 5 seconds sleep is over thread woken.
		System.out.println("Woke up from sleep");
	
	
	 
	 
	 synchronized(obj) {
		System.out.println("Waiting started");
		// the thread will got sleep 3 seconds
		// objects use wait method
		obj.wait(3000);

		System.out.println("Wait is over....");
	 }
}
}
