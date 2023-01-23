package com.keremcengiz0.HouseTypeApp;

import com.keremcengiz0.HouseTypeApp.entities.BaseEntity;
import com.keremcengiz0.HouseTypeApp.entities.House;
import com.keremcengiz0.HouseTypeApp.entities.SummerHouse;
import com.keremcengiz0.HouseTypeApp.entities.Villa;
import com.keremcengiz0.HouseTypeApp.services.RealEstateService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class HouseTypeAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(HouseTypeAppApplication.class, args);

		RealEstateService realEstateService = new RealEstateService();

		House house1 = new House(500000,100,2,1 );
		House house2 = new House(750000,120,3,1 );
		House house3 = new House(1000000,160,4,1 );

		Villa villa1 = new Villa(2000000, 180, 4, 3);
		Villa villa2 = new Villa(2500000, 210, 5, 4);
		Villa villa3 = new Villa(3000000, 230, 6, 3);

		SummerHouse summerHouse1 = new SummerHouse(600000, 110, 2,1);
		SummerHouse summerHouse2 = new SummerHouse(750000, 130, 3,1);
		SummerHouse summerHouse3 = new SummerHouse(850000, 120, 4,2);

		realEstateService.addHouse(house1);
		realEstateService.addHouse(house2);
		realEstateService.addHouse(house3);

		realEstateService.addVilla(villa1);
		realEstateService.addVilla(villa2);
		realEstateService.addVilla(villa3);

		realEstateService.addSummerHouse(summerHouse1);
		realEstateService.addSummerHouse(summerHouse2);
		realEstateService.addSummerHouse(summerHouse3);

		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Total price of all houses: " + realEstateService.getTotalPriceHouses() + " ₺");
		System.out.println("Total price of all villas: " + realEstateService.getTotalPriceVillas() + " ₺");
		System.out.println("Total price of all summer houses: " + realEstateService.getTotalPriceSummerHouses() + " ₺");
		System.out.println("Total price of all properties: " + realEstateService.getTotalPriceAll() + " ₺");
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println("Average square meters of all houses: " + realEstateService.getAverageSquareHouses() + " m2");
		System.out.println("Average square meters of all villas: " + realEstateService.getAverageSquareVillas() + " m2");
		System.out.println("Average square meters of all summer houses: " + realEstateService.getAverageSquareSummerHouses() + " m2");
		System.out.println("Average square meters of all properties: " + realEstateService.getAverageSquareAll() + " m2");
		System.out.println("-------------------------------------------------------------------------------------");

		List<BaseEntity> filteredProperties = realEstateService.filterByRoomAndSalonCount(4, 2);

		for (BaseEntity property : filteredProperties) {
			System.out.println("- " + property);
		}
	}
}
