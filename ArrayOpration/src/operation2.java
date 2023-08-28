import java.util.Scanner;
public class operation2 {
	int n=0,i;
	Scanner sc= new Scanner(System.in);
	
	public int insertElement(int arr[])
	{
		System.out.println("How many Element do you want in array? ");
		n= sc.nextInt();
		System.out.println("Enter element in array: ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		return n;
	}
	
	public void display(int arr[],int n)
	{
		System.out.println("Elements in array: ");
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public boolean searchData(int arr[], int n, int search) 
	{
		boolean b=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==search)
			{
				b=true;
				break;
			}
		}
		return b;
		
	}

	public void sort(int arr[],int i)
	{
		int temp=0;
		for(i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		System.out.println("Display array");
		for(i=0;i<=n;i++)
		{
			
			System.out.println(arr[i]);
		}
	}
		
	public int insertNewValue(int arr[],int n, int x,int pos)
	{
		n=n+1;
		for(int i=n-1;i>=pos;i--)
		{
			arr[i]=arr[i-1];
			arr[pos-1]=arr[i-1];
			arr[pos-1]=x;
		}
		System.out.println("Element inseted");
		return n;
	}
	
	public int deleteElement(int arr[],int n, int pos)
	{
		
		if(pos>=n+1)
		{
			System.out.println("Deletion not possible");
		}
		else {
			for(int i=pos-1;i<n-1;i++)
			arr[i]=arr[i+1];
			System.out.println("Resultant array");
			for(int i=0;i<n-1;i++)
			{
				System.out.println(" "+arr[i]);
			}
		}
		return n;

	}
		
	}
	


