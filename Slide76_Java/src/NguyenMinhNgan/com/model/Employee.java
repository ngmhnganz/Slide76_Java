package NguyenMinhNgan.com.model;

public abstract class Employee extends StaffMember {

	@Override
	public abstract double pay();
	protected String socialSecurityNumber;
	protected double payRate;
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
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
