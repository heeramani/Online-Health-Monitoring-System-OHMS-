public class MainDemoClass {
	public static void main (String[] args) {
		Student student = new Student ("Heeramani", 19, "15CSCS30015", "COMPUTER SCIENCE AND ENGINEERING");
		Staff staff = new Staff("pram ram", 40, 38662, "10/02/2015", "clerk");
		Faculty faculty = new Faculty ("Ram shtyam", 45, 55252, "24/08/2510", "Professor");
		
		student.display();
		staff.display();
		faculty.display();
	}
}
