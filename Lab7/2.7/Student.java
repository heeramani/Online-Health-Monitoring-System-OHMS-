public class Student implements Comparable<Student> {
	private String firstName, lastName;
	
	public Student (String f, String l) {
		firstName = f;
		lastName = l;
	}
	
	public String toString() {
		return " " + firstName + " " + lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int compareTo(Student std) {
		int tmp1 = (this.firstName).compareTo(std.firstName);
		if (tmp1 != 0) {
			return tmp1;
		}
		return (this.lastName).compareTo(std.lastName);
	}
}
