package com.shanInfotech.DoctorManagementApp.entity;

import java.util.Objects;

public class Doctor implements Comparable<Doctor> {
	private String doctorName;
	private String specialisation;
	private String hospital;
	private double fee;
	public Doctor() {
		super();
	}
	public Doctor(String doctorName, String specialisation, String hospital, double fee) {
		super();
		this.doctorName = doctorName;
		this.specialisation = specialisation;
		this.hospital = hospital;
		this.fee = fee;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	public String getSpecialisation() {
		return specialisation;
	}
	public void setSpecialisation(String specialisation) {
		this.specialisation = specialisation;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}
	public double getFee() {
		return fee;
	}
	public void setFee(double fee) {
		this.fee = fee;
	}
	
	
	@Override
	public String toString() {
		return "Doctor [doctorName=" + doctorName + ", specialisation=" + specialisation + ", hospital=" + hospital
				+ ", fee=" + fee + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(doctorName, fee, hospital, specialisation);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Doctor other = (Doctor) obj;
		return Objects.equals(doctorName, other.doctorName)
				&& Double.doubleToLongBits(fee) == Double.doubleToLongBits(other.fee)
				&& Objects.equals(hospital, other.hospital) && Objects.equals(specialisation, other.specialisation);
	}
	@Override
	public int compareTo(Doctor o) {
		// TODO Auto-generated method stub
		return this.doctorName.compareTo(o.getDoctorName());
	}
	
	

}
