package Basicoops;
class Login{
	void verifylogin() {
		System.out.println("enter login details");
	}
}
class AddBen extends Login{
	void show() {
		System.out.println("beneficiary details are added");
	}
	
}
public class Single_inheri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddBen ob=new AddBen();
		ob.verifylogin();
		ob.show();
	}

}






