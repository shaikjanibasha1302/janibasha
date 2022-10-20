import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConnection {
	
	private static SqlConnection MC = new SqlConnection();
	Connection C;
	
	private SqlConnection() {
		
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			C = DriverManager.getConnection("jdbc:mysql://localhost:3306/org","root","J@nibasha1302");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	
	public static Connection getinstance() {
	return MC.C;
	}
	
	

	public static void main(String[] args) {
		System.out.println(SqlConnection.getinstance());
		

	}
	
}