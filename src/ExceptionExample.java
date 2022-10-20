
public class ExceptionExample {


      public void case1(int x, int y) {
    	  if(y!=0) {
    		  System.out.println(x/y);
    	  }else {
    		  System.out.println("the value of y is 0");
    	  }
    		  
    	  
      }
      public void case2(int x, int y) {
    	  try {
    		  System.out.println(x/y);
    	  }catch(ArithmeticException e) {
    		  System.out.println("the value of y is 0");
    	  }
      }
    	public void case3() {
    		int x[] = new int[10];
    		try {
    			x[11] = 8;
    			System.out.println("The value of x:"+ x);
    		}catch(ArrayIndexOutOfBoundsException e){
    			System.out.println("Array Index Out of Bound Exception");	
    		}finally {
    			x[1] = 1;
    			System.out.println("The first Elemnt: "+ x[1]);
    			System.out.println("the finally statement is executed");
    			
    		}
    		
    	}
    	
    	  
      
  	public static void main(String[] args) {
	     ExceptionExample ee = new ExceptionExample();
	     ee.case1(10,2);
	     ee.case2(10, 0);
         ee.case3();
	}
}
