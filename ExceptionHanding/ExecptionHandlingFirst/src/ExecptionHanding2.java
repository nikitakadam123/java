import java.util.Scanner;
public class ExecptionHanding2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
		try {
				int n1=Integer.parseInt(args[0]);
				int n2=Integer.parseInt(args[1]);
				System.out.println("Hello....");
			    float div=n1/n2;
			    //throws new ArithmeticException();
			    System.out.println("Result is: "+div);
			}
		catch(ArithmeticException ex) {
				System.out.println("Arithmetic Exception "+ex);
			}
		catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Aarray Exception: "+ex);
			}
		catch(NumberFormatException ex)
			{
				System.out.println("Number Excption"+ex);
			}
		catch(Exception ex) {
				System.out.println("Other Exception "+ex);
			}
		finally {
			System.out.println("Run This Block any Time");
		}
		System.out.println("Thank you!!");	
		}
	
	}


