
public class Inventory {

	public static void main(String[] args) {
		Product prod = new Product();
		
		prod.setProductId(101);
		prod.setProductName("Computer");
		prod.setProductPrice(45750f);
		
		System.out.println(prod.getProductId() + " | " + prod.getProductName() + " | " + prod.getProductPrice());
		
		System.out.println("prod is of type ---> " + prod.getClass().getName());
		
		System.out.println("hashCode of prod ---> " + prod.hashCode());
		System.out.println("hashCode of prod in hexa decimal format ---> " + Integer.toHexString(prod.hashCode()));
		
		System.out.println(prod); //toString()
	}
}