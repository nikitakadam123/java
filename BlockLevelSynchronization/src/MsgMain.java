
public class MsgMain {

	public static void main(String[] args) {
		Msg m=new Msg();
		Thread1 t1=new Thread1(m, "Nikita");
		Thread1 t2=new Thread1(m, "Kadam");

		t1.start();
		t2.start();
	}

}
