import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Collection;

public class DBOperation {
  
	   Collection connection;
	   Statement statement;
	   ResultSet resultset;
	   
	   public DBOperation() {
		   connection = MySqlConnection.getInstance();
		   
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
