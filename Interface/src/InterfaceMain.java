
public class InterfaceMain {

	public static void main(String[] args) {
		Shape s[]=new Shape[4];
		s[0]=new Circle(2.2);
		s[1]=new Circle(3.2);
		s[2]=new Reactangle(2.2,3.2);
		s[3]=new Reactangle(1.2,1.2);
		//s[4]=new Reactangle(2.2,1.2);
		
		dispay(s);
}
	
	public static void dispay(Shape arr[])
	{
		for(Shape s:arr) {
			if(s instanceof Circle) {
				s.findArea();
			}
			if(s instanceof Reactangle) {
				s.findArea();
			}
		}
	}
}
