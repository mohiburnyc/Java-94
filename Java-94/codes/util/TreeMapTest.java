package co.edureka.util;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		Map<String, Float> bank = new TreeMap<String, Float>(); 
		
		System.out.println(bank.put("Sunil", 25000f)); // null
		System.out.println(bank.put("Sunil", 11250.50f)); //25000.0
		System.out.println(bank.put("Pankaj", 25000f)); //null
		bank.put("Sachin",13750f);
		bank.put("Praveen",23500f);
		bank.put("Kiran",24500.5f);
		
		System.out.println(bank);
		
		//bank.put("Bharath", null); //valid
		bank.put(null, 12500f); //java.lang.NullPointerException
		System.out.println(bank);
	}

}
