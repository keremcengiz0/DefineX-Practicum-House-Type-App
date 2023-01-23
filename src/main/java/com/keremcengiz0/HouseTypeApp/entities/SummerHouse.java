package com.keremcengiz0.HouseTypeApp.entities;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;


public class SummerHouse extends BaseEntity{
    public SummerHouse(long price, int squareMeters, int roomCount, int salonCount) {
        super(price, squareMeters, roomCount, salonCount);
    }

    @Override
    public String toString() {
        return "Summer House{" +
                "price=" + getPrice() +
                ", squareMeters=" + getSquareMeters() +
                ", roomCount=" + getRoomCount() +
                ", salonCount=" + getSalonCount() +
                '}';
    }
}
