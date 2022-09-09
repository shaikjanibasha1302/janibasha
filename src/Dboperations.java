import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Dboperations {
	
	     Connection connection;
	     Statement statement;
	     ResultSet resultset; 
	     
	public Dboperations()
		{
			connection = MySqlConnection.getInstance();
		}
		
		public int insertDateWithStatement(Employeee emp) {
			int result = 0;
			
			String query = "insert into Employee values(" +emp.getEmpid()+",'"+emp.getEmpName()+"',"+emp.getSalary()+",'"+emp.getAddress()+"')";

					
			try {
				statement = connection.createStatement();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				result = statement.executeUpdate(query);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			return result;
			
		}
		
		
	public int deletedata(Employeee emp) {
		int result = 0;
		String query = "delete from Employeee where id = "+emp.getEmpid()+"";
		try {
		statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return result;
		
	}
	
	public int update(Employeee emp) {
		int result = 0;
		String query = "update from employee where name="+emp.getEmpName()+"where id="+emp.getEmpid();
		   try {
			statement = connection.createStatement();
			result = statement.executeUpdate(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
		   
	}
	
	
		public static void main(String[] args) {
			Dboperations od = new Dboperations();
			
	        Scanner sc = new Scanner(System.in);
	        for(;;) {
	        	System.out.println("please enter your choice= \n"+
	        "1.insert emplyoeee data \n"+
	        	"2.delete employee data\n"+
	             "3.update the employee data");
	            int n = sc.nextInt();
	            Employeee em = new Employeee();
	        switch(n) {
	        case 1 :
	        	   System.out.println("Please enter emp id");
	   	        
	   	        em.setEmpid(sc.nextInt());
	   	        sc.nextLine();
	   	        System.out.println("Please enter emp Name");
	   	        em.setEmpName(sc.nextLine());
	   	        System.out.println("Please enter Salary");
	   	        em.setSalary(sc.nextDouble());	
	   	   		sc.nextLine();
	   		 	System.out.println("Please enter Address");
		   	     em.setAddress(sc.nextLine());
	   		    od.insertDateWithStatement(em);
	          
	   		  break;
	        case 2 :
	        	System.out.println("please enter the id to be deleted");
	        	em.setEmpid(sc.nextInt());
	        	od.deletedata(em);
	   		  break;
	   		  
	        case 3:
	        	System.out.println("please enter the  id");
	        	em.setEmpid(sc.nextInt());
	        	System.out.println("please enter new name");
	        	em.setEmpName(sc.next());
	        	od.update(em);
	        	break;
	      
	        	
	       
	        }
	        
	       
	        
	    }
	        
	        
	}
}
	


