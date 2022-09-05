import java.util.LinkedList;
import java.util.Iterator;
public class testlinkedlist1 {

	public static void main(String[] args) {
		LinkedList<String> a = new LinkedList<String>();
		
		a.add("1");
		a.add("2");
		a.add("3");
		 
		Iterator<String> i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	

	}

}
