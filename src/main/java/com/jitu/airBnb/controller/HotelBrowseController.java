package com.jitu.airBnb.controller;


import com.jitu.airBnb.dto.HotelDto;
import com.jitu.airBnb.dto.HotelInfoDto;
import com.jitu.airBnb.dto.HotelPriceDto;
import com.jitu.airBnb.dto.HotelSearchRequest;
import com.jitu.airBnb.service.HotelService;
import com.jitu.airBnb.service.InventoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/hotels")
@RequiredArgsConstructor
public class HotelBrowseController {

    private final InventoryService inventoryService;
    private final HotelService hotelService;

//    @GetMapping("/search")
//    public ResponseEntity<Page<HotelDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {
//
//        Page<HotelDto> page = inventoryService.searchHotels(hotelSearchRequest);
//        return ResponseEntity.ok(page);
//    }
    @GetMapping("/search")
    public ResponseEntity<Page<HotelPriceDto>> searchHotels(@RequestBody HotelSearchRequest hotelSearchRequest) {

        Page<HotelPriceDto> page = inventoryService.searchHotels(hotelSearchRequest);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{hotelId}/info")
    public ResponseEntity<HotelInfoDto> getHotelInfo(@PathVariable Long hotelId) {
        return ResponseEntity.ok(hotelService.getHotelInfoById(hotelId));
    }

}
