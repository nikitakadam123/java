import java.util.Scanner;
public class Logic {
	
	Scanner sc= new Scanner(System.in);
	
	//factor
	public void factor()
	{
		System.out.println("Enter any number: ");
		int n1=sc.nextInt();
	    int i=2;
		while(i<n1/2)
		{
			if(n1%i==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
	
	//factorial()
	public void factorial()
	{
		int i=1;
		int fact=1;
		System.out.println("Enter any number: ");
		int n1=sc.nextInt();
		for(i=1;i<=n1;i++)
		{
			fact=fact*i;	
		}
		System.out.println(fact);
		
	}

     //Reverse of number
	public void reverse(){
		int num,i;
		int r=0;
		int rev=0;
		
		System.out.println("Enter any number");
		num=sc.nextInt();
		
		while(num!=0)
		{
			r=num%10;
			rev=rev*10+r;
			num=num/10;
		}
		System.out.println(rev);
		
	}	
	//Armstrong Number
		
		
		public void armstrong() {
			int r=0,n=0,sum=0,temp=0,i;
			System.out.println("Enter any number to check wather no.is armstrong or not ");
			int n1=sc.nextInt();
			System.out.println("*********************OutPut**************************");
			temp=n1;
			while(n1>0)
			
			{
				r=n1%10;
				sum=(sum)+(r*r*r);
				n1=n1/10;
			}
			if(temp==sum)
			{
				System.out.println("Okayyy Armstrong number.");
				
			}
			else {
				System.out.println("Sorry !! Not Armstrong number.");
			}
		}
		
		//palindrome number
		
		public void palindrome() {
			int r=0,n=0,sum=0,temp=0,i;
			System.out.println("Enter any number to check wather no.is palindrome or not ");
			int n1=sc.nextInt();
			temp=n1;
			while(n1>0)
			
			{
				r=n1%10;
				sum=(sum*10)+r;
				n1=n1/10;
			}
			System.out.println("*******************Output is*****************");
			if(temp==sum)
			{
				System.out.println("Palindrome number");
				
			}
			else {
				System.out.println("Not Palindrome number");
			}
		}
		
		//swapping of two veriable
		
		public void swap1(){
			int n1,n2;
			int temp=0;
			System.out.println("Enter 1st number: ");
			n1=sc.nextInt();
			System.out.println("Enter 2nd number: ");
			n2=sc.nextInt();
			System.out.println("****************Reverse number is*****************");
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
			System.out.println(n1);
			System.out.println(n2);
		}

		
		public void fibbo()
		{
			int n1=0,n2=1,n3,n,i;
			System.out.println("Enter any number: ");
			n=sc.nextInt();
			System.out.println("1st number "+n1);
			System.out.println("2nd number "+n2);
			System.out.println("***************Fibbo series is*****************");
			for(i=0;i<n;i++)
			{
				n3=n1+n2;
				System.out.println(n3);
				n1=n2;
				n2=n3;
				
			}
		}
		public void power() {
			int r=1;
			System.out.println("Enter Base: ");
			int b=sc.nextInt();
			System.out.println("Enter Power");
			int p=sc.nextInt();
			System.out.println("**********************OutPut is*********************");
			for(int i=1;i<=p;i++)
			{
				r=r*b;
			}
			System.out.println(r);
		
		}
		public void prime() {
			int x=1;
			System.out.println("Enter any number ");
			int n=sc.nextInt();
			System.out.println("******************OutPut***************************");
			int p=sc.nextInt();
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					x=0;
					break;
				}
			
			}
			if(x==1)
			{
				System.out.println("Prime number!!!!");
			}
			else {
				System.out.println("Not Prime Number!!!");
			}
		
		
		}
		
		public void evenodd(){
			
			int n;
			System.out.println("Enter any number: ");
			n=sc.nextInt();
			if(n%2==0)
			{
				System.out.println("Entered number is even number!!");
			}
			else if(n%2-1==0)
			{
				System.out.println("Entered number is odd number!!");
			}
		}
}
