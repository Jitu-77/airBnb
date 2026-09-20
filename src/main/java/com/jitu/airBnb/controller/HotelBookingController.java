package com.jitu.airBnb.controller;

//import com.codingshuttle.projects.airBnbApp.dto.BookingDto;
//import com.codingshuttle.projects.airBnbApp.dto.BookingRequest;
//import com.codingshuttle.projects.airBnbApp.dto.GuestDto;
//import com.codingshuttle.projects.airBnbApp.service.BookingService;
import com.jitu.airBnb.dto.BookingDto;
import com.jitu.airBnb.dto.BookingRequest;
import com.jitu.airBnb.dto.GuestDto;
import com.jitu.airBnb.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bookings")
public class HotelBookingController {

    private final BookingService bookingService;

    @PostMapping("/init")
    public ResponseEntity<BookingDto> initialiseBooking(@RequestBody BookingRequest bookingRequest) {
        return ResponseEntity.ok(bookingService.initialiseBooking(bookingRequest));
    }

    @PostMapping("/{bookingId}/addGuests")
    public ResponseEntity<BookingDto> addGuests(@PathVariable Long bookingId,
                                                @RequestBody List<GuestDto> guestDtoList) {
        return ResponseEntity.ok(bookingService.addGuests(bookingId, guestDtoList));
    }
}
