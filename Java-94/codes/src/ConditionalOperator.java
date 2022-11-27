
public class ConditionalOperator {

	public static void main(String[] args) {
		int x = 100;
		int y = 20;
		
		int lar = (x > y) ? x : y;
		
		System.out.println("largest of (" + x + ", " + y + ") = " + lar);
	}

}
