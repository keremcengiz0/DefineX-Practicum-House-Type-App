package com.keremcengiz0.HouseTypeApp.services;

import com.keremcengiz0.HouseTypeApp.entities.BaseEntity;
import com.keremcengiz0.HouseTypeApp.entities.House;
import com.keremcengiz0.HouseTypeApp.entities.SummerHouse;
import com.keremcengiz0.HouseTypeApp.entities.Villa;
import java.util.ArrayList;
import java.util.List;


public class RealEstateService {
    private List<House> houseList;
    private List<Villa> villaList;
    private List<SummerHouse> summerHouseList;

    public RealEstateService() {
        houseList = new ArrayList<House>();
        villaList = new ArrayList<Villa>();
        summerHouseList = new ArrayList<SummerHouse>();
    }

    public void addHouse(House house) {
        houseList.add(house);
    }

    public void addVilla(Villa villa) {
        villaList.add(villa);
    }

    public void addSummerHouse(SummerHouse summerHouse) {
        summerHouseList.add(summerHouse);
    }

    public List<House> getHouseList() {
        return houseList;
    }

    public List<Villa> getVillaList() {
        return villaList;
    }

    public List<SummerHouse> getSummerHouseList() {
        return summerHouseList;
    }

    public long getTotalPriceHouses() {
        long totalPrice = 0;
        for(House house : houseList) {
            totalPrice += house.getPrice();
        }
        return totalPrice;
    }

    public long getTotalPriceVillas() {
        long totalPrice = 0;
        for(Villa villa : villaList) {
            totalPrice += villa.getPrice();
        }
        return totalPrice;
    }

    public long getTotalPriceSummerHouses() {
        long totalPrice = 0;
        for(SummerHouse summerHouse : summerHouseList) {
            totalPrice += summerHouse.getPrice();
        }
        return totalPrice;
    }

    public long getTotalPriceAll() {
        return getTotalPriceHouses() + getTotalPriceVillas() + getTotalPriceSummerHouses();
    }

    public double getAverageSquareHouses() {
        int totalSquareMeters = 0;

        for(House house : houseList) {
            totalSquareMeters += house.getSquareMeters();
        }
        return (double) totalSquareMeters / houseList.size();
    }

    public double getAverageSquareVillas() {
        int totalSquareMeters = 0;

        for(Villa villa : villaList) {
            totalSquareMeters += villa.getSquareMeters();
        }
        return (double) totalSquareMeters / villaList.size();
    }

    public double getAverageSquareSummerHouses() {
        int totalSquareMeters = 0;

        for(SummerHouse summerHouse : summerHouseList) {
            totalSquareMeters += summerHouse.getSquareMeters();
        }
        return (double) totalSquareMeters / summerHouseList.size();
    }

    public double getAverageSquareAll() {
        int totalSquareMeters = 0;
        int totalCount = 0;

        for(House house : houseList) {
            totalSquareMeters += house.getSquareMeters();
            totalCount++;
        }

        for(Villa villa : villaList) {
            totalSquareMeters += villa.getSquareMeters();
            totalCount++;
        }

        for(SummerHouse summerHouse : summerHouseList) {
            totalSquareMeters += summerHouse.getSquareMeters();
            totalCount++;
        }

        return (double) totalSquareMeters / totalCount;
    }

    public List<BaseEntity> filterByRoomAndSalonCount(int minRooms, int minSalons) {
        System.out.println("Properties with at least " + minRooms + " rooms and " + minSalons + " salons:");

        List<BaseEntity> filteredList = new ArrayList<BaseEntity>();

        for(House house: houseList) {
            if (house.getRoomCount() >= minRooms && house.getSalonCount() >= minSalons) {
                filteredList.add(house);
            }
        }

        for(Villa villa: villaList) {
            if (villa.getRoomCount() >= minRooms && villa.getSalonCount() >= minSalons) {
                filteredList.add(villa);
            }
        }

        for(SummerHouse summerHouse: summerHouseList) {
            if (summerHouse.getRoomCount() >= minRooms && summerHouse.getSalonCount() >= minSalons) {
                filteredList.add(summerHouse);
            }
        }

        return filteredList;
    }
}
