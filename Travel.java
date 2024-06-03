package com;

import java.util.ArrayList;

public class Travel {
	
	public static boolean isCarDriver(Driver driver) {
		if(driver.getCategory().equalsIgnoreCase("Car")) {
			return true;
		}
		return false;
		
	}
	
	public static String retrivebyDriverId(ArrayList<Driver> drivers, int driverId) {
		for (Driver driver : drivers) {
			if(driver.getDriverId()==driverId) {
				return "Driver name is " + driver.getDriverName() + " Belonging to the Category " + driver.getCategory() + " traveled " + driver.getTotalDistance() + " KM so far";
			}
		}
		
		return null;
	}
	
	public static int retriveCountOfDriver(ArrayList<Driver> drivers, String cat) {
		int count = 0;
		
		for (Driver driver : drivers) {
			if(driver.getCategory().equals(cat)) {
				count++;
			}
		}
		
		return count;
	}
	
	public static ArrayList<Driver> retriveDriver(ArrayList<Driver>drivers, String cat){
		ArrayList<Driver> arrayList = new ArrayList<Driver>();
		for (Driver driver : drivers) {
			if(driver.getCategory().equals(cat)) {
				arrayList.add(driver);
			}
		}
		return arrayList;
	}
	
	public static Driver retriveMaximumDistanceTravelledDriver(ArrayList<Driver> drivers) {
		double maxDistance=0;
		Driver maxDriver=null;
		for (Driver driver : drivers) {
			if(driver.getTotalDistance()>maxDistance) {
				maxDistance=driver.getTotalDistance();
				maxDriver=driver;
			}
		}
		return maxDriver;
	}

}
