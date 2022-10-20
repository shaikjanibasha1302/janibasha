import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerialization {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
	            Emp emp = null;
	            try {
	           FileInputStream filein = new FileInputStream("E:\\studio\\char.txt");
	           ObjectInputStream in = new ObjectInputStream(filein);
	           emp = (Emp) in.readObject();
	           in.close();
	           filein.close();
	            }finally {
	            	System.out.println("Deserialized Employee...");
	            	System.out.println("name of Employee" + emp.name);
	            	System.out.println("address of the employee" + emp.address);
	            }

	}

}
