import java.util.Scanner;
public class AccountInfo {
	Scanner sc=new Scanner(System.in);

	public Account createAccount() throws AccountBalException
	{
		Account acc=null;
		System.out.println("Enter Account Number");
		int accNo=sc.nextInt();
		System.out.println("Enter Customer Name: ");
		String custName=sc.next();
		System.out.println("Enter Account Balance: ");
		double accBal=sc.nextDouble();
		System.out.println("Enter Customer age: ");
        int age=sc.nextInt();
        
        try {
        	if(accBal<1000)
        	{
        		throw new AccountBalException(accBal);
        	}
        	acc=new Account(accNo, custName, accBal, age);
        }
        catch(AccountBalException e)
        {
        	e.printStackTrace();
        	throw e;
        	
        }
        return acc;
	}
	public void displayAccount(Account acc)
	{
		System.out.println("Account Number is: "+acc.getAccNo());
		System.out.println("Customer Name is: "+acc.getCustName());
		System.out.println("Account Balance is: "+acc.getAccBal());
		System.out.println("Customer Age is: "+acc.getAge());
	}

}
