
public class LocalInner {

	  public int i;
	  
	  public int fuction() {
		  class Local {
			  int in;
			  public int  fuction() {
				  System.out.println("local class method");
				  return in+5;
			  }
		  }
		  Local l = new Local();
		  l.in = 10;
		  return l.fuction();
	  }
	
	public static void main(String[] args) {
		  LocalInner li = new LocalInner();
		  li.i = li.fuction();
		  System.out.println(li.i);

	}

}
