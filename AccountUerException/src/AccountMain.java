
public class AccountMain {

	public static void main(String[] args) {
    AccountInfo ainfo=new AccountInfo();
    try {
    	Account acc=ainfo.createAccount();
    	System.out.println("Account is open");
        ainfo.displayAccount(acc);
    }
    
	
	catch(AccountBalException e)
	{
		e.printStackTrace();
	}
	System.out.println("Thank you!!!");
	}
}
