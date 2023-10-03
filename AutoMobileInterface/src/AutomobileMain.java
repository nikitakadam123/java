import java.util.Scanner;
public class AutomobileMain {

	public static void main(String[] args) {
		int ch=0;
		String c=null;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				break;
			
			}
			System.out.println("Do you want to continue Yes/No? ");
			c=sc.next();
		}while(c=="yes");    //sc.(next)equal.("yes");

	}

}
