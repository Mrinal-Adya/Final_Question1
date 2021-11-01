package com.flower;



import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FlowerDemo {

	public static void main(String[] args) {

	
	String input;
	Scanner scan = new Scanner(System.in);
	System.out.print("Enter continent");
	input = scan.next();
	
	displayFlower(input);
	
	
}

	
	public static void displayFlower(String input) {
		
		Map<String,String> val1 = new HashMap<>();
		Map<String,String> val2 = new HashMap<>();
		Map<String,String> val3 = new HashMap<>();
		
		
		val1.put("INDIA","LOTUS");
		val1.put("PAKISTAN","JASMINE");
		val1.put("NEPAL","LALI GURANS");
		
		val2.put("GERMANY","CORN FLOWER");
		val2.put("FRANCE","LILY");
		val2.put("GREECE","ACANTHUS MOLLIS");
		
		val3.put("EGYPT","BLUE LOTUS");
		val3.put("NIGERIA","YELLOW TRUMPET ");
		val3.put("KENYA","ORCHID");
		
		
		if(input.equalsIgnoreCase("ASIA")) {
			//System.out.println(val1);
			for (String key: val1.keySet()){
	            System.out.println(key +" 's national flowers is "+val1.get(key));
	        }
		}
		else if(input.equalsIgnoreCase("EUROPE")) {
			for (String key: val2.keySet())
	            System.out.println(key +" 's national flowers is "+val2.get(key));
		}
		else if(input.equalsIgnoreCase("AFRICA")) {
			for (String key: val3.keySet())
	            System.out.println(key +" 's national flowers is "+val3.get(key));
		}
		else {
			System.out.println("Input is not valid");
		}
		
	}
}

