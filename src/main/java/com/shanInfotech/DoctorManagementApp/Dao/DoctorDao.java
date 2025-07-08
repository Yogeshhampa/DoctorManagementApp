package com.shanInfotech.DoctorManagementApp.Dao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.shanInfotech.DoctorManagementApp.Interface.IDoctor;
import com.shanInfotech.DoctorManagementApp.entity.Doctor;

public class DoctorDao implements IDoctor {
	private Map<Integer,Doctor> mapDoctor=null;
	private Map<Integer, Doctor> treeDoctor=null;

	@Override
	public void addDoctor() {
		// TODO Auto-generated method stub
		System.out.println("Add the doctor values");
		mapDoctor=new HashMap<>();
		mapDoctor.put(101, new Doctor("Yogesh", "heart", "Narayana hrudayalaya",200000));
		mapDoctor.put(102,new Doctor("Manju","teeth","Apollo",206000));
		mapDoctor.put(103,new Doctor("Karthik","toung","Govt",208000));
		mapDoctor.put(104,new Doctor("PG nitin","head","private",200670));
		mapDoctor.put(106,new Doctor("Dhanushree","liver","Lokesh Hospital",267000));
		mapDoctor.put(105,new Doctor("Sagar","hand","Narayana hrudayalaya",2000567));
		mapDoctor.put(107,new Doctor("Sharanya","leg"," hrudayalaya",2045700));
		mapDoctor.put(108,new Doctor("Smriti","brain","Karthik Hospital",2234500));
	}
			
	
	

	@Override
	public void getDoctors() {
		// TODO Auto-generated method stub
		Set<Map.Entry<Integer,Doctor>> setDoctor=mapDoctor.entrySet();
		Iterator<Map.Entry<Integer,Doctor>> itr=setDoctor.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer,Doctor> DoctorData=itr.next();
			Integer key=DoctorData.getKey();
			Doctor value=DoctorData.getValue();
			System.out.println("fee: " + key +
	                   ", Name: " + value.getDoctorName() +
	                   ", Specialisation: " + value.getSpecialisation() +
	                   ", Hospital: " + value.getHospital());

		}
	}

	@Override
	public void sortByDoctorName() {
		// TODO Auto-generated method stub
		System.out.println("Sorting Map By Doctor Name");
		List<Doctor> listDoctor=new ArrayList<Doctor>(mapDoctor.values());
		Collections.sort(listDoctor);
		Iterator<Doctor> itr=listDoctor.iterator();
		while(itr.hasNext()) {
			Doctor m=itr.next();
			System.out.println(m);
		}
	}

	@Override
	public void sortBySpecialisation()  {
		// TODO Auto-generated method stub
		System.out.println("Sorting Map By Doctor Name");
		List<Doctor> listDoctor=new ArrayList<Doctor>(mapDoctor.values());
		Collections.sort(listDoctor);
		Iterator<Doctor> itr=listDoctor.iterator();
		while(itr.hasNext()) {
			Doctor m=itr.next();
			System.out.println(m);
		}
	}

	@Override
	public void sortByHospital() {
		// TODO Auto-generated method stub
		System.out.println("Sorting Map By Doctor Name");
		List<Doctor> listDoctor=new ArrayList<Doctor>(mapDoctor.values());
		Collections.sort(listDoctor);
		Iterator<Doctor> itr=listDoctor.iterator();
		while(itr.hasNext()) {
			Doctor m=itr.next();
			System.out.println(m);
		}
	}



}
