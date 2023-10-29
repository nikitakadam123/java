import java.util.Scanner;
public class Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num = 0;
		int sum=0;
		System.out.println("How many nos. do you want to enter  ");
		int n1=sc.nextInt();
		for(int i=0;i<n1;i++)
		{
			System.out.println("Enter the number: ");
			int n=sc.nextInt();
			int revers=0;
			while(n!=0)
			{
				int rem=n%10;
				revers=revers*10+rem;
				n=n/10;
			}
			System.out.println("Reverse of given number is: "+revers);
			sum=sum+n;
			System.out.println("sum is: "+sum);
		}
		
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

	public static int sum(int n1,int n2,int n3,int n4,int n5)
	{
	int sum=n1+n2+n3+n4+n5;
	return sum;
	}

}
