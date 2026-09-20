package com.jitu.airBnb.service;

//import com.codingshuttle.projects.airBnbApp.dto.BookingDto;
//import com.codingshuttle.projects.airBnbApp.dto.BookingRequest;
//import com.codingshuttle.projects.airBnbApp.dto.GuestDto;

import com.jitu.airBnb.dto.BookingDto;
import com.jitu.airBnb.dto.BookingRequest;
import com.jitu.airBnb.dto.GuestDto;

import java.util.List;

public interface BookingService {

    BookingDto initialiseBooking(BookingRequest bookingRequest);

    BookingDto addGuests(Long bookingId, List<GuestDto> guestDtoList);
}
