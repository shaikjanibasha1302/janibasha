import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



public class ExampleHashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> map =new HashMap<Integer,String>();
		
		map.put(1, "java");
		map.put(2, "session");
		map.put(3, "on map");
		map.put(4, null);
		map.put(5,"");
		
	//	non-genric
		 Set s = map.entrySet();
		 Iterator i = s.iterator();
		 while(i.hasNext()) {
			 Map.Entry e = (Map.Entry)i.next();
			 System.out.println(e.getKey()+""+e.getValue());
		 }
		
		//genric
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
	}

}
