package Basicoops;

public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading obj = new Overloading();
		obj.sub(3,2);
		obj.add(10,20,30);
		obj.mul(4,3);		
	}
	void sub(int a, int b) {
		System.out.println(a-b);
	}
	void add(int x, int y, int z) {
		System.out.println(x+y+z);
	}
	void mul(int x, int y) {
		System.out.println(x*y);
	}

}
	




