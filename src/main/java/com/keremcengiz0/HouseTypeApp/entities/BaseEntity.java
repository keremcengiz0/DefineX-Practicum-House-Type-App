package com.keremcengiz0.HouseTypeApp.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class BaseEntity {
    private long price;
    private int squareMeters;
    private int roomCount;
    private int salonCount;


}
