import java.util.Scanner;
import java.util.LinkedList;
import java.util.List;
public class AccountInfo {
	public List<Account> create()
	{
		Scanner sc=new Scanner(System.in);
		List <Account> acc=new LinkedList<Account>();
		do {
			System.out.println("Enter Account No: ");
			int accNo=sc.nextInt();
			System.out.println("Enter Accountent Name: ");
			String name=sc.next();
			System.out.println("Enter Balance: ");
			double accBal=sc.nextDouble();
			
			Account accobj=new Account(accNo, name, accBal);
			acc.add(accobj);
			System.out.println("Do you want to continue? yess/Noo");
		}while(sc.next().equals("yes"));
		System.out.println("---------------------------------------");
		return acc;
	}

public void display(List<Account> acclist)
{
	for(Account a:acclist)
	{
		System.out.println(a.getAccNo()+"\t"+ a.getName()+"\t"+a.getAccBal());
	}
}
}
