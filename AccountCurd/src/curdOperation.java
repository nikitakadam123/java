import java.util.*;
public class curdOperation {

	public static void main(String[] args) {
		
		List<Account> c=new ArrayList<Account>();
		Scanner s=new Scanner(System.in);
		Scanner s1=new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("1: Insert");
			System.out.println("2: Display");
			System.out.println("3: Search");
			System.out.println("4: Delete");
			System.out.println("5: Update");
			
			System.out.println("Enter your choice: ");
			ch=s.nextInt();
			switch(ch)
			{
			case 1: 
				System.out.println("Enter Account number: ");
				int accNo=s.nextInt();
				System.out.println("Enter Account Name: ");
				String accName=s1.next();
				System.out.println("Enter Account Bal: ");
				double accBal=s.nextDouble();
				
				c.add(new Account (accNo, accName, accBal));
				System.out.println("Record Insert successfully");
				break;
			case 2:
				/*Iterator <Account> i=c.iterator();
				while(i.hasNext()) {
					Account a=i.next();
					System.out.println(a);
				}
				break;*/
				   System.out.println("---------------------");
                   Iterator <Account> i = c.iterator();
                   while (i.hasNext()) {
                       Account a = i.next();
                       System.out.println(a);
                   }
                   System.out.println("---------------------");
                   break;
			case 3:
					boolean found=false;
					System.out.println("Enter Account number to search: ");
					int accno=s.nextInt();
					i=c.iterator();
					while(i.hasNext())
					{
						Account a=i.next();
						if(a.getAccNo()==accno)
						{
							System.out.println(a);
							found=true;
						}
					}
					if(!found) {
						System.out.println("Record Not found");
					}
					break;
				
				
			case 4:
				found= false;
				System.out.println("Enter Account number do u want to delete");
				accno=s.nextInt();
				i=c.iterator();
				while(i.hasNext()) {
					Account a=i.next();
					if(a.getAccNo()==accno);
					{
						i.remove();
						found=true;
					}
			}
			if(!found)
			{
				System.out.println("Record Not found for deleting");
			}
			else {
				System.out.println("Record Deleted");
			}
			break;
			case 5:
				found =false;
				System.out.println("Enter Account number to u want tom update ");
				accno=s.nextInt();
				ListIterator <Account> li=c.listIterator();
				while(li.hasNext())
				{
					Account a=li.next();
					if(a.getAccNo()==accno)
					{
						System.out.println("Enter New Name: ");
						accName=s1.next();
						System.out.println("Enter new Account Bal: ");
						accBal=s.nextDouble();
						li.set(new Account(accno, accName, accBal));
						found = true;
					}
				}
				if(!found)
				{
					System.out.println("Record not found for update ");
					
				}
				else {
					System.out.println("Record Updated!!");
				}
				break;
				
			}
			
		}while(ch!=0);
		
		

	}

}
