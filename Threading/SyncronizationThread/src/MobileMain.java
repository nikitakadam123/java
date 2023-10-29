
public class MobileMain {

	public static void main(String[] args) {
		Mobile mobj =new Mobile();
		MobileThrad thread1=new MobileThrad(mobj,"Nikita ");
		MobileThrad thread2=new MobileThrad(mobj,"Kadam ");
		
		thread1.start();
		thread2.start();
	    System.out.println("Thank u");

	}

}
