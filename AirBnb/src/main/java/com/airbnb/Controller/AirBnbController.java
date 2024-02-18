package com.airbnb.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.airbnb.Model.Booking;
import com.airbnb.Model.Customer;
import com.airbnb.Model.Hotel;
import com.airbnb.Model.RoomType;
import com.airbnb.Service.customerDao;


@RestController
public class AirBnbController {

    @Autowired
    private customerDao customerDao;

    @PostMapping("/customer")
    public void addCustomer(@RequestBody Customer customer) {
        customerDao.addcustomer(customer);
    }

    @PostMapping("/bookings")
    public void makeManageBookings(@RequestParam String customerId) {
        customerDao.makemanagebookings(customerId);
    }

    @GetMapping("/searchRoom")
    public List<RoomType> searchRoom(@RequestParam String customerId, @RequestParam String city) {
        return customerDao.searchRoo(customerId, city);
    }

    @GetMapping("/booking")
    public List<Booking> booking(@RequestParam String city) {
        return customerDao.booking(city);
    }

    @PostMapping("/hotels")
    public void addHotels(@RequestBody Hotel hotel) {
        customerDao.addhotels(hotel);
    }

    @PostMapping("/roomType")
    public void makeRoomType(@RequestParam Integer hotelId) {
        customerDao.make_room_type(hotelId);
    }
}
