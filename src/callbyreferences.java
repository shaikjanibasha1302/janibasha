
public class callbyreferences {

	public static void main(String[] args) {
		String[] names = {"shaik","jani","basha","ashid"};
		callbyreferences a = new callbyreferences();
		a.displayNames(names);

	}
	
	void displayNames(String[] names) {
		for(String name: names) {
			System.out.println(name);
			
		}
	}

}
