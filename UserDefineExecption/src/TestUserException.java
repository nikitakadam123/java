import java.util.Scanner;
public class TestUserException {

	public static void main(String[] args) {
		int rno;
		String name;
		int age;
		float per;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Student rno: ");
		rno=sc.nextInt();
		System.out.println("Enter Student Name: ");
		name=sc.next();
		System.out.println("Enter Student age: ");
		age=sc.nextInt();
		System.out.println("Enter Student Percentage: ");
		per =sc.nextFloat();
		
		try {
			if(age<18)
			{
				throw new InvalidAgeException();
			}
			if(per<70)
			{
				throw new InvalidPercentageException();
			}
		}
		catch(InvalidAgeException e)
		{
			System.out.println(e);
		}
		catch(InvalidPercentageException ex) {
			System.out.println(ex);
		}
	}

}
