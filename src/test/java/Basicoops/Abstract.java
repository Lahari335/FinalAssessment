package Basicoops;
abstract class Vehicle1 //abstract class
{
	abstract void m1(); //abstract method
	void m2() //non abstract method
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
	//abstract class defination under subclass
	void m1()
	{
		System.out.println("bus");
	}
}
