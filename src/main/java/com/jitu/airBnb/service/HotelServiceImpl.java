package com.jitu.airBnb.service;

import com.jitu.airBnb.dto.HotelDto;
import com.jitu.airBnb.entity.Hotel;
import com.jitu.airBnb.exception.ResourceNotFoundException;
import com.jitu.airBnb.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;
    private final ModelMapper modelMapper;

    @Override
    public HotelDto createNewHotel(HotelDto hotelDto) {
        log.info("Creating a new hotel with name: {}", hotelDto.getName());
        Hotel hotel = modelMapper.map(hotelDto, Hotel.class);
        hotel.setActive(false);
        hotel = hotelRepository.save(hotel);
        log.info("Created a new hotel with ID: {}", hotel.getId());
        return modelMapper.map(hotel,HotelDto.class);
    }

    @Override
    public HotelDto getHotelById(Long id) {
        log.info("Getting the hotel with ID: {}", id);
        Hotel hotel = hotelRepository
                .findById(id)
//                .orElseThrow(() -> new RuntimeException("Hotel not found with ID: "+id));
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: "+id));
        return modelMapper.map(hotel,HotelDto.class);
    }

    @Override
    public HotelDto updateHotelById(Long id, HotelDto hotelDto) {
        log.info("Updating the hotel with ID: {}", id);
        Hotel hotel = hotelRepository
                .findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: "+id));
        modelMapper.map(hotelDto, hotel);
        hotel.setId(id); // added as this is put
        hotel = hotelRepository.save(hotel);
        return modelMapper.map(hotel, HotelDto.class);
    }

    @Override
    public void deleteHotelById(Long id) {
//    public void deleteHotelById(Long id) {
//        Hotel hotel = hotelRepository
//                .findById(id)
//                .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with ID: "+id));
            Boolean exists = hotelRepository.existsById(id);
            if(!exists){
                throw new ResourceNotFoundException("Hotel not found with ID: "+id);
            }
        hotelRepository.deleteById(id);
        // delete future inv fot this hotel
    }

    @Override
    public void activateHotel(Long hotelId) {

    }
}
