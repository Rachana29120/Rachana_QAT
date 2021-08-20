import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class dbcconnection {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521/xe";
		String username = "SYSTEM";
		String password = "Abcd29120";
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection(url,username,password);
		System.out.println("Connection created");
		Statement stmt = con.createStatement();
		String updateQuery = "UPDATE student SET age =15 where ID=3";
		stmt.executeQuery(updateQuery);
		ResultSet rs= stmt.executeQuery("SELECT * FROM student");
		System.out.println("query execution"+rs);
		while(rs.next())
		{
			System.out.println(rs.getString("roll_no")+":"+ rs.getString("name")+":"+rs.getString("address")+rs.getString("age"));
		}
		con.close();
	}
	
}

