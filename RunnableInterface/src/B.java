
public class B {

	public static void main(String[] args) {
		A aobj= new A();
		Thread t= new Thread(aobj);
		t.start();
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("My main Thread....");
		}
		

	}

}
