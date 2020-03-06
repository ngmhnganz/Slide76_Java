package NguyenMinhNgan.com.model;

public class Hourly extends Employee {

	protected int hoursWorked;
	protected double tienCong;
	
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	private void addHours(int moreHours) {
		tienCong= moreHours*10;
	}
	@Override
	public double pay() {
		addHours(hoursWorked);
		return tienCong;
	}
	@Override
	public String toString() {
		String s= super.toString();
		return s+"\nGiờ công: "+hoursWorked;
	}

}
