package Basicoops;
import java.util.Iterator;
import java.util.LinkedList;
public class Collection2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 LinkedList<String> ll = new LinkedList<String>();
	        System.out.println("List types of transportation services");
	        ll.add("bus service");
	        ll.add("train service");  
	        System.out.println(ll);
	        System.out.println();
	        ll.addLast("ola service");
	        ll.addFirst("uber service");
	        System.out.println(ll);
	        System.out.println();
	        ll.remove("bus service");	    
	        ll.removeFirst();
	        ll.removeLast();
	        System.out.println(ll) ;
	}  

} 
		
