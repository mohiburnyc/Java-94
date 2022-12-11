package co.edureka;

public class WrapperTest1 {

	public static void main(String[] args) {
		Integer in = Integer.valueOf(26);
		
		byte b = in.byteValue();
		short s = in.shortValue();
		int n = in.intValue();
		long l = in.longValue();
		float f = in.floatValue();
		double d = in.doubleValue();
		
		System.out.println(b + " | " + s + " | " + n + " | " + l);
		System.out.println(f + " | " + d);
		
		int n1 = 25; //primitive type
		Integer n2 = n1; //reference type - autoboxing
		int n3 = n2; //un-boxing
		System.out.println(n1 + " | " + n2 + " | " + n3);
	}

}
