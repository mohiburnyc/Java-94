package co.edureka.util;

import java.util.ArrayList;
import java.util.List;

public class ListMethods {
	public static void main(String[] args) {
		List<String> names = new ArrayList<String>();
		System.out.println(names + " |size = " + names.size());
		
		names.add("Sunil");
		names.add("Sunil");
		names.add("Afrose");
		names.add("Akila");
		names.add("Arijith");
		names.add("Ayenew");
		names.add("Dama Harish");
		
		names.add("Sunil");
		System.out.println(names + " |size = " + names.size());
		
		names.add(1, "Dimple");
		System.out.println(names + " |size = " + names.size());
		
		names.set(4, "AKHILA");
		System.out.println(names + " |size = " + names.size());
		
		System.out.println("is \"Afrose\" present = " + names.contains("Afrose"));
		
		System.out.println("index of \"Sunil\" from start = " + names.indexOf("Sunil"));
		System.out.println("index of \"Sunil\" from last = " + names.lastIndexOf("Sunil"));
		System.out.println("index of \"SUNIL\" from start = " + names.indexOf("SUNIL"));
		
		System.out.println("person @ index 0 = " + names.get(0));
		//System.out.println("person @ index 10 = " + names.get(10)); //java.lang.IndexOutOfBoundsException
		
		System.out.println(names.remove("Sunil")); //true
		System.out.println(names.remove(0)); //Dimple
		System.out.println(names + " |size = " + names.size());
	}
}
