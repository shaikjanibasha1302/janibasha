import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class DBOperation1 {
     Connection connection;
     Statement statement;
     ResultSet resultset;
     
	
	public DBOperation1()
	{
		connection = MySqlConnection.getInstance();
	}
	
	public int insertDateWithStatement(Employee1 emp) {
		int result = 0;
		
		String query = "insert into Employee1 values(" +emp.getEmployeeId()+",'"+emp.getFirstName()+"',"+emp.getLastName()+",'"+emp.getFathersName()+"')";

				
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
		DBOperation1 db = new DBOperation1();
        Scanner sc = new Scanner(System.in);
        
        
        Employee1 em = new Employee1();
        
        System.out.println("Please enter emp id");
        
        em.setEmployeeId(sc.nextInt());
        
        sc.nextLine();
        
        System.out.println("Please enter emp Name");
        
        em.setFirstName(sc.nextLine());
        
        System.out.println("Please enter Salary");
        
        
        em.setLastName(sc.nextLine());;	
        
	    sc.nextLine();
	 
	 
	    System.out.println("Please enter Address");
	
	    em.setFathersName(sc.nextLine());
	
	    db.insertDateWithStatement(em);
	
	
	}
	
	

}