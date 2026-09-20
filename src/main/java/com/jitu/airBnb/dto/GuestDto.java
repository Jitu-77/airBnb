package com.jitu.airBnb.dto;

import com.jitu.airBnb.entity.User;
import com.jitu.airBnb.entity.enums.Gender;
import lombok.Data;

@Data
public class GuestDto {
    private Long id;
    private User user;
    private String name;
    private Gender gender;
    private Integer age;
}
