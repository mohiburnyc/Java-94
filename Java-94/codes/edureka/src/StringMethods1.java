
public class StringMethods1 {

	public static void main(String[] args) {
		String str = "   java   tech   ";
		System.out.println(str + " | " + str.length());

		str = str.trim();
		System.out.println(str + " | " + str.length());
		
		System.out.println(str.startsWith("java"));
		System.out.println(str.endsWith("java"));
		
		str = "edureka limited into online trainings and software development";
		String[] words = str.split(" ");
		System.out.println("no of words = " + words.length);
		for(String word :  words) {
			System.out.println("\t----> " + word);
		}
		
		int n = 12;
		System.out.println(n);
		String str1 = String.valueOf(n);
		System.out.println(str1);
	}
}
