public class C implements B{
	public static void main(String args[]){
	C obj =new C();
	obj.doSomething();
	obj.doSomethingMore();	
	}
	
	public  void doSomething(){
		System.out.println("Something done");
	}
	
	public void doSomethingMore(){
		System.out.println("Something more is done");
	}
}
