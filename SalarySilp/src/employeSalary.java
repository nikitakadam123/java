import java.util.Scanner;

public class employeSalary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter basic salary: ");
		float Basicsal=sc.nextInt();
		
		float Da = (Basicsal*0.1f);
		float Hra = Da+(Basicsal*0.5f);	
		float Conveyance = 1600;
		float Medical = 1250;
		float Gross = Basicsal+Da+Hra+Conveyance+Medical;
		float Eisc = (Gross * 0.0475f);
		float pf = (Basicsal * 0.12f);
		float NetBeforTax = Gross-Eisc-pf;
		float Tds = (NetBeforTax * 0.05f);
		float SalaryHand = NetBeforTax-Tds;
		
		System.out.println("\t\t---------------------------------------------------");
		System.out.println("\t\tBasic               |            "+Basicsal);
		System.out.println("\t\tDa                  |            "+Da);
		System.out.println("\t\tHra                 |            "+Hra);
		System.out.println("\t\tConveyance          |            "+Conveyance);
		System.out.println("\t\tMedical             |            "+Medical);
		System.out.println("\t\tEisc                |            "+Eisc);
		System.out.println("\t\tpf                  |            "+pf);
		System.out.println("\t\tNetBeforTax         |            "+NetBeforTax);
		System.out.println("\t\tTds                 |            "+Tds); 
		System.out.println("\t\t---------------------------------------------------");
		System.out.println("\t\tSalaryHand          |            "+SalaryHand);
		
		System.out.println("\t\t---------------------------------------------------");
		sc.close();

	}

}
