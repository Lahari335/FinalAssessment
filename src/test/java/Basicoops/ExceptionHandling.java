package Basicoops;
class Throw
{
	static void validate(int age) 
	{
		if(age<18)
			throw new ArithmeticException("Not eligible for voting");
		else
			System.out.println("Person is eligible for voting");
		
	}
}

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(10);
		System.out.println("not eligible");
		
		int x[]=new int[5];
		try {
			x[5]=10/1;
		}
		catch(ArithmeticException e){
			System.out.println("Exception code");
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Exception code");
		}


	}

	private static void validate(int age) {
		

	}
}



