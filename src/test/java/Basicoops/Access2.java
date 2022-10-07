package Basicoops;
class Private{
	void p1() {
	
		System.out.println("welcome to java");
	}
}
class Default{
	void p2() {
		System.out.println("welcome to java");
	}
}

public class Access2 {
	public void p3() {
		System.out.println("welcome to java");
	}

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
				 Private obj= new Private();
				   obj.p1();

	}

}



