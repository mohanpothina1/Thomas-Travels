package com;

import java.util.ArrayList;

public class TestDriver {
	
	public static void main(String[] args) {
		Driver driver1 = new Driver(401, "Car", "Jameer", 1256.55);
		Driver driver2 = new Driver(402, "Lorry", "Naveen", 2256.55);
		Driver driver3 = new Driver(403, "Auto", "Kumar", 256.45);
		Driver driver4 = new Driver(404, "Car", "Mohan", 1056.35);
		Driver driver5 = new Driver(405, "Lorry", "Mike", 3256.45);
		Driver driver6 = new Driver(406, "Auto", "Bunty", 1156.95);
		Driver driver7 = new Driver(407, "Lorry", "Tony", 3356.20);
		Driver driver8 = new Driver(408, "Car", "Nani", 4556.65);
		
		
		ArrayList<Driver> arrayList = new ArrayList<Driver>();
		arrayList.add(driver1);
		arrayList.add(driver2);
		arrayList.add(driver3);
		arrayList.add(driver4);
		arrayList.add(driver5);
		arrayList.add(driver6);
		arrayList.add(driver7);
		arrayList.add(driver8);

		System.out.println(Travel.isCarDriver(driver1));
		System.out.println(Travel.retrivebyDriverId(arrayList, 404));
		System.out.println(Travel.retriveCountOfDriver(arrayList, "Car"));
		System.out.println(Travel.retriveDriver(arrayList, "Car"));
		System.out.println(Travel.retriveMaximumDistanceTravelledDriver(arrayList));
	}

}
