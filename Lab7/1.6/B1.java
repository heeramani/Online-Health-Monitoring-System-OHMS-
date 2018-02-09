public class B1 extends A1 implements I2 {
	public void methodI1() {
		System.out.println("I am in methodI1 of class B1");
	}
	
	public void methodI2() {
		System.out.println("I am in methodI2 of class B1");
	}
	
	public static void main(String[] args) {
		B1 b1 = new B1();
		b1.methodI1();
		b1.methodI2();
	}
}

