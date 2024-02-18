package com.airbnb.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airbnb.Model.Booking;

public interface BookingRepo extends JpaRepository<Booking, Integer>{

	List<Booking> findByCity(String city);

}
