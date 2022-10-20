import java.util.Vector;

public class testVector {

	public static void main(String[] args) {
	  Vector<String> v = new Vector<String>();
	   
	  v.add("Tiger");
	  v.add("Lion");
	  v.add("Elephant");
	  v.add("Fox");
	  System.out.println("The animals are:" + v);
	  System.out.println("the first element:" + v.firstElement());
	  System.out.println("the last element:" + v.lastElement());
	
	}
}

