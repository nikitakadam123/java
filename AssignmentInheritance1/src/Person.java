
public class Person {
	private int apptNo;
	private String apptName;
	private String road;
	private int pinCode;
	public Person(int apptNo, String apptName, String road, int pinCode) {
		super();
		this.apptNo = apptNo;
		this.apptName = apptName;
		this.road = road;
		this.pinCode = pinCode;
	}
	public int getApptNo() {
		return apptNo;
	}
	public void setApptNo(int apptNo) {
		this.apptNo = apptNo;
	}
	public String getApptName() {
		return apptName;
	}
	public void setApptName(String apptName) {
		this.apptName = apptName;
	}
	public String getRoad() {
		return road;
	}
	public void setRoad(String road) {
		this.road = road;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	
}
