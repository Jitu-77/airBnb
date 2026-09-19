package com.jitu.airBnb.repository;


import com.jitu.airBnb.entity.Inventory;
import com.jitu.airBnb.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

//    void deleteByDateAfterAndRoom(LocalDate date, Room room);
      void deleteByRoom(Room room);
}

