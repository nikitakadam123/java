
public class Car {
	
	private int ModNum;
	private String Carname;
	private String CarColour;
	private long price;
	public Car(int modNum, String carname, String carColour, long price) {
		super();
		ModNum = modNum;
		Carname = carname;
		CarColour = carColour;
		this.price = price;
	}
	public int getModNum() {
		return ModNum;
	}
	public void setModNum(int modNum) {
		ModNum = modNum;
	}
	public String getCarname() {
		return Carname;
	}
	public void setCarname(String carname) {
		Carname = carname;
	}
	public String getCarColour() {
		return CarColour;
	}
	public void setCarColour(String carColour) {
		CarColour = carColour;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	
	
	

}
