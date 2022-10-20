
public class ThrowTrow {
	
	public static void function(int x, int y) throws Exception {
		int c=x/y;
	
		
	}

	public static void main(String[] args) throws Exception{
		ThrowTrow tt = new ThrowTrow();
	    try {
	    	tt.function(10,0);
	    	System.out.println(tt);
	    }catch(ArithmeticException e) {
	    	System.out.println("An Excption occured");
	    }
	}

}
