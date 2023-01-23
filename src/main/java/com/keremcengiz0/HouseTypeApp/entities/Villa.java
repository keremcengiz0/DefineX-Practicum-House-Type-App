package com.keremcengiz0.HouseTypeApp.entities;

import javax.persistence.Entity;


public class Villa extends BaseEntity{
    public Villa(long price, int squareMeters, int roomCount, int salonCount) {
        super(price, squareMeters, roomCount, salonCount);
    }

    @Override
    public String toString() {
        return "Villa{" +
                "price=" + getPrice() + " ₺" +
                ", squareMeters=" + getSquareMeters() + " m2" +
                ", roomCount=" + getRoomCount() +
                ", salonCount=" + getSalonCount() +
                '}';
    }
}
