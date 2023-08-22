import java.util.Scanner;

public class productElect {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product ID: ");
		int pId=sc.nextInt();
		System.out.println("Enter product Name: ");
		String pNmae=sc.next();
		System.out.println("Enter product Qty: ");
		int pQty=sc.nextInt();
		System.out.println("Enter product Price: ");
		int pPrice=sc.nextInt();
		
		int total=pPrice*pPrice;
	 	float cgst=total*0.06f;
	 	float sgst=total*0.06f;
	 	float finaltotal=total+cgst+sgst;
	 	
	 	System.out.println("\t***\t---------------Product Bill--------------\t***\t");
	 	System.out.println("\t\t Enter Product id:         |\t\t"+pId);
	 	System.out.println("\t\t Enter Product Name:       |\t\t"+pNmae);
	 	System.out.println("\t\t Enter Product Qty:        |\t\t"+pQty);
	 	System.out.println("\t\t Enter Product Price:      |\t\t"+pPrice);
	 	System.out.println("\t\t Total is:                 |\t\t"+total);
	 	System.out.println("\t\t cgst is :                 |\t\t"+cgst);
	 	System.out.println("\t\t sgst is :                 |\t\t"+sgst);
	 	System.out.println("\t\t final total is :          |\t\t"+finaltotal);
	    System.out.println("\t***\t-----------------Thank you-----------------\t***\t");
		sc.close();
		

	}

}
