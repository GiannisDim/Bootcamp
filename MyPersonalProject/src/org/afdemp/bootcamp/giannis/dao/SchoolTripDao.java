package org.afdemp.bootcamp.giannis.dao;

import java.sql.*;
import java.util.List;

import org.afdemp.bootcamp.giannis.domain.Destination;

import java.util.ArrayList;

public class SchoolTripDao {

	public SchoolTripDao() {
		// TODO Auto-generated constructor stub
	}

	private Connection con = null;

	public void open() throws SQLException {
		try {
			// dynamically load the driver's class file into memory
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception e) {

			throw new SQLException("MySQL Driver error:" + e.getMessage());

		}

		try {
			// establish a connection with the database and creates a Connection
			// object (con)
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "bootcamp");

			
		} catch (Exception e) {
			con = null;
			// throw SQLException if a database access error occurs
			throw new SQLException("Could not establish connection with the Database Server: " + e.getMessage());
		}

	}// End of open

	public void close() throws SQLException {
		try {
			// if connection is open
			if (con != null)
				con.close(); // close the connection to the database to end
								// database session
		} catch (Exception e3) {

			throw new SQLException("Could not close connection with the Database Server: " + e3.getMessage());
		}

	}// end of close

	public List<Destination> getDestinations() throws Exception {

		try {

			if (con == null) {
				throw new Exception("You must open a connection first");
			}

			String sql = "SELECT name, vote FROM destination";

			PreparedStatement stmt1 = con.prepareStatement(sql);
			ResultSet rs = stmt1.executeQuery();

			List<Destination> destinationList = new ArrayList<Destination>();

			while (rs.next()) {

				destinationList.add(new Destination(rs.getString("name"), rs.getInt("vote")));

			}

			rs.close();
			stmt1.close();

			return destinationList;

		} catch (Exception e) {

			throw new Exception("An error occured while getting destinations from database: " + e.getMessage());
		}
	}// End of getDestinations
	
	public void updateVotes(String name) throws Exception{
		
		try{
			if(con == null) {
				
				throw new Exception("You must open a connection first");
			}
			
			String sql = "UPDATE destination SET vote = vote + 1 WHERE name ='"+name+"';";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.executeUpdate();
			
			stmt.close();
			
		} catch (SQLException e) {
			
			throw new Exception("Destination with name: " + name + "doesnt exist");
			
		} catch (Exception e) {
			
			throw new Exception("An error occured while inserting vote to databse" + e.getMessage());
		}
	}//End of updateVotes
	
	

}// End of class
