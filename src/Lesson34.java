import java.sql.*;

public class Lesson34 {
	
	public static void main(String[] args) {
		
		Connection conn = null;
		
		try{
			
			Class.forName("com.mysql.jdb.Driver");
			
			conn = DriverManager.getConnection("jdbc:mysql://loclahost/wypozycalnia_samochodow", "root", "");
			
			Statement sqlState = conn.createStatement();
			
			String selectStuff = "SELECT * FROM 'samochody'";
			
			ResultSet rows = sqlState.executeQuery(selectStuff);
			
			
		}
		
	}

}
