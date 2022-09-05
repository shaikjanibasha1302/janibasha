import java.util.Scanner;
public class Odimatch {

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String Weather = s.nextLine();
       
       if(Weather.equals("good")) {
    	   System.out.println("Begin the match of 50 overs");
       }
       else
    	   if(Weather.equals("rain for 1hr")) {
    		   System.out.println("Match played for 40 overs");
    	   }
    	   else
    		   if(Weather.equals("rain for 2hrs")) {
    			   System.out.println("Match played for 20 overs");
    		   }
    		   else
    			   if(Weather.equals("rain for 3hrs")) {
    				   System.out.println("Match cancelled");
    			   }
    			   else {
    				   System.out.println("Match over");
    			   }
       System.out.println("Welcome to Match");
       System.out.println("Enter the score of India:");
       int India = s.nextInt();
       System.out.println("Enter the score of Pakistan");
       int Pakistan = s.nextInt();
         if(India>Pakistan) {
    	   System.out.println("India won the Match");
       }
       else
    	   if(India<Pakistan) {
    		   System.out.println("Pakistan won the Match");
    	   }
    	  
		
	}
}
