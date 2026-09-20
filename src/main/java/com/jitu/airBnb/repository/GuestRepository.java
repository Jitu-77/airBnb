package com.jitu.airBnb.repository;


import com.jitu.airBnb.entity.Guest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GuestRepository extends JpaRepository<Guest, Long> {
}