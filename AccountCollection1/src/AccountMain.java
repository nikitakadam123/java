import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
import java.util.Collection;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
public class AccountMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		do {
			System.out.println("Enter Your choice ");
			System.out.println("1: Create");
			System.out.println("2: Display");
			System.out.println("3: Search");
			System.out.println("4: Delete");
			Collection<Account> acc=new ArrayList<Account>();
			int ch=sc.nextInt();
			
			switch(ch)
			{
			case 1:
				//List <Account> acc=new LinkedList<Account>();
				do {
					System.out.println("Enter Account No: ");
					int accNo=sc.nextInt();
					System.out.println("Enter Accountent Name: ");
					String name=sc.next();
					System.out.println("Enter Balance: ");
					double accBal=sc.nextDouble();
					
					acc.add(new Account(accNo, name, accBal));
					
					System.out.println("Do you want to continue? yes/no");
				}while(sc.next().equals("yes||YES||Yes"));
				System.out.println("---------------------------------------");
				
	
			break;
			case 2:
				//System.out.println("------------------------------");
				java.util.Iterator<Account> i=acc.iterator();
				while(i.hasNext());
				char[] a=null;
				System.out.println(a);
				break;
			case 3:
				boolean found = false;
				System.out.println("Enter account number do u want to search: ");
				int accNo=sc.nextInt();
				i=acc.iterator();
				while(i.hasNext()) {
				
				Account a1=i.next();
				if(a1.getAccNo()==accNo)
				{
					System.out.println(a1);
					found=true;
					System.out.println("Found");
				}
				
				}
				if(!found)
				{
					System.out.println("Record not found");
				}
				
	   break;	
			case 4:
				found =false;
				System.out.println("Enter account no to delete");
				accNo = sc.nextInt();
				System.out.println("-------------------------");
				i = acc.iterator();
				while(i.hasNext())
				{
					Account a1=i.next();
					if(a1.getAccNo()==accNo)
					{
						i.remove();
						found=true;
					}
					
				}
				if(!found)
				{
					System.out.println("Record Not found");
				}
				else {
					System.out.println("Record is deleted ");
				}
				break;
			
			}
			System.out.println("Do you want to continue? yes/no");
		}while(sc.next().equals("yes"));
		
	}

}
