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
		
		Map<String,Map<String,String>> list = new HashMap<>();
		
		
		val1.put("INDIA","LOTUS");
		val1.put("PAKISTAN","JASMINE");
		val1.put("NEPAL","LALI GURANS");
		list.put("ASIA",val1);
		
		val2.put("GERMANY","CORN FLOWER");
		val2.put("FRANCE","LILY");
		val2.put("GREECE","ACANTHUS MOLLIS");
		
		val3.put("EGYPT","BLUE LOTUS");
		val3.put("NIGERIA","YELLOW TRUMPET ");
		val3.put("KENYA","ORCHID");
		list.put("EUROPE", val2);
		list.put("AFRICA", val3);
		
		String continent = input.toUpperCase();
		if(list.containsKey(continent)) {
			for (String key: list.get(continent).keySet()){
	            System.out.println(key + "'s National Flower is " + list.get(continent).get(key));
	        }
		}
		else
			System.out.println("Plz Enter valid input");
		

	}
}

