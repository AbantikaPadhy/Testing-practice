package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertQueryDemo {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String ttile = "Finding Nemo";
		String gender = "Comedy";
		String director = "Andrew Stanton ";
		String release_year = "2003";
		
		String dburl = "jdbc:mysql://localhost:3306/animated_movies";
		String username = "root";
		String password = "root";
		
		
Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(dburl,username,password);
		PreparedStatement ps = con.prepareStatement("insert into movies values(?,?,?,?)"); // execute query
		ps.setString(1,ttile);
		ps.setString(2,gender);
		ps.setString(3,director);
		ps.setString(4,release_year);
		
		ps.executeUpdate();
		// see the result
	}
}

	


