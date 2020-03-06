package NguyenMinhNgan.com.model;

import java.util.ArrayList;

import NguyenMinhNgan.com.model.Executive;
import NguyenMinhNgan.com.model.Hourly;
import NguyenMinhNgan.com.model.StaffMember;
import NguyenMinhNgan.com.model.Volunteer;

public class Staff {
	public static void main(String[] args) {
		ArrayList<StaffMember> staffList = new ArrayList<StaffMember>();
		Volunteer per1 = new Volunteer();
		per1.setAddress("VietNam");
		per1.setName("Alex");
		per1.setPhone("092123232");
		staffList.add(per1);
		
		Executive per2 = new Executive();
		per2.setAddress("US");
		per2.setName("Bob");
		per2.setPhone("098938423");
		per2.setBonus(10);
		per2.setSocialSecurityNumber("MAKD2");
		staffList.add(per2);
		
		Hourly per3 = new Hourly();
		per3.setAddress("UK");
		per3.setName("Dick");
		per3.setPhone("098329332");
		per3.setHoursWorked(12);
		per3.setPayRate(11);
		per3.setSocialSecurityNumber("QE1DDE2D");
		staffList.add(per3);
		
		for (StaffMember nv : staffList) {
			System.out.println(nv+"\n");
		}
	}

}
