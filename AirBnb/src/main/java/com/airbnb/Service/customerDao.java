package com.airbnb.Service;

import java.util.List;

import com.airbnb.Model.Booking;
import com.airbnb.Model.Customer;
import com.airbnb.Model.Hotel;
import com.airbnb.Model.RoomType;

public interface customerDao {

	public void addcustomer(Customer customer) throws IllegalArgumentException;

	public void makemanagebookings(String customerid) throws IllegalArgumentException;

	List<RoomType> searchRoo(String customerid, String city) throws IllegalArgumentException;

	List<Booking> booking(String city) throws IllegalArgumentException;

	public void addhotels(Hotel hotel) throws IllegalArgumentException;

	public void make_room_type(Integer hotelid) throws IllegalArgumentException;

}
