
public class StringMethods {

	public static void main(String[] args) {
		String str = "edureka limited";
		
		System.out.println("size = " + str.length());
		System.out.println("character @ index 0 = " + str.charAt(0));
		//System.out.println("character @ index 15 = " + str.charAt(15)); //java.lang.StringIndexOuOfBoundsException
		
		System.out.println("index of \"e\" = " + str.indexOf("e")); //0
		System.out.println("index of \"e\" from index 1 = " + str.indexOf("e", 1)); //4
		System.out.println("index of \"e\" from last = " + str.lastIndexOf("e")); //13
		System.out.println("index of \"limited\" = " + str.indexOf("limited")); //8
		System.out.println("index of \"java\" = " + str.indexOf("java")); //-1
		
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.replace('e', '*'));
		System.out.println(str);
		
		String s1 = new String("edureka");
		//String s2 = new String("edureka");
		String s2 = new String("Edureka");
		System.out.println("== ----> " + (s1 == s2));
		System.out.println("equals() ---> " + s1.equals(s2));
		System.out.println("contentEquals() ---> " + s1.contentEquals(s2));
		System.out.println("equalsIgnoreCase() ---> " + s1.equalsIgnoreCase(s2));
	}
}