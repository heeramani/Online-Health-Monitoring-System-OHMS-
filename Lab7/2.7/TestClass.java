import java.util.Arrays;

public class TestClass {
	public static void main (String[] args) {
		Student[] students = new Student[6];
		students[0] = new Student("Siddharth", "Singh");
		students[1] = new Student("Yashsvi", "Dixit");
		students[2] = new Student("Ayush", "Bansal");
		students[3] = new Student("Ayush", "Sharma");
		students[4] = new Student("Yashvardhan", "Singh");
		students[5] = new Student("Aayush", "Gupta");
		
		Arrays.sort(students);
		for (Student s : students) {
			System.out.println(s);
		}
	}
}
