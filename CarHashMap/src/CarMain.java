import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarMain 
{

	public static void main(String[] args) 
	{
		Map<String, Car> mycar=new HashMap<String, Car>();
		mycar.put("Tata", new Car(123, "Nexon ", "Red", 8500000));
		mycar.put("BMW", new Car(223, "BMW1", "Gray", 12500000));
		mycar.put("Toyota", new Car(323, "innova", "white", 45000000));	
		mycar.put("Maruti", new Car(423, "Alto800", "Black", 5500000));
		mycar.put("Ford", new Car(523, "Fortu", "brown", 7500000));
		
		display(mycar);
	}
	
	public static void display(Map<String, Car>map) 
	{
	Set<String> carset=map.keySet();
		for(String s:carset) 
		{
			Car c=map.get(s);
			System.out.println(c.getModNum()+"\t"+c.getCarname()+"\t"+c.getCarColour()+"\t"+c.getPrice());
		}
		
	}

}
