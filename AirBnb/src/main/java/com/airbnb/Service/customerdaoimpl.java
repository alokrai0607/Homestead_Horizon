package com.airbnb.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.airbnb.Model.Booking;
import com.airbnb.Model.Customer;
import com.airbnb.Model.Hotel;
import com.airbnb.Model.RoomType;
import com.airbnb.Repository.BookingRepo;
import com.airbnb.Repository.CustomerRepo;
import com.airbnb.Repository.HotelRepo;

public class customerdaoimpl implements customerDao {
    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private HotelRepo hotelRepo;
    
    @Autowired
    private BookingRepo bookingRepo;

    @Override
    public void addcustomer(Customer customer) throws IllegalArgumentException {
        if (customer != null) {
            customerRepo.save(customer);
        } else {
            throw new IllegalArgumentException("Customer cannot be null");
        }
    }

    @Override
    public void makemanagebookings(String customerid) throws IllegalArgumentException {
        Customer customer = customerRepo.findById(customerid)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found"));
        
    }

    @Override
    public List<RoomType> searchRoo(String customerid, String city) throws IllegalArgumentException {
        Customer customer = customerRepo.findById(customerid)
                .orElseThrow(() -> new IllegalArgumentException("Customer not found"));
        
        return null;
    }

    @Override
    public List<Booking> booking(String city) throws IllegalArgumentException {
        // Implement booking logic based on city
        return bookingRepo.findByCity(city);
    }

    @Override
    public void addhotels(Hotel hotel) throws IllegalArgumentException {
        if (hotel != null) {
            hotelRepo.save(hotel);
        } else {
            throw new IllegalArgumentException("Hotel cannot be null");
        }
    }

    @Override
    public void make_room_type(Integer hotelid) throws IllegalArgumentException {
        Hotel hotel = hotelRepo.findById(hotelid)
                .orElseThrow(() -> new IllegalArgumentException("Hotel not found"));
    }
}
