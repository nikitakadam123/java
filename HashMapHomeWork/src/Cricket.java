
public class Cricket {
	
	private int JersyNo;
	private String Pname;
	private double Runs;
	private Float Avg;
	
	public Cricket(int jersyNo, String pname, double runs, Float avg) {
		super();
		JersyNo = jersyNo;
		Pname = pname;
		Runs = runs;
		Avg = avg;
	}

	public int getJersyNo() {
		return JersyNo;
	}

	public void setJersyNo(int jersyNo) {
		JersyNo = jersyNo;
	}

	public String getPname() {
		return Pname;
	}

	public void setPname(String pname) {
		Pname = pname;
	}

	public double getRuns() {
		return Runs;
	}

	public void setRuns(double runs) {
		Runs = runs;
	}

	public Float getAvg() {
		return Avg;
	}

	public void setAvg(Float avg) {
		Avg = avg;
	}
	
	

}
