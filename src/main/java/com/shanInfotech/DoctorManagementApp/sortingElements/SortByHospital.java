package com.shanInfotech.DoctorManagementApp.sortingElements;

import java.util.Comparator;

import java.util.Map;
import java.util.Map.Entry;

import com.shanInfotech.DoctorManagementApp.entity.Doctor;

public class SortByHospital implements Comparator<Map.Entry<Integer, Doctor>>{

	@Override
	public int compare(Entry<Integer, Doctor> o1, Entry<Integer, Doctor> o2) {
		// TODO Auto-generated method stub
		return o1.getValue().getHospital().compareTo(o2.getValue().getHospital());
	}

}
