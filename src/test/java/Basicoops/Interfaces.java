package Basicoops;
interface dental1{
    void mentalhealth1();
}
interface dental2{
	void mentalhealth2();
}

public class Interfaces implements dental1,dental2{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaces obj = new Interfaces();
        obj.mentalhealth1();
        obj.mentalhealth2();

    }
    public void mentalhealth1() {
        System.out.println("Mental health care is much needed");
    }
    public void mentalhealth2() {
        System.out.println("dental care is also needed with mental health");

	}

}


