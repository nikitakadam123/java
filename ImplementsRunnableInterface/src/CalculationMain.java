
public class CalculationMain {

	public static void main(String[] args) {
		Caclulation c=new Caclulation(60,20);
		CalculationThread cthread1=new CalculationThread(c);
		System.out.println("Thank You");
	}
}
