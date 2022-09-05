import java.util.Vector;
import java.util.Iterator;
public class testVector {

	public static void main(String[] args) {
	  Vector<String> v = new Vector<String>();
	   
	  v.add("j");
	  v.add("a");
	  v.add("n");
	  v.add("i");
	  
	  Iterator<String> i = v.iterator();
	  while(((Iterator<String>) v).hasNext()) {
	  System.out.println(((Iterator<String>) v).next());

	}
	}
}

