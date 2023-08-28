import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[5];
		int sum=0,even=0,odd=0;
		
		System.out.println("Enter Element in array");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			
			if(arr[i]%2==0)
			{
				even++;
			}
			else {
				odd++;
			}
			sum=sum+arr[i];
		}
		
		System.out.println("Sum of array element is: "+sum);
		System.out.println("sum of even no. in array is: "+even);
		System.out.println("Sum of odd no. in array is: "+odd);
		System.out.println("Display Array");
		for(int i=0;i<arr.length;i++)                  //print 0 to 4 array
		{
			System.out.println(arr[i]);
		}
       
		System.out.println("Reverse Array");
        for(int i=arr.length-1;i>=0;i--)              //reverse array logic
		{
			System.out.println(arr[i]);
		}
	}

}
