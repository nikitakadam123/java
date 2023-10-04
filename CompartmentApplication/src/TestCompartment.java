public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] c=new Compartment[10];
		c[0]=new FirstClass(101, "S-12", 11);
		c[1]=new General("A-10", 129, 45); 
		c[2]=new Ladies("D-15", 16);
		c[3]=new Luggage("C-14", 80, "Ramesh");
		display(c);
		
		}
	public static void display(Compartment carr[])
	{
		for(int i=0;i<carr.length;i++)
		{
			if(carr[i] instanceof FirstClass)
			{
				carr[i].notice();
			}
			else if(carr[i] instanceof General)
			{
				carr[i].notice();
			}
			else if(carr[i] instanceof Ladies)
			{
				carr[i].notice();
			}
			else if (carr[i] instanceof Luggage)
			{
				carr[i].notice();
			}
		}
	}
	
	
		
	}
