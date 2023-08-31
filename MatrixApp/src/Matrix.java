
public class Matrix {

	public static void main(String[] args) {
		int mat[][]= {{10},
				     {20,30},
				     {40,50,60},
				     };
		int i,j;
		for(i=0;i<mat.length;i++)
		{
			for(j=0;j<mat[i].length;j++)
			{
				System.out.print(mat[i][j]+"\t");
			}
			System.out.println();

		}

	}

}
