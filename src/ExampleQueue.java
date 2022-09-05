
import java.util.PriorityQueue;
import java.util.Iterator;
public class ExampleQueue {

	public static void main(String[] args) {
		PriorityQueue<String> a = new PriorityQueue<String>();
		
		a.add("shaik");
		a.add("jani");
		a.add("basha");
		//System.out.println("head:" +a.element());
		System.out.println("head:" +a.peek());
		
		Iterator itr = a.iterator();
         while(itr.hasNext()) {
        	 System.out.println(itr.next());
         }

	}

}
