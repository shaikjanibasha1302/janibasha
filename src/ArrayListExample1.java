import java.util.*;
public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(0);
		al.add(2);
		al.add(3);
		
		System.out.println(al);
		// add of an element in arraylist
		al.add(1 ,1);
		System.out.println(al);
		
		// size of array list
		int size = al.size();
		System.out.println(size);
		
		
		

	}

}
