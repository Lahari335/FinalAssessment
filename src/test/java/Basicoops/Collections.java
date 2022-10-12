package Basicoops;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class Collections {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection values=new ArrayList();
		System.out.println("List some types of Insurance and its year");
		values.add("house Insurance");
		values.add(2003);
		values.add("car Insurance");
		values.add(2004);
		values.add("gold Insurance");
		values.add(2005);
		Iterator i= values.iterator();
		while(i.hasNext())//returns true if there is another line in input
		{
			System.out.println(i.next());
	
		}
		System.out.println("Remove the data of car Insurance");
		values.remove("car Insurance");
		values.remove(2004);
		Iterator j= values.iterator();//an object that can be used to loop through collection
		
		while(j.hasNext())//returns true if there is another line in input
		{
			System.out.println(j.next());
	}

}
}
