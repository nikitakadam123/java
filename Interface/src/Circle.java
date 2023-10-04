
public class Circle implements Shape {
	private double r;
	public Circle(double r) {
		super();
		this.r=r;
		
	}
public void findArea() {
	double ca=3.14*r*r;
	System.out.println("Area of Circle is: "+ca);
}

public void sayThank() {
	System.out.println("Thank you!!");
	
}
}
