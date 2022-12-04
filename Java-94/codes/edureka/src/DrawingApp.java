import java.util.Scanner;

public class DrawingApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Shape sh = null;
		//sh = new Shape("red"); //Cannot instantiate the type Shape
		
		System.out.print("which shape do you want to work with? [1.Rectangle | 2.Circle]: ");
		int shapeType = sc.nextInt();
		
		switch(shapeType) {
		  case 1:
			sh = new Rectangle("blue", 12, 8);
			break;
		  case 2:
			sh = new Circle("yellow", 12.5);
			break;
		  default:
			System.out.println("INVALID SHAPE SELECTION ---- TRY AGAIN ----");
			return;
		}
		
		System.out.println("\n=========================== DRAWING WITH " + sh.getClass().getName().toUpperCase() + " ===========================\n");
		
		System.out.println("color of " + sh.getClass().getName() + " = " + sh.getColor());
		sh.area();
	}
}
