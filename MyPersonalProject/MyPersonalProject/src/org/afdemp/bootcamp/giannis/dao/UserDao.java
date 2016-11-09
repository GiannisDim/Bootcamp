package org.afdemp.bootcamp.giannis.dao;

import java.sql.*;
import org.afdemp.bootcamp.giannis.domain.User;

public class UserDao {

	public UserDao(){
		
	}
	
	private Connection con = null;
	
	public void open() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e){
			throw new SQLException("MySQL Driver error: "+ e.getMessage());
		}
		
		try{
			//establish connection and create connection object
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "bootcamp");
			
		} catch (Exception e) {
			con = null;
			//throw SQLException if a database access error occurs
			throw new SQLException("Could not establish connection with the Database Server: " + e.getMessage());	
		}
	}// end of open
	
	public void close() throws SQLException {
		try{
			//if connection is open
			if(con != null)
				con.close(); //close the connection to the database
		} catch (Exception e3) {
			throw new SQLException("Could not close connection with the Database Server: " + e3.getMessage());
		}
		
	}// end of close
	
	public void registerUser(User user) throws Exception{
		
		try{
			
			if(con == null){
				throw new Exception("You must open a connection first");
			}
			
			String sql = "INSERT INTO user_table (firstname, lastname, username, email, password) VALUES (?, ?, ?, ?, ?);";
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
			stmt.setString(1, user.getFirstname());
			stmt.setString(2, user.getLastname());
			stmt.setString(3, user.getUsername());
			stmt.setString(4, user.getEmail());
			stmt.setString(5, user.getPassword());
			
			stmt.executeUpdate();
			
			stmt.close();
			
		} catch (SQLException e) {
			
			throw new Exception("Το username υπάρχει ήδη.");
			
		} catch (Exception e){
			
			throw new Exception("An error occured while inserting user to database" + e.getMessage());
		}
	
	}//End of registerUser
	
	public User authenticateUser(String username, String password) throws Exception {
		
		if(con == null) {
			throw new Exception("You must open a connection first");
		}
		
		String sql1 = "SELECT * FROM user_table WHERE username=? AND password=?;";
		
		try{
			
			PreparedStatement stmt1 = con.prepareStatement(sql1);
			stmt1.setString(1, username);
			stmt1.setString(2, password);
			
			ResultSet rs = stmt1.executeQuery();
			
			if(!rs.next()){
				rs.close();
				stmt1.close();
				throw new Exception("Wrong username or password");
			}
			
			rs.previous();
			
			User user = null;
			
			while(rs.next()) {
				user = new User(rs.getString("username"), rs.getString("vote"));
			}
			
			rs.close();
			stmt1.close();
			
			return user;
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		
	}//End of authenticateUser
	
public String updateVoteStatus(String username) throws Exception {
		
		if(con == null){
			throw new Exception("You must open a connection first");
		}

		String sql2 = "UPDATE school.user_table SET user_table.vote = 'Y' WHERE user_table.username = '"+username+"';";
		
		try{
			
			PreparedStatement stmt2 = con.prepareStatement(sql2);
			stmt2.executeUpdate();
			stmt2.close();//close connection
			return "Y";
		} catch (Exception e) {
			throw new Exception("An error occured while inserting user to database" + e.getMessage());
		}
		
	}// End of updateVoteStatus
	
}// End of class
