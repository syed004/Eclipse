package com.bellinfo.consultancy.assignments.a678part2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HospitalAssignment81part2 {
	public static void main(String[] args) {
		Address add1 = new Address("1453 Spice tree circle", "Apt 202", "Fairborn", "ohio", 45323);
		Address add2 = new Address("1478 Spice tree circle", "Apt 204", "Fairborn", "ohio", 45324);
		Address add3 = new Address("1453 avalon", "Apt 202", "Fairborn", "ohio", 45325);
		Address add4 = new Address("14 avalon", "Apt 202", "Dayton", "ohio", 45316);
		Doctor doc1 = new Doctor(100, "syed", "opthomology");
		Doctor doc2 = new Doctor(101, "mujtaba", "pharama");
		Doctor doc3 = new Doctor(102, "bilgrami", "gynocology");
		Hospital hos1 = new Hospital("Raj soin", doc1, add1);
		Hospital hos2 = new Hospital("Health care", doc2, add2);
		Hospital hos3 = new Hospital("life live", doc3, add3);
		HashSet<Hospital> hs1 = new HashSet<>();
		hs1.add(hos1);
		hs1.add(hos2);
		hs1.add(hos3);
		hs1.add(new Hospital("new life", doc3, add4));
		System.out.println("***ans to first quuestion");
		for (Hospital hosp : hs1) {
			System.out.println(hosp);
		}
		System.out.println("*****second answer");

		Scanner scan = new Scanner(System.in);
		System.out.println("enter illness like gyno,opthmology");
		String field = scan.nextLine();

		Iterator<Hospital> it = hs1.iterator();
		while (it.hasNext()) {
			Hospital hospi = (Hospital) it.next();
			if (hospi.getDoc().getSpecialization().equals(field)) {
				System.out.println(hospi);

			}
		}

	}
}

class Hospital {
	private String hospitalName;
	private Doctor doc;
	private Address hospitalAddress;

	public Address getHospitalAddress() {
		return hospitalAddress;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public Doctor getDoc() {
		return doc;
	}

	public Hospital(String hospitalName, Doctor doc, Address hospitalAddress) {

		this.hospitalName = hospitalName;
		this.doc = doc;
		this.hospitalAddress = hospitalAddress;
	}

	@Override
	public String toString() {
		return "Hospital [hospitalName=" + hospitalName + ", doc=" + doc + ", hospitalAddress=" + hospitalAddress + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((hospitalAddress == null) ? 0 : hospitalAddress.hashCode());
		result = prime * result + ((hospitalName == null) ? 0 : hospitalName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hospital other = (Hospital) obj;
		if (hospitalAddress == null) {
			if (other.hospitalAddress != null)
				return false;
		} else if (!hospitalAddress.equals(other.hospitalAddress))
			return false;
		if (hospitalName == null) {
			if (other.hospitalName != null)
				return false;
		} else if (!hospitalName.equals(other.hospitalName))
			return false;
		return true;
	}

}

class Doctor {
	private int docId;
	private String name;
	private String specialization;

	public Doctor(int docId, String name, String specialization) {
		this.docId = docId;
		this.name = name;
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	@Override
	public String toString() {
		return "Doctor [docId=" + docId + ", name=" + name + ", specialization=" + specialization + "]";
	}

}

class Address {
	private String address1;
	private String address2;
	private String city;
	private String state;

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	private int zipCode;

	public Address(String address1, String address2, String city, String state, int zipCode) {
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address1 == null) ? 0 : address1.hashCode());
		result = prime * result + ((address2 == null) ? 0 : address2.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + zipCode;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (address1 == null) {
			if (other.address1 != null)
				return false;
		} else if (!address1.equals(other.address1))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Address [address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", zipCode=" + zipCode + "]";
	}

}
