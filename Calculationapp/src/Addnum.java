import java.util.Scanner;
public class Addnum {

	public static void main(String[] args) {
		int n1;
		int n2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any two no: ");
		n1=sc.nextInt();
		n2=sc.nextInt();
		int add=n1+n2;
		System.out.println("addition of"+n1 +" and " +n1 +" ="  +add);
		
		sc.close();
		}
}
