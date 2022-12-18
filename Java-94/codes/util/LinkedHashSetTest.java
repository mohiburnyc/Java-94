package co.edureka.util;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {

	public static void main(String[] args) {
		Set<String> names = new LinkedHashSet<String>(); 
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); // false
		System.out.println(names.add("Bharath")); //true
		names.add("Anil");
		names.add("Sanjay");
		names.add("Kapil");
		
		System.out.println(names + "| size = " + names.size());
	}
}
