package com.lcwd.hotel.services;

import com.lcwd.hotel.entities.Hotel;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

public interface HotelService {

    //create hotel
    Hotel createHotel(Hotel hotel);

    //get single hotel
    Hotel getHotel(String hotelId);

    //get all hotels
    List<Hotel> getAllHotels();
}
