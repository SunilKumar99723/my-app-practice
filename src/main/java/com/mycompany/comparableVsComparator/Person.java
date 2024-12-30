package com.mycompany.comparableVsComparator;

public class Person {
	
	private String name;
	private String address;
	private Integer pId;
	private Integer phoneNumber;
	
	public Person(String name, String address, Integer pId, Integer phoneNumber) {
//		super();
		this.name = name;
		this.address = address;
		this.pId = pId;
		this.phoneNumber = phoneNumber;
	}



	
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
	public Integer getpId() {
		return pId;
	}
	public void setpId(Integer pId) {
		this.pId = pId;
	}
	public Integer getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(Integer phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", pId=" + pId + ", phoneNumber=" + phoneNumber + "]";
	}
}
