package com.jitu.airBnb.service;


import com.jitu.airBnb.dto.HotelDto;
import com.jitu.airBnb.dto.HotelSearchRequest;
import com.jitu.airBnb.entity.Room;
import org.springframework.data.domain.Page;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

//  void deleteFutureInventories(Room room);
    void deleteAllInventories(Room room);
    Page<HotelDto> searchHotels(HotelSearchRequest hotelSearchRequest);
}
