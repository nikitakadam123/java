import java.util.Scanner;
public class operation1Main {

	public static void main(String[] args) {
		
		int n=0,c;
		int arr[]=new int[20];
		int ch=0;
		boolean b=false;
		String str=null;
		Scanner sc=new Scanner(System.in);
		operation2 o= new operation2();
		do {
			System.out.println("\n1: Create \n2: Display \n3: Search \n4: Sort \n5: Insert \n6: Delete");
			ch=sc.nextInt();
			switch(ch)
			{
			case 1: 
				n=o.insertElement(arr);
				System.out.println("Element Inserted");
				break;
			case 2: 
				o.display(arr, n);
				break;
			case 3:
				System.out.println("Enter element u want to searcn in array ");
				int search=sc.nextInt();
				b=o.searchData(arr, n, search);
				{
					if(b==true)
					{
						System.out.println("Element Found");
					}
					else {
						System.out.println("Element Not Found");
					}
				}
				break;
			case 4:
				o.sort(arr, n);
				break;
			case 5:
				
				int x=0;
				int pos=0;
				System.out.println("Enter the new element which u want to insert ");
				x=sc.nextInt();
				System.out.println("Enter location where ele is inserted");
				pos=sc.nextInt();
				
				o.insertNewValue(arr,n,x,pos);
				break;
			case 6:
				System.out.println("Enter location where frome you wish to delete element");
				pos=sc.nextInt();
				o.deleteElement(arr, n, pos);
				
				
			}
			
			System.out.println("Do You want to Continue? Yes/No");
			str=sc.next();
		}while(str.equals("yes"));
		System.out.println("------------------ Thank You ------------------------------");

	}

}
