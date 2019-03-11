package com.cg.BookRoom.dto;

public class Customer {

	private int CustomerID;
	private String CustomerName;
	private String CustomerEmail;
	private String CustomerAddress;
	private long MobileNo;
	private String RoomType;
	private int RoomNo;
	private String status;
	public Customer(String customerName2, String customerEmail2, long mobileNo2, int customerID2, int roomNo2,
			String roomType2, String status2, String customerAddress2) {
		this.CustomerID=customerID2;
		this.CustomerAddress=customerAddress2;
		this.CustomerEmail=customerEmail2;
		this.CustomerName=customerName2;
		this.MobileNo=mobileNo2;
		this.RoomNo=roomNo2;
		this.RoomType=roomType2;
		this.status=status2;
	}
	public Customer() {
		
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCustomerID() {
		return CustomerID;
	}
	public void setCustomerID(int customerID) {
		CustomerID = customerID;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	public String getCustomerAddress() {
		return CustomerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		CustomerAddress = customerAddress;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public String getRoomType() {
		return RoomType;
	}
	public void setRoomType(String roomType) {
		RoomType = roomType;
	}
	public int getRoomNo() {
		return RoomNo;
	}
	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}
	
}
