import java.util.Scanner;
public class Matrix_Addition {

	public static void main(String[] args) {
		int r1,r2,c1,c2;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter no. of row in matrix 1st: ");
		r1=sc.nextInt();
		
		System.out.print("Enter no. of column in matrix 1st: ");
		c1=sc.nextInt();
		
		System.out.print("Enter no. of row in matrix 2nd: ");
		r2=sc.nextInt();
		
		System.out.print("Enter no. of column in matrix 2nd: ");
		c2=sc.nextInt();
		
		if(r1==r2 && c1==c2)
		{
			int a[][]=new int[r1][c1];
			int b[][]=new int[r2][c2];
			int c[][]=new int[r1][c1];
		System.out.println("Enter All Element in matrix 1st: ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter All Element in matrix 2nd: ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Element in matrix 1st: ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		System.out.println("Element in matrix 2nd: ");
		for(int i=0;i<r2;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(b[i][j]+"\t");
			}
			System.out.println(" ");
		}
		
		
		//Addition of matrix
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				for(int k=0;k<c1;k++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
		}
		
		System.out.println("After addition of two matrix: ");
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c1;j++)
			{
				System.out.print(c[i][j]+"\t");
				
			}
		}
		System.out.println(" ");
		}
		else
		{
			System.out.println("Addition Not Possible");
		}
	}

}
