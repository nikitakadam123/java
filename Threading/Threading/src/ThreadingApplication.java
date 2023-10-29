import java.util.Scanner;
public class ThreadingApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}

	}

}
