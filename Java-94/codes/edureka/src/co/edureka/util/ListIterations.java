package co.edureka.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIterations {

	public static void main(String[] args) throws Exception {
		List<Integer> marks = Arrays.asList(92,87,64,73,82,90,61); 
		
		iterate1(marks);
		Thread.sleep(1500);
		
		iterate2(marks);
		Thread.sleep(1500);
		
		iterate3(marks);
		Thread.sleep(1500);
		
		iterate4(marks);
		Thread.sleep(1500);
		
		iterate5(marks);
		Thread.sleep(1500);
		
		iterate6(marks);
	}

	static void iterate1(List<Integer> marks) {
		System.out.println("<<< iteration using for loop & get() - only for java.util.List implementation");
		for(int i=0; i<marks.size(); i++) {
			Integer n = marks.get(i);
			System.out.print(n+"     ");
		}
		System.out.println("\n");
	}

	static void iterate2(List<Integer> marks) {
		System.out.println("<<< iteration using enhanced for loop");
		for(Integer n : marks) {
			System.out.print(n+"     ");
		}
		System.out.println("\n");
	}
	
	static void iterate3(List<Integer> marks) {
		System.out.println("<<< iteration using java.util.Iterator");
		Iterator<Integer> it = marks.iterator();
		while(it.hasNext()) {
			Integer n = it.next();
			System.out.print(n+"     ");
		}
		System.out.println("\n");
	}
	
	static void iterate4(List<Integer> marks) {
		System.out.println("<<< iteration using ListIterator - only for java.util.List implementation");
		ListIterator<Integer> lit = marks.listIterator(); 
		while(lit.hasNext()) {	
			Integer n = lit.next();
			System.out.print(n+"     ");
		}
		System.out.println();
		
		while(lit.hasPrevious()) {
			Integer n = lit.previous();
			System.out.print(n + "     ");
		}
		System.out.println("\n");
	}
	
	static void iterate5(List<Integer> marks) {
		System.out.println("<<< iteration using java.util.Enumeration");
		Enumeration<Integer> it = Collections.enumeration(marks);
		while(it.hasMoreElements()) {
			Integer n = it.nextElement();
			System.out.print(n+"     ");
		}
		System.out.println("\n");
	}	
	
	static void iterate6(List<Integer> marks) {
		System.out.println("<<< iteration using forEach(Consumer)");
		marks.forEach(mark -> System.out.print(mark + "     "));		
		System.out.println("\n");
	}	
}
