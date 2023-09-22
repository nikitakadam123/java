import java.util.Scanner;

public class ShopMain {
	
	public static void main(String[] args) {
		
		ShopInfo sinfo=new ShopInfo();
		
		Customer cust=sinfo.accept();
		Bill billObj=sinfo.calculateBill(cust);
		sinfo.display(cust,billObj);
		
	}
}
