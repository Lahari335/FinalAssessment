package Basicoops;
abstract class Vehicle1
{
	abstract void m1();
	void m2()
	{
		System.out.println("Most prefered mode of transportation");
	}
}
public class Abstract extends Vehicle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstract obj=new Abstract();
		obj.m2();
		obj.m1();
	}
	void m1()
	{
		System.out.println("bus");
	}
}
