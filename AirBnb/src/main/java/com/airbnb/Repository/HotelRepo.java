package com.airbnb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.airbnb.Model.Hotel;

public interface HotelRepo extends JpaRepository<Hotel, Integer>{

}
