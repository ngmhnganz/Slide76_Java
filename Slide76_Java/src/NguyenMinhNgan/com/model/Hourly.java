package NguyenMinhNgan.com.model;

public class Hourly extends Employee {

	protected int hoursWorked;
	public int getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String getSocialSecurityNumber() {
		// TODO Auto-generated method stub
		return super.getSocialSecurityNumber();
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return super.getPhone();
	}

	@Override
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		super.setPhone(phone);
	}

	@Override
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		// TODO Auto-generated method stub
		super.setSocialSecurityNumber(socialSecurityNumber);
	}

	@Override
	public double getPayRate() {
		// TODO Auto-generated method stub
		return super.getPayRate();
	}

	@Override
	public void setPayRate(double payRate) {
		// TODO Auto-generated method stub
		super.setPayRate(payRate);
	}

	protected double tienCong;
	private void addHours(int moreHours) {
		tienCong= moreHours*10;
	}

	public double pay() {
		addHours(hoursWorked);
		return tienCong;
	}

	public String toString() {
		String s= super.toString();
		return s+"\nGiờ công: "+hoursWorked;
	}

}
