package Basicoops;
interface sun1{
    void moon1();
}
interface sun2{
	void moon2();
}

public class Interfaces implements sun1,sun2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces obj = new Interfaces();
        obj.moon1();
        obj.moon2();

    }
    public void moon1() {
        System.out.println("Milky way galaxy consists of moon and star");
    }
    public void moon2() {
        System.out.println("sun is surrounded by star");

	}

}


