package com.jitu.airBnb.service;


import com.jitu.airBnb.entity.Room;

public interface InventoryService {

    void initializeRoomForAYear(Room room);

//  void deleteFutureInventories(Room room);
    void deleteAllInventories(Room room);

}
