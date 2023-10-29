
public class DemoThreadMain {

	public static void main(String[] args) {
		DemoThread thread1=new DemoThread("Java");
		DemoThread thread2=new DemoThread("Python");
		
		thread1.start();
		thread2.start();
		
		thread1.setName("Nikita");
		thread2.setName("Kadam");
		
		System.out.println("Thread name: "+thread1.getName());
		System.out.println("Thread name: "+thread2.getName());
		thread2.setPriority(Thread.MAX_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		
		
		for(int i=1;i<5;i++)

		{
			System.out.println("Main "+i);
			/*try{
			     thread1.join();
			     thread2.join();
			     Thread.sleep(3000);
			     }
			     catch(InterruptedException e)
			     {
			     e.printStackTrace();
			     }
			 */
			System.out.println("Thank u!!");
		}
	}

}
