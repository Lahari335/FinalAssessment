package Basicoops;
class Animal
{
    void animals() {
        System.out.println("Talk about animal");
    }
}

public class AnimalOverriding extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalOverriding obj = new AnimalOverriding();
        obj.animals();

    }
    //sub class
    void animals() {
        super.animals();
        System.out.println("Dogs can walk and run");
    }

}
