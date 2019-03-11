package com.cg.BookRoom.dao;

import java.util.HashMap;

import org.w3c.dom.ranges.RangeException;

import com.cg.BookRoom.dto.Customer;
import com.cg.BookRoom.dto.RoomDetails;
import com.cg.BookRoom.utility.RoomBookedException;
import com.cg.BookRoom.utility.RoomException;
import com.cg.BookRoom.utility.RoomTypeException;

public  class BookRoomDAOImpl implements IBookRoomDAO {
HashMap<Integer, RoomDetails> room= new HashMap<Integer, RoomDetails>();
HashMap<Integer, Customer> customer= new HashMap<Integer, Customer>();
static int  count=1000;
	public BookRoomDAOImpl() {
		
		room.put(101, new RoomDetails("AC_SINGLE","NOT_BOOKED"));
		room.put(102, new RoomDetails("AC_SINGLE","NOT_BOOKED"));
		room.put(103, new RoomDetails("AC_DOUBLE","NOT_BOOKED"));
		room.put(201, new RoomDetails("NONAC_SINGLE","NOT_BOOKED"));
		room.put(201, new RoomDetails("NONAC_SINGLE","NOT_BOOKED"));
		room.put(203, new RoomDetails("NONAC_DOUBLE","NOT_BOOKED"));
	}
	public int bookRoom(Customer cust) {
		int i=0;
		RoomDetails rd=room.get(cust.getRoomNo());
		
	if(room.containsKey(cust.getRoomNo())) {
		
		if(rd.getRoomType().equals(cust.getRoomType())) {
			
			if(rd.getStatus().equals("NOT_BOOKED")) {
				
				rd.setStatus("BOOKED");
				cust.setCustomerID(count);
				cust.setStatus("BOOKED");
				customer.put(count,new Customer(cust.getCustomerName(),cust.getCustomerEmail(),cust.getMobileNo(),cust.getCustomerID(),cust.getRoomNo(),cust.getRoomType(),cust.getStatus(),cust.getCustomerAddress()) );
				i=count;
				count++;
				room.put(cust.getRoomNo(), rd);
			
			}
			else {
				try {
					throw new RoomBookedException();
				} catch (RoomBookedException e) {
					// TODO Auto-generated catch block
				
				}
			}
		}
		else {
		try {
			throw new RoomTypeException();
		} catch (RoomTypeException e) {
			// TODO Auto-generated catch block
			
		}
		}
	}
	else {
		try {
			throw new RoomException();
		} catch (RoomException e) {
			// TODO Auto-generated catch block
			
		}
	}
	return i;
	
}
	public Customer viewBookingStatus(int id) {
		if(customer.containsKey(id)){
			return customer.get(id);
		}
		
		else
			return null;
		
		
		
	}
	

	


}
