package NguyenMinhNgan.com.model;

public abstract class Employee extends StaffMember {
	public abstract double pay();
	protected String socialSecurityNumber;
	protected double payRate;
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
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
	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}
	public double getPayRate() {
		return payRate;
	}
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
	@Override
	public String toString() {
		String s= super.toString();
		return s+"\nHệ số lương: "+payRate+"\nMã số: "+socialSecurityNumber;
	}
}
