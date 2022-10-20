import java.util.LinkedHashMap;
import java.util.Map;

public class testLinkedHashMap {

	public static void main(String[] args) {
	  LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();
	  map.put(1,"Apple");
	  map.put(2,"Mango");
	  map.put(3, "Grapes");
	  map.put(4, "orange");
	  
	  for(Map.Entry m : map.entrySet()) {
		  System.out.println(m.getKey()+" "+m.getValue());
	  }
	  

	}

}
