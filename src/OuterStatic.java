
public class OuterStatic {

	private int i;
	
	public void fuction() {
		System.out.println("outer class" +1);
	}
	
	static class Inner {
		float f;
		
		public void fuction () {
		       OuterStatic o = new OuterStatic();
			System.out.println("Inner class" +(f+o.i));
		}
	}

	public static void main(String[] args) {
		OuterStatic o = new OuterStatic();
		o.i = 10;
		o.fuction();
		
		OuterStatic.Inner in = new OuterStatic.Inner();
		in.f = 1.5f;
		in.fuction();

	}

}
 
