package co.edureka.util;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {
		TreeSet<String> names = new TreeSet<String>(new NamesComparator()); 
		
		System.out.println(names.add("Sunil")); //true
		System.out.println(names.add("Sunil")); // false
		System.out.println(names.add("Bharath")); //true
		names.add("Anil");
		names.add("Sanjay");
		names.add("Kapil");
		
		System.out.println(names + "| size = " + names.size());
		/*
		Set<String> namesDescending = names.descendingSet();
		System.out.println(namesDescending);
		*/
	}
}

class NamesComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {		
		//return 0;
		//return 1;
		//return -1;
		int n = o1.compareTo(o2);
		if(n > 0)
			return -1;
		else if(n < 0)
			return 1;
		else
			return 0;
	}
	
}
