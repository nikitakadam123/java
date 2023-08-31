//import java.util.Arrays;
import java.util.Scanner;
public class matrix_input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int mat[][]=new int[4][]; //allocate row only col allocate automatically or dynamicallay
		mat[0]=new int[2];        //1st row 2 col
		mat[1]=new int[3];        //2nd row 3 col
		mat[2]=new int[4];        //3rd row 4 col
		mat[3]=new int[1];        //4th row 1 col
		
		
	    System.out.println("Enter the elements in Matrix: ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
               
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix is: ");
        for(int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();

		}

	}

}
