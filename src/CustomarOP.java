import java.sql.*;
import java.util.Scanner;

public class CustomarOP {
	Connection Cn;
	Statement St;
	ResultSet Rs;
	
	public CustomarOP() {
		Cn = SqlConnection.getinstance();
		
	}
	public int insert(Customar C) {
		int R = 0;
		String Query ="insert into Customar values("+C.getId()+",'"+C.getName()+"',"+C.getCurrentCTC()+","+C.getExpectedCTC()+")";
		try {
			St = Cn.createStatement();
			int Rs = St.executeUpdate(Query);
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return R;
		
	}

	public static void main(String[] args) {
		CustomarOP Cust = new CustomarOP();
		Scanner Sc = new Scanner(System.in);
		Customar CC = new Customar();
		
		System.out.println("Please enter id");
		CC.setId(Sc.nextInt());
		System.out.println("Please enter name");
		CC.setName(Sc.next());
		System.out.println("Please enter currentCTC");
		CC.setCurrentCTC(Sc.nextInt());
		System.out.println("Please enter EXpectedCTC");
		CC.setExpectedCTC(Sc.nextInt());
		
		Cust.insert(CC);
		
		

	}

}