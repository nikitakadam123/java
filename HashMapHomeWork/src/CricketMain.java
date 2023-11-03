import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CricketMain {

	public static void main(String[] args) {
		
		Map<String, Cricket> cric=new HashMap<String, Cricket>();
		cric.put("India", new Cricket(45, "Rohit Sharma", 264, (float) 68.76));
		cric.put("NewZealand", new Cricket(12, "K williomson", 179, (float) 48.76));
		cric.put("Australia", new Cricket(43, "Glenn Maxwell", 124, (float) 58.76));
		cric.put("England", new Cricket(333, "Johny Bairstow", 264, (float) 43.76));
		cric.put("South Africa", new Cricket(455, "AB Devillers", 214, (float) 65.76));
		
		display(cric);
	}
	
	public static void display(Map<String, Cricket>map) 
	{
	Set<String> carset=map.keySet();
		for(String s:carset) 
		{
			Cricket c=map.get(s);
			System.out.println(""+s+"->\t"+c.getJersyNo()+"\t"+c.getPname()+"\t"+c.getRuns()+"\t"+c.getAvg());
		}
		
	}

}
