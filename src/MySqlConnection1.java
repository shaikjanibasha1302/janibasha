import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlConnection1 {

	private static MySqlConnection1 mysqlconnection = new MySqlConnection1();
	
	Connection connection;
	
	private MySqlConnection1() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sample","root","J@nibasha1302");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
		public static Connection getInstances() {
			 return mysqlconnection.connection;
		}
	
	
	public static void main(String[] args) {
		System.out.println(mysqlconnection.getInstances());
	}

}
