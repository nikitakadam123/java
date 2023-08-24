import java.util.Scanner;
public class Area {
	
	Scanner sc= new Scanner(System.in);
	public void circleArea(){                           //Method()
		                                                   //Area of Circle
	System.out.println("Enter radius of circle: ");
	float r=sc.nextFloat();
	float ac=3.14f*r*r;
	System.out.println("Area of circle is: "+ac);
	}
	
	public void triangleArea(){
		System.out.println("Enter base: ");
		int b=sc.nextInt();
		System.out.println("Enter height: ");
		int h=sc.nextInt();
		float ta=0.5f*b*h;
		System.out.println("Area of triangle: "+ta);
		
	}
	
	public void rectiangleArea() {
		System.out.println("Enter lenght of rectriangle: ");
		int l=sc.nextInt();
		System.out.println("Enter breadth of rectriangle ");
		int b=sc.nextInt();
		int reca=l*b;
		System.out.println("Area of Rectriangle: "+reca);
		
	}
}
