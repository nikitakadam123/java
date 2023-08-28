import java.util.Scanner;
public class operation1 {

	public static void main(String[] args) {
		int ch=0,n=0,c=0;
	    String str=null;
		int arr[]=new int[20];
		Scanner sc= new Scanner(System.in);
		
		do {
			System.out.println("\n1: Create \n2: Display \n3: Search \n4: Sort \n5: Insert \n6: Delete");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
				System.out.println("Number of Element in array? ");
				n=sc.nextInt();
				System.out.println("Enter Elements in array are: ");
				for(int i=0;i<=n;i++)
				{
					arr[i]=sc.nextInt();
				}
				break;
			case 2:
				
				System.out.println("Display array");
				for(int i=0;i<=n;i++)
				{
					
					System.out.println(arr[i]);
				}
				break;
			case 3:
				int flag=0;
				System.out.println("Enter element which u want to search: ");
				int search=sc.nextInt();
				for(int i=0;i<n;i++)
				{
					if(arr[i]==search)
					{
						flag=1;
						break;
					}
				}
				if(flag==1)
				{
					System.out.println("Element Found");
				}
				else {
					System.out.println("Element Not Found");
				}
				break;
			case 4: 
				int temp=0;
				for(int i=0;i<n;i++)
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
				for(int i=0;i<=n;i++)
				{
					
					System.out.println(arr[i]);
				}
				
				break;
			case 5: 
				int x=0;
				int pos=0;
				System.out.println("Enter the new element which u want to insert ");
				x=sc.nextInt();
				System.out.println("Enter location where ele is inserted");
				pos=sc.nextInt();
				n=n+1;
				for(int i=n-1;i>=pos;i--)
				{
					arr[i]=arr[i-1];
					arr[pos-1]=arr[i-1];
					arr[pos-1]=x;
				}
				System.out.println("Element inseted");
				break;
			case 6:
				
				System.out.println("Enter location where frome you wish to delete element");
				pos=sc.nextInt();
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
				break;
		}
		
		System.out.println("Do you want to continue? press 1 ");
		c=sc.nextInt();
		}while(c==1);
		System.out.println("--------------------Thank You------------------------");
		
		
	}

}
