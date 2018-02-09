public class Faculty extends Employee {
	private String designation;
	
	public Faculty (String name, int age, int ecNo, String doj, String designation) {
		super(name, age, ecNo, doj);
		this.designation = designation;
	}
	
	public void display() {
		super.display();
		System.out.println("Designation of Faculty: " + designation);
	}
}

