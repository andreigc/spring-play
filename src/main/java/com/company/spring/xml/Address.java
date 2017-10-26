package com.company.spring.xml;

public class Address {

	private int id;
	
	private String address;
	
	private String address2;
	
	private String district;
	
	private City city;
	
	private String postalCode;
	
	private String phone;
	
//	public Address(int id, String address, String address2, String district, City city, String postalCode,
//			String phone) {
//		super();
//		this.id = id;
//		this.address = address;
//		this.address2 = address2;
//		this.district = district;
//		this.city = city;
//		this.postalCode = postalCode;
//		this.phone = phone;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", address2=" + address2 + ", district=" + district
				+ ", city=" + city + ", postalCode=" + postalCode + ", phone=" + phone + "]";
	}
	
	
	
	
}
