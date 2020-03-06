package NguyenMinhNgan.com.model;

public abstract class  StaffMember {
	protected String name;
	protected String address;
	protected String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public abstract double pay();
	public String toString() {
		return "Tên: "+name+"\nĐịa chỉ: "+address+"\nSố địa thoại:" +phone+"\nTiền lương: "+pay();
	}
}
