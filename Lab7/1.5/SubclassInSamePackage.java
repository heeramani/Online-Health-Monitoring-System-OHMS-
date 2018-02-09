class BaseClass {
	public int x =10;
	public int y = 10;
	public int z = 10;
	int a  = 10;
	public int getX() {
		return x;
	}

	public void setX(int x){
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}


	public void setZ(int z) {
		this.z = z;

	}

	
	public int getA() {
		return a;
	}

	public void setA(int A) {
		this.a = a;
	}


}

public class SubclassInSamePackage extends BaseClass {
	public static void main(String args[]) {
		BaseClass rr = new BaseClass();
		rr.z = 0;

		SubclassInSamePackage subClassObj = new SubclassInSamePackage();

		//Aceess modifier public 

		System.out.println("Value of the x is :" + subClassObj.x );
		subClassObj.setX(20);
		System.out.println("Value of the x is :" + subClassObj.x );

		System.out.println("Value of the y is :" + subClassObj.y);
		subClassObj.setY(20);
		System.out.println("Value of the y is :" + subClassObj.y);

		System.out.println("Value of the z is :" + subClassObj.z);
		subClassObj.setZ(20);
		System.out.println("Value of the z is :" + subClassObj.z);

		System.out.println("Value of the A is :" + subClassObj.a);
		subClassObj.setA(20);
		System.out.println("Value of the A is :" + subClassObj.a);




	}
}