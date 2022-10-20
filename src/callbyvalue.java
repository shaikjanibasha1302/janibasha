
public class callbyvalue {

	public static void main(String[] args) {
		int v = 10;
		callbyvalue c = new callbyvalue();
		c.displayValue(v);
		System.out.println("current value of v in main method : "+ v);

	}
        void displayValue(int v) {
        	System.out.println("current value of v to display : "+ v);
        	v = 20;
        	System.out.println("current value of the v to display :"+ v);
        }
	
	
	
}
