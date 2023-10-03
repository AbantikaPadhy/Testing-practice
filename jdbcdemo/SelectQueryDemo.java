package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectQueryDemo {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {

	String dburl ="jdbc:mysql://localhost:3306/animated_movies";
	String username = "root";
	String password = "root";
	String query = "select * from movies";
	
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	Connection con= DriverManager.getConnection(dburl, username, password);
	Statement stmt = con.createStatement();
	ResultSet rs = stmt.executeQuery(query);
	System.out.println("successfully connected to database");
	
	  
	
	
	while(rs.next())
	{
		System.out.println("ttile : " + rs.getString("tti le") + "\t" );
		System.out.println("gender : " + rs.getString("gender") + "\t" );
		System.out.println("director : " + rs.getString("director") + "\t" );
		System.out.println("release_year : " + rs.getString("release_year") + "\t" );
	}
	con.close(); 
}
}









