package com.cg.BookRoom.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cg.BookRoom.dto.Customer;

class BookRoomDAOImplTest1 {

	static BookRoomDAOImpl bookRoomDAOImpl;
	static Customer cd;
	
	@BeforeAll
	
	public static void init() {
		bookRoomDAOImpl=new BookRoomDAOImpl();
		cd= new Customer();
	}
	
	
	
	@Test
	void testBookRoom() {
		cd.setCustomerName("amar");
	    cd.setCustomerEmail("amar@");
	cd.setCustomerAddress("Hyd");
	cd.setMobileNo(7285999009L);
	cd.setRoomNo(101);
	cd.setRoomType("AC_SINGLE");
	assertEquals(1000, bookRoomDAOImpl.bookRoom(cd));
	}

	@Test
	void testViewBookingStatus() {
		cd.setCustomerName("amar");
		cd.setCustomerEmail("amar@");
		cd.setCustomerAddress("Hyd");
		cd.setMobileNo(7285999009L);
		cd.setRoomType("AC_SINGLE");
		cd.setRoomNo(101);
		assertEquals(cd, bookRoomDAOImpl.viewBookingStatus(1000));
	}

}
