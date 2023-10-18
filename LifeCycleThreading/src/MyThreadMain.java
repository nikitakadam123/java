
public class MyThreadMain {

	public static void main(String[] args) {
		MyThread my=new MyThread("java");   //create
		my.start();                         //runnable
		//System.out.println("Thank Youuuu");
		my.mymethod();
	}
}
