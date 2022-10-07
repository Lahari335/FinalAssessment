package Basicoops;

import java.util.Iterator;
import java.util.LinkedList;

public class Collection2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> al=new LinkedList<String>();  
		al.add("Java");  
		al.add("Python");  
		al.add("C");  
		al.add("dotnet");  
		Iterator<String> itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  

	}

}
