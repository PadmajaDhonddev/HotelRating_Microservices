package com.lcwd.rating.services;

import com.lcwd.rating.entities.Rating;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RatingService {
    //create
    Rating create(Rating rating);
    //get all ratings
    List<Rating> getRatings();

    //get all by userId
    List<Rating> getRatingsByUserId(String userId);

    //get all by hotelId
    List<Rating> getRatingsByHotelId(String hotelId);


}
