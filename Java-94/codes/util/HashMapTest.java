package co.edureka.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) throws InterruptedException {
		Map<String, Float> bank = new HashMap<String, Float>(); 
		
		System.out.println(bank.put("Sunil", 25000f)); // null
		System.out.println(bank.put("Sunil", 11250.50f)); //25000.0
		System.out.println(bank.put("Pankaj", 25000f)); //null
		bank.put("Sachin",13750f);
		bank.put("Praveen",23500f);
		bank.put("Kiran",24500.5f);
		
		System.out.println(bank);
		
		System.out.println("-------------------------------------------------------------------------");
		float bal = bank.get("Sunil");
		System.out.println("A/C Balance of \"Sunil\" = " + bal);
		bal += 1150.5f;
		bank.put("Sunil", bal);
		System.out.println("-------------------------------------------------------------------------");
		
		System.out.print("A/C Holders ---->   ");
		Set<String> names = bank.keySet();
		for(String name : names) {
			System.out.print(name+" , ");
		}
		System.out.println("\n-------------------------------------------------------------------------");
		
		Set<Map.Entry<String,Float>> entries = bank.entrySet();
		Iterator<Map.Entry<String,Float>> it = entries.iterator();
		while(it.hasNext()) {
			Map.Entry<String,Float> entry = it.next();
			String name = entry.getKey();
			Float balance = entry.getValue();
			
			String acHolder = String.format("%-10s ----> %.2f", name, balance);
			System.out.println(acHolder);
			Thread.sleep(2000);
		}
		System.out.println("-------------------------------------------------------------------------");
		
		
		bank.put(null, null);
		System.out.println(bank);
	}
}
