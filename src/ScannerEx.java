import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    String st = "Enter Your Details";
	    System.out.println(st);
	    System.out.println("Enter your Name");
	    String name = s.next();
	    System.out.println("Name:"+ name);
	    System.out.println("Enter your salary");
	    double salary = s.nextDouble();
	    System.out.println("Your Salary:"+ salary);
	    System.out.println("Enter Name of Your Company");
	    String company = s.next();
	    System.out.println("Your Company:"+ company);
	    

	}

}
