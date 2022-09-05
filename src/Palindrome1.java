import java.util.Scanner;


public class Palindrome1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	    System.out.println("Enter the number:");
	    
	    int n=sc.nextInt();
	    int t=n;
	    int r=0;
	    
	    while(n>0) {
	    	r=r*10+n%10;
	    	n=n/10;
	    }
		if(t==r) {
			System.out.println(t+" palindrome number");
		}
		else {
			System.out.println(t+" not palindrome number");
		}
	}

}
