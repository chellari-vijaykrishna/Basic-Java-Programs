package com.automobile.Test;

import com.automobile.Vehicle;
import com.automobile.TwoWheeler.TwoWheeler;
import com.automobile.honda.Honda;

public class Test {
	public static void main(String[] args) {
		Vehicle v1 = new TwoWheeler("268VIJTW","RESVIJTW268", "Vijay");
		System.out.println(v1.getModelNumber());
		System.out.println(v1.getRegistrationNumber());
		System.out.println(v1.getOwnerName());
		
		
		
		Vehicle v2 = new Honda("268VIJHO", "RESVIJHO268", "Vijay");
		System.out.println(v2.getModelNumber());
		System.out.println(v2.getRegistrationNumber());
		System.out.println(v2.getOwnerName());
		
	}

}
