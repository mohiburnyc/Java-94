class A2{
	A2(){
		System.out.println("in class A2 constuctor");
	}
}

class B2 extends A2{
	B2() {		
		System.out.println("in class B2 constructor");
	}
	
}

public class SuperConstructors {

	public static void main(String[] args) {
		B2 obj = new B2();
	}

}
