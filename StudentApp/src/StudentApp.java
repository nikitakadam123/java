import java.util.Scanner;

public class StudentApp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Student Roll number: ");
		int rollNo=sc.nextInt();
		System.out.println("Enter Student Name : ");
		String sName=sc.next();
		System.out.println("Enter first subject Marks : ");
		int s1=sc.nextInt();
		System.out.println("Enter Second subject Marks : ");
		int s2=sc.nextInt();
		System.out.println("Enter 3rd subject Marks : ");
		int s3=sc.nextInt();
		
		int total=s1+s2+s3;
		float per=total/3;
		
		//System.out.println("Total marks is: "+total);
		//System.out.println("Total Persecntage is: "+per);
		
		
		System.out.println("\t\t**************STUDENT MARKLIST******************\t\t");
		System.out.println("\t\tStudent Roll Number: \t\t\t"+rollNo);
		System.out.println("\t\tStudent Name is  : \t\t\t"+sName);
		System.out.println("\t\tStudent 1st subject mark: \t\t"+s1);
		System.out.println("\t\tStudent 2nd subject mark: \t\t"+s2);
		System.out.println("\t\tStudent 3rd subject marks: \t\t"+s3);
		System.out.println("\t\tTotal marks in 3 subject : \t\t"+total);
		System.out.println("\t\tPersecntage of Student is: \t\t"+per);
		System.out.println("\t\t __________________Keep Going__________________\t\t");
        sc.close();
	}

}
