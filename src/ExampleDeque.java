import java.util.ArrayDeque;
import java.util.Deque;

public class ExampleDeque {

	public static void main(String[] args) {
		Deque<String> a = new ArrayDeque<String>();
		a.add("shaik");
		a.add("jani");
		a.add("basha");
		for(String str : a) {
			System.out.println(str);
		}
		

	}

}
