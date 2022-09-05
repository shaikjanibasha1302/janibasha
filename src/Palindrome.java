
public class Palindrome {

	
	int a;
	public void plain (int n) {
		int temp = n;
		int rem;
		int tot=0;
		while(n>0) {
			rem = n%10;
			tot = (tot*10)+rem;
			n=n/10;
			
		}
           if (temp==tot) {
        	   System.out.println("palindrome");
           }else {
        	   System.out.println("not palindrome");
           }
	}
	
	public static void main (String[] args) {
		Palindrome p = new Palindrome();
		p.plain(12321);
	}

}
