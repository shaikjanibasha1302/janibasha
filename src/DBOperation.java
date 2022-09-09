import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DBOperation {
     Connection connection;
     Statement statement;
     ResultSet resultset; 
     
public DBOperation()
	{
		connection = MySqlConnection.getInstance();
	}
	
	public int insertDateWithStatement(Employeee emp) {
		int result = 0;
		
		String query = "insert into Employee1 values(" +emp.getEmpid()+",'"+emp.getEmpName()+"',"+emp.getSalary()+",'"+emp.getAddress()+"')";

				
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
	
	
	
	
	public static void main(String[] args) {
		DBOperation db = new DBOperation();
        Scanner sc = new Scanner(System.in);
        
        
        Employeee em = new Employeee();
        
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
	
	    db.insertDateWithStatement(em);
	
	
	}
	
	

}