import java.util.*;
import java.util.Map.Entry;

public class CountChar {

	public static void main(String[] args) {
	    String s = "shaijanibasha";
	    Map<Character,Integer> count = new HashMap<>();
	    char[] charArray = s.toCharArray();
	    
	    for(char c: charArray) {
	    	if(count.containsKey(c)) {
	    		count.put(c, count.get(c)+1);
	    	}else {
	    		count.put(c,1);
	    	}
	    }
	    for(Entry<Character,Integer>entry : count.entrySet()) {
	    	if(entry.getValue()>1) {
	    		System.out.println(entry.getKey()+" : "+ entry.getValue());
	    	}
	    }
	}

}
