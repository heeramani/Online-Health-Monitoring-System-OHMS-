public class Staff extends Employee {
	private String designation;
	
	public Staff (String name, int age, int ecNo, String doj, String designation) {
		super(name, age, ecNo, doj);
		this.designation = designation;
	}
	
	public void display() {
		super.display();
		System.out.println("Designation of Staff: " + designation);
	}
}

