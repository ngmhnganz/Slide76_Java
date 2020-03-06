package NguyenMinhNgan.com.test;

import java.util.ArrayList;

import NguyenMinhNgan.com.model.Executive;
import NguyenMinhNgan.com.model.Hourly;
import NguyenMinhNgan.com.model.StaffMember;
import NguyenMinhNgan.com.model.Volunteer;

public class Staff {
	public static void main(String[] args) {
		ArrayList<StaffMember> staffList = new ArrayList<StaffMember>();
		StaffMember per1 = new Volunteer();
		per1.setAddress("VietNam");
		per1.setName("Alex");
		per1.setPhone("092123232");
		staffList.add(per1);
		StaffMember per2 = new Executive();
		per2.setAddress("US");
		per2.setName("Bob");
		per2.setPhone("098938423");
		StaffMember per3 = new Hourly();
		per3.setAddress("UK");
		per3.setName("Dick");
		per3.setPhone("098329332");
	}

}
