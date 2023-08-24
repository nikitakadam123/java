import java.util.Scanner;
public class LogicsMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Logic logicObj=new Logic();
        int ch=0;
        int c=0;
        do {
        	System.out.println("\n1-Factor \n2-Factorial \n3-Reverse number \n4-Armstrong Number \n5-Palindrome Number \n6-Swap two number \n7-fibbo \n8-power \n9-Prime number \n10-EvenOdd number");
        	System.out.println("Enter your Choice: ");
        	ch=sc.nextInt();
        	switch(ch) {
        	case 1: 
        		System.out.println("***********************************************");
        		logicObj.factor();
        		break;
        	case 2:
        		System.out.println("***********************************************");
        		logicObj.factorial();
        		break;
        	case 3:
        		System.out.println("***********************************************");
        		logicObj.reverse();
        		break;
        	case 4:
        		System.out.println("***********************************************");
        		logicObj.armstrong();
        		break;
        	case 5:
        		System.out.println("***********************************************");
        		logicObj.palindrome();
        		break;
        	case 6:
        		System.out.println("***********************************************");
        		logicObj.swap1();
        		break;
        	case 7:
        		System.out.println("***********************************************");
        		logicObj.fibbo();
        		break;
        	case 8:
        		System.out.println("***********************************************");
        		logicObj.power();
        		break;
        	case 9:
        		System.out.println("***********************************************");
        		logicObj.prime();
        		break;
        	case 10:
        		System.out.println("***********************************************");
        		logicObj.evenodd();
        		break;
        	}
        	System.out.println("Do you want to Continue? press 1 ");
        	c=sc.nextInt();
        	
        	
        }while(c==1);
		
	}

}
