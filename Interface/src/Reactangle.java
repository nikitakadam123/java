
public class Reactangle implements Shape {
	private double l;
	private double w;
	public Reactangle(double l,double w) {
		super();
		this.l=l;
		this.w=w;
		
	}
	
	public void findArea() {
		double ra=l*w;
		System.out.println("Area of Rectangle is: "+ra);
		
	}
	
	public void sayThank() {
		System.out.println("Byeee!!!");
		
	}
	
	

}
