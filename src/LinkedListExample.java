import java.util.*;
public class LinkedListExample {

	public static void main(String[] args) {
	     
		LinkedList s = new LinkedList();
		
		s.add("jani");
		s.add("basha");
		s.add("shaik");
		
		
		System.out.println(s);
		s.remove("jani");
		
		System.out.println(s);
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		Iterator i = s.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		

	}

}
