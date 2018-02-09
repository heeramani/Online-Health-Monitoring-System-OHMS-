class fact{
	long factorial1(int x){
			if(x == 1 )
				return 1;
			return factorial1(x - 1) * x;
		}
}

public class factorial{
	public static void main(String args[]) {
		

		int i=Integer.parseInt(args[0]);
		
		fact object = new fact();
		System.out.println("The  factorail of given string is :\t" + object.factorial1(i));	 


	}
}