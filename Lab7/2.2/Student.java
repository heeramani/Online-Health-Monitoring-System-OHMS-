public class Student extends Person {
	private String rollNo, branch;
	
	public Student(String name, int age, String rollNo, String branch) {
		super(name, age);
		this.rollNo = rollNo;
		this.branch = branch;
	}
	
	public void display() {
		super.display();
		System.out.println("Roll No.: " + rollNo + "\nBranch: " + branch);
	}
}

