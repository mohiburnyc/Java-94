package co.edureka.pack1;

import co.edureka.pack2.Nums;

public class PackTest {

	public static void main(String[] args) {
		Nums numsRef = new Nums();
		
		numsRef.add(10, 20);
		System.out.println("diff = " + numsRef.sub(10,20));
	}

}
