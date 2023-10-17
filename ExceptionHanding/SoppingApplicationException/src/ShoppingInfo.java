import java.util.Scanner;
public class ShoppingInfo {
	public Shopping create() throws ShoppingPriceExecption
	{

		Shopping sh=null;
		Scanner sc=new Scanner(System.in);
		

		System.out.println("Enter Customer Id");
		int custId=sc.nextInt();
		System.out.println("Enter Customer Name: ");
		String custName=sc.next();
		System.out.println("Enter Product Name: ");
		String product=sc.next();
		System.out.println("Enter Product Price: ");
		int productPrice=sc.nextInt();
		System.out.println("Enter Product Qty");
		int prodQty=sc.nextInt();
		
		try {
			if(productPrice<200)
			{
				throw new ShoppingPriceExecption(productPrice);
			}
			sh=new Shopping(custId, custName, product, productPrice, prodQty)
		}
		catch(ShoppingPriceExecption e) {
			e.printStackTrace();
        	throw e;
		}
	    return sh;
		
		
		
		
	}

}
