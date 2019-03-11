
package com.cg.BookRoom.dao;

import com.cg.BookRoom.dto.Customer;

public interface IBookRoomDAO {
	public int bookRoom(Customer customer);
	public Customer viewBookingStatus(int id);
}
