package com.cg.BookRoom.ui;

import java.util.Scanner;

import com.cg.BookRoom.dao.BookRoomDAOImpl;
import com.cg.BookRoom.dao.IBookRoomDAO;
import com.cg.BookRoom.dto.Customer;
import com.cg.BookRoom.service.BookRoomServiceImpl;
import com.cg.BookRoom.service.IBookRoomService;

public class MainUI {
static Scanner sc = new Scanner(System.in);

static IBookRoomService customer1=new BookRoomServiceImpl();
static Customer customer= new Customer();
	public static void main(String[] args) {
	while(true) {	
		System.out.println("Menu");
		System.out.println("1)Book Room");
		System.out.println("2)View Booking Status");
		System.out.println("3)Exit");
		int n= sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("enter customer name");
			customer.setCustomerName(sc.next());
			System.out.println("Enter Email");
			String n1= sc.next();
			customer.setCustomerEmail(n1);
			System.out.println("Enter Customer Address");
			String n2=sc.next();
			customer.setCustomerAddress(n2);
			System.out.println("Enter mobile no");
			long n3=sc.nextLong();
			customer.setMobileNo(n3);
			System.out.println("enter room no");
			int n4=sc.nextInt();
			customer.setRoomNo(n4);
			System.out.println("enter room type");
			String n5=sc.next();
			customer.setRoomType(n5);
			
		int i=	customer1.bookRoom(customer);
		if(i!=0)
		System.out.println("your room has been sucessfully booked and customer Id is"+i);
		break;
		case 2:
			System.out.println("enter the customer id");
			int id= sc.nextInt();
			Customer c=customer1.viewBookingStatus(id);
		
			System.out.println("Name of the customer is:"  +c.getCustomerName());
			System.out.println("Booking Status:"+c.getStatus());
			System.out.println("Room no:"+c.getRoomNo());
			System.out.println("Room Type"+c.getRoomType());
			break;
		case 3:
			System.out.println("Thank You");
			System.exit(0);
			break;
		}
	}
		
	}

}
