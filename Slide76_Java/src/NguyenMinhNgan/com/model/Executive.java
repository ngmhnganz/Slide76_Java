package NguyenMinhNgan.com.model;

public class Executive extends Employee {
	protected double bonus;
	protected double wage;
	
	public double getBonus() {
		return bonus;
	}
	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	private void awardBonus(double exeBonus) {
		wage = 2000*exeBonus/100+2000;
	}
	public double pay() {
		awardBonus(bonus);
		return wage ;
	}
	@Override
	public String toString() {
		String s=super.toString();
		return s+"\nThưởng: "+bonus;
	}

}
