import java.util.Scanner;
public class Matrix_multipication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int r1,r2,c1,c2;
		System.out.println("Enter number of row in mat1: ");
		r1=sc.nextInt();
		System.out.println("Enter number of column in mat1: ");
		c1=sc.nextInt();
		System.out.println("Enter number of row in mat2: ");
		r2=sc.nextInt();
		System.out.println("Enter number of column in mat2: ");
		c2=sc.nextInt();
		
		if (c1 != r2) 
		{
		      System.out.println("Matrix multiplication is not possible");
		      return;
		}
			int a[][]=new int [r1][c1];
			int b[][]=new int [r2][c2];
			int c[][]=new int [r1][c2];
			System.out.println("Enter all element in mat1: ");

			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter all element in mat2: ");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=sc.nextInt();
				}
			}
			
			System.out.println("Element in matrix 1 is: ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)	
				{
					System.out.print(a[i][j]+" ");
				}
				System.out.println(" ");
			}
			
			
			System.out.println("Element in matrix 2 is: ");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)	
				{
					System.out.print(b[i][j]+" ");
				}
				System.out.println(" ");
			}
			
			
			
			//matrix multipication
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					c[i][j]=0;
					for(int k=0;k<c1;k++)
					{
						c[i][j] += a[i][k] * b[k][j];
					}
				}
			}
			
			System.out.println("After Multipication of two matrix: ");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c2;j++)
				{
					for(int k=0;k<c1;k++)
					{
					System.out.print(c[i][j]+"\t");
					}
				}
				System.out.println(" ");
			}
			
			}
			
		}


