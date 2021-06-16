package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcConnection {

	public int Login( String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/applogin","root","bvcoe123@123");   
			Statement stmt = con.createStatement();  
			ResultSet rs = stmt.executeQuery("select * from userlogin where email = \"" + email + "\";");
			if(!rs.next()) {
				return 0;
			}
			else if( password.equals(rs.getString("password"))) {
					application.RecipeAppMain.currentUser.setId(rs.getInt("userId"));
					application.RecipeAppMain.currentUser.setfname(rs.getString("firstName"));
					application.RecipeAppMain.currentUser.setlname(rs.getString("lastName"));
					application.RecipeAppMain.currentUser.setemail(rs.getString("email"));
					return 1;
				}
			con.close();
		}
		catch(Exception e){ 
			System.out.println(e);
			} 
		return 0;
	}
	
	public int SignUp( String firstName, String lastName, String email, String password) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/applogin","root","bvcoe123@123");   
			Statement stmt = con.createStatement();
			
			String query = "insert into userlogin (firstName, lastName, email, password)  values (\"" + firstName + "\",\"" + lastName + "\",\"" + email + "\",\"" + password + "\")";
			stmt.execute(query);
			
			con.close();
			
		} catch(Exception e){ 
			System.out.println(e);
			}
		return 1;
	}
}

















