public class Employee extends Person {
	private String doj;
	private int ecNo;
	
	public Employee (String name, int age, int ecNo, String doj) {
		super(name, age);
		this.ecNo = ecNo;
		this.doj = doj;
	}
	
	public void display() {
		super.display();
		System.out.println("ecNo: " + ecNo + "\ndate of joining: " + doj);
	}
}

