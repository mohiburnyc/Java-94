
public class ArrayInitialization {

	public static void main(String[] args) {
		int[] marks = {86,92,71,65,99,70};
		
		System.out.println("no of subjects = " + marks.length);
		System.out.println();
		
		// array iteration using for loop
		for(int i=0; i<marks.length; i++) {
			System.out.println("mark for subject-"+ (i+1) + " = " + marks[i]);
		}
		System.out.println();
		
		// array iteration using enhanced for loop (from Java 5 - JDK 1.5)
		System.out.print("marks obtained ----> ");
		for(int mark : marks) {
			System.out.print(mark + " | ");
		}
		System.out.println();
		
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}

}
