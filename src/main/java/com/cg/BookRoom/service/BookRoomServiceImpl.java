package com.cg.BookRoom.service;

import com.cg.BookRoom.dao.BookRoomDAOImpl;
import com.cg.BookRoom.dao.IBookRoomDAO;
import com.cg.BookRoom.dto.Customer;

public class BookRoomServiceImpl implements IBookRoomService {
IBookRoomDAO d=new BookRoomDAOImpl();
	public int bookRoom(Customer customer) {
		// TODO Auto-generated method stub
		return d.bookRoom(customer);
	}
	public Customer viewBookingStatus(int id) {
		// TODO Auto-generated method stub
		return d.viewBookingStatus(id);
	}

	

}
