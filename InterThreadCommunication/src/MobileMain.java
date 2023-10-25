
public class MobileMain {

	public static void main(String[] args) {
		Mobile mob=new Mobile();
		
		Producer thread1=new Producer("Nikita",mob);
		Consumer thread2=new Consumer("Kadam",mob);
		
		System.out.println("Thank u....");

	}

}
