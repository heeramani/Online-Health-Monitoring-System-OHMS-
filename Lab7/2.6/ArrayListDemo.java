import java.util.ArrayList;

public class ArrayListDemo {
	public static void main (String[] args) {
		ArrayList<Integer> alist = new ArrayList<>();
		
		for (int i = 1; i <= 10; i++) {
			alist.add(i * i);
		}
		
		for (int x : alist) {
			System.out.println(x);
		}
		
		System.out.println("Size of the list is: " + alist.size());
		
		System.out.println("Removing all elements from the list...");
		alist.clear();
		
		if (alist.isEmpty()) {
			System.out.println("ArrayList is empty");
		} else {
			System.out.println("ArrayList is not empty");
		}
	}
}
