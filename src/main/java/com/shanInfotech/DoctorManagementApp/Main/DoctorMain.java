package com.shanInfotech.DoctorManagementApp.Main;

import com.shanInfotech.DoctorManagementApp.Dao.DoctorDao;

public class DoctorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoctorDao d=new DoctorDao();
		d.addDoctor();
		d.getDoctors();
		d.sortByDoctorName();
		d.sortBySpecialisation();
		d.sortByHospital();
	}

}
