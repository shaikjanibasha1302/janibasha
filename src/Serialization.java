import java.io.*;

public class Serialization {

	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.name = "jani";
		emp.address = "Hyd";
		
		try {
			FileOutputStream fileout = new FileOutputStream("E:\\studio\\char.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileout);
			out.writeObject(emp);
			out.close();
			fileout.close();
			System.out.println("Serialized data is stored in char.txt");
		}catch(IOException e) {
			e.printStackTrace();
			
		}

	}

}
