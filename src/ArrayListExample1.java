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
		System.out.println("******************");
		// size of array list
		int size = al.size();
		System.out.println(size);
		System.out.println("*****************");
		Iterator itr = al.iterator(); // getting the iterator
		while(itr.hasNext()) {

			System.out.println(itr.next()); // printing the element and moving to the next 
		}
		System.out.println("*****************");
		for(int number: al)    // using for loop
			System.out.println(number);
		

	}

}
