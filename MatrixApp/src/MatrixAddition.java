import java.util.Scanner;
public class MatrixAddition {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many rows do you want in matrix1");
		int r1=sc.nextInt();
		int mat1[][]=new int[r1][];    //allocate only row col will add dynamically
		System.out.println("How many col do you want in each row");
		for(int i=0;i<mat1.length;i++) {
			System.out.println("enter col for "+(i+1)+" next row");
		    mat1[i]=new int[sc.nextInt()];     //for first row two col
		}
		
		System.out.println("How many rows do you want in matrix2");
		int r2=sc.nextInt();
		
		int mat2[][]=new int[r2][];
		System.out.println("How many col do you want in each row");
		for(int i=0;i<mat2.length;i++)
		{
			System.out.println("Enter col for "+(i+1)+" next row");
			mat2[i]=new int[sc.nextInt()];
		}
		boolean flag=true;
		//check both matrix same or not
		if(mat1.length==mat2.length)
		{
			//check col for both matrix
			for(int i=0;i<mat1[i].length;i++)
			{
				if(mat1[i].length!=mat2[i].length)
				{
					flag=false;
					break;
				}
				
			}
		}
		if(flag) {
			System.out.println("Enter element in matrix 1st: ");
			for(int i=0;i<mat1.length;i++)
				
			{
				for(int j=0;j<mat2[i].length;i++)
				{
				mat1[i][j]=sc.nextInt();
				
			}
		}
			System.out.println("Enter element in matrix 2nd: ");
			for(int i=0;i<mat1.length;i++)
				
			{
				for(int j=0;j<mat2[i].length;j++)
				{
				mat2[i][j]=sc.nextInt();
				
			}
		}
	// allocate memory for matrix 3
			int mat3[][]=new int[mat1.length][];
			for(int i=0;i<mat3.length;i++)
			{
				mat3[i]=new int[mat1[i].length];
			}
	//addition of two matrix....
			for(int i=0;i<mat1.length;i++)
			{
				for(int j=0;j<mat1[i].length;j++)
				{
					mat3[i][j]=mat1[i][j]+mat2[i][j];
				}
			}
         System.out.println("---------------Matrix 3------------------");
         for(int  i=0;i<mat3.length;i++)
         {
        	 for(int j=0;j<mat3[i].length;j++)
        	 {
        		 System.out.println(mat3[i][j]+"\t");
        	 }
        	 System.out.println();
         }
         
	}
		else {
			System.out.println("Addition not possible ");
		}
		System.out.println("Thank you");
	}
}
