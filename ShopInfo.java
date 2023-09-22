import java.util.Date;
import java.util.Scanner;

public class ShopInfo {
	
	public Customer accept() {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cust id");
		int custId=sc.nextInt();
		System.out.println("Cutomer Name");
		String custName=sc.next();
		System.out.println("Customer mobile number");
		String custMobNo=sc.next();

		System.out.println("Enter City");
		String city=sc.next();
		System.out.println("Enter State");
		String state=sc.next();
		System.out.println("Enter pincode");
		int pincode=sc.nextInt();

		System.out.println("How many product do you want");
		int n=sc.nextInt();//

		Product prodarr[]=new Product[n];
		for(int i=0;i<prodarr.length;i++)
		{
			System.out.println("Enter product id");
			int prodId=sc.nextInt();

			System.out.println("Enter product name");
			String prodName=sc.next();

			System.out.println("Enter product price");
			float prodPrice=sc.nextFloat();

			System.out.println("Enter product qty");
			int prodQty=sc.nextInt();
			prodarr[i]=new Product(prodId, prodName, prodPrice, prodQty);
		}
		Address addr=new Address("Pune","Mh",411005);
		Customer cust=new Customer(1,"Ganesh","12345",prodarr, addr);
		return cust;
	}
	public Bill calculateBill(Customer cust) {
		Product prodarr[]=cust.getProd();
		
		int billNo=101;
		double totalBill=0;
		double cgst;
		double sgst;
		double finalTotal;
		Date billDate=new Date();
		
		for(int i=0;i<prodarr.length;i++) {
			totalBill=totalBill+(prodarr[i].getProdPrice()*prodarr[i].getProdQty());
		}
		cgst=totalBill*0.06;
		sgst=totalBill*0.06;
		finalTotal=totalBill+cgst+sgst;
		Bill billobj=new Bill(billNo, totalBill, cgst, sgst, finalTotal, billDate);
		return billobj;
	}
	public  void display(Customer cust,Bill billObj) {

		System.out.println("\t\tCustomer Id \t\t: "+cust.getCustId());
		System.out.println("\t\tCustomer Name \t\t: "+cust.getCustName());
		System.out.println("\t\tCustomer MobNo \t\t: "+cust.getCustMobNo());
		System.out.println("------------------------------------------");
		Address addr=cust.getAddr();
		System.out.println("\t\tCity \t\t: "+addr.getCity());
		System.out.println("\t\tState \t\t: "+addr.getState());
		System.out.println("\t\tPincode \t\t: "+cust.getAddr().getPincode());
		System.out.println("-----------Product Details--------------");
		Product prodarr[]=cust.getProd();
		for(int i=0;i<prodarr.length;i++) {
			System.out.println("\t\t"+prodarr[i].getProdId()+"\t"+prodarr[i].getProdName()+"\t"+prodarr[i].getProdPrice()+"\t"+prodarr[i].getProdQty());
		}
		System.out.println("-----------BILL-------------------------------------");
		System.out.println("Bill Number : "+billObj.getBillNo()+"\t Date "+billObj.getBillDate());
		System.out.println("Bill Total : "+billObj.getTotalBill());
		System.out.println("Bill CGST : "+billObj.getCgst());
		System.out.println("Bill Sgat : "+billObj.getSgst());
		System.out.println("Final Bill : "+billObj.getFinalTotal());
		System.out.println("---------------------THANK YOU-----------------------------");
		System.out.println("----------------------------------------------");


	}


}
