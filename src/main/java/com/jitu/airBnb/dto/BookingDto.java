package com.jitu.airBnb.dto;


import com.jitu.airBnb.entity.Hotel;
import com.jitu.airBnb.entity.Room;
import com.jitu.airBnb.entity.User;
import com.jitu.airBnb.entity.enums.BookingStatus;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Data
public class BookingDto {
    private Long id;
//    private Hotel hotel;
//    private Room room;
//    private User user;
    private Integer roomsCount;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private BookingStatus bookingStatus;
    private Set<GuestDto> guests;
}
