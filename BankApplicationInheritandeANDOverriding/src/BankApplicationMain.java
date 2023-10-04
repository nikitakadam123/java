import java.util.Scanner;
public class BankApplicationMain {

	public static void main(String[] args) {
	

			Account acc=null;
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter Customer Id");
			int custId=sc.nextInt();
			System.out.println("Enter Customer Name");
			String custName=sc.next();
			System.out.println("Enter Customer MobNo");
			String mobNo=sc.next();
			
			System.out.println("Enter Account data.....");
			System.out.println("Enter Account Number");
			int accNo=sc.nextInt();
			System.out.println("Enter Account Type");
			String accType=sc.next();
			System.out.println("Enter Account Balance");
			double accBal=sc.nextDouble();
			
			System.out.println("1-Saving Account \n2-Current Account");
			System.out.println("Enter your choice...");
			int ch=sc.nextInt();
			if(ch==1) {
				
				System.out.println("Enter interest rate");
				float interestRate=sc.nextFloat();
				acc=new SavingAccount(accNo, custName, accBal,interestRate);
			}
			else if(ch==2) {
				System.out.println("Enter Company Name");
				String companyName=sc.next();
				acc=new CurrentAccount(accNo,accType,accBal,companyName);
				
			}
			Customer cust=new Customer(custId,custName,mobNo,acc);
			display(cust);
		}
		public static void display(Customer cust) {
			
			System.out.println("Customer Id: "+cust.getCustId());
			System.out.println("Customer Name: "+cust.getCustName());
			System.out.println("Customer MobNo: "+cust.getMobNo());
			System.out.println("----------------------------------------");
			System.out.println("Account Number: "+cust.getAcc().getAccNo());
			System.out.println("Account Type: "+cust.getAcc().getAccType());
			System.out.println("Account Balance: "+cust.getAcc().getAccBal());
			Account acc=cust.getAcc();
			if(acc instanceof SavingAccount) {
				SavingAccount s=(SavingAccount)acc;
				System.out.println("Interest Rate: "+s.getIntrest());
			}
			else if(cust.getAcc()instanceof CurrentAccount) {
				
				CurrentAccount c=(CurrentAccount)cust.getAcc();
				System.out.println("Company Name: "+c.getCompanyName());
			}

	}

}
