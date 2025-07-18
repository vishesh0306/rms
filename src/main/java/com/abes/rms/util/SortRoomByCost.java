package com.abes.rms.util;

import java.util.Comparator;

import com.abes.rms.dto.Room;

public class SortRoomByCost implements Comparator<Room>{

	@Override
	public int compare(Room o1, Room o2) {
		return Double.compare(o1.getCostPerHour(), o2.getCostPerHour());  
	}	

}