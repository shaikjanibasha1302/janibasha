import java.util.HashSet;


import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.SortedSet;

public class ExampleHashset {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		// LinkedHashSet<String> is = new LinkedHashSet<String>();
		  
		  // TreeSet<String> ts = new TreeSet<String>();
		// SortedSet<String> ss = new TreeSet<String>();
		
		   set.add("java");
		   set.add("collections");
		   set.add("java");
		   set.add("set");
		   set.add(null);
		   
		   Iterator<String> i = set.iterator();
		   while(i.hasNext()) {
		   System.out.println(i.next());
		   }

	}

}
