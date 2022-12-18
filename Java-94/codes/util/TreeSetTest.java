package co.edureka.util;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>(); 
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); // false
		System.out.println(names.add("Bharath")); //true
		names.add("Anil");
		names.add("Sanjay");
		names.add("Kapil");
		
		System.out.println(names + "| size = " + names.size());
		
		names.add(null); //java.lang.NullPointerException
		System.out.println(names);
	}

}
