package com.cg.BookRoom.dto;

public class RoomDetails {
private int RoomNo;
private String RoomType;
private String Status;
public RoomDetails(String string, String string2) {
	// TODO Auto-generated constructor stub
	
	RoomType=string;
	Status=string2;
}
public int getRoomNo() {
	return RoomNo;
}
public void setRoomNo(int roomNo) {
	RoomNo = roomNo;
}
public String getRoomType() {
	return RoomType;
}
public void setRoomType(String roomType) {
	RoomType = roomType;
}
public String getStatus() {
	return Status;
}
public void setStatus(String status) {
	Status = status;
}

}
