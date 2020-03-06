package NguyenMinhNgan.com.model;

public class Executive extends Employee {
	protected double bonus;
	public double getBonus() {
		return bonus;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	private void awardBonus(double exeBonus) {
		bonus = 2000*exeBonus/100;
	}

	public double pay() {
		awardBonus(bonus);
		return bonus;
	}

}
