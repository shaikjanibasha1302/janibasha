import java.util.ArrayList;
import java.util.Iterator;
public class testArraylist {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>();
		
		 a.add("shaik");
		 a.add("jani");
		 a.add("basha");
		 
		 System.out.println(a);
		 
		 Iterator<String> i = a.iterator();
		 while(i.hasNext())  {
			 System.out.println(i.next());
		 }
}
}

	





