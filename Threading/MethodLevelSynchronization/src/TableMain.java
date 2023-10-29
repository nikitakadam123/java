
public class TableMain {

	public static void main(String[] args) {
	
		Table obj1=new Table();
		Table obj2=new Table();
		
		Thread1 t1= new Thread1(obj1,4);
		Thread1 t2=new Thread1(obj2,5);
		
		t1.start().join;
		t2.start();
		

	}

}
