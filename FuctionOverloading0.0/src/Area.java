
public class Area {

	public void calArea(float r)
	{
		float ca=3.14f*r*r;
		System.out.println("Area of Circle is: "+ca);
		
	}
	public void calArea(float a,float b)
	{
		float ta=0.5f*a*b;
		System.out.println("Area of Triangle is: "+ta);
	}
	public void calArea(int l,int b)
	{
		float ra=l*b;
		System.out.println("Area of Rectangle is: "+ra);
	}
}
