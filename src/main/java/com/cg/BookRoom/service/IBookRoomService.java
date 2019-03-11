package com.cg.BookRoom.service;

import com.cg.BookRoom.dto.Customer;

public interface IBookRoomService {
	public int bookRoom(Customer customer);
	public Customer viewBookingStatus(int id);

}
