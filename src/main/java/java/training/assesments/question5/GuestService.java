package java.training.assesments.question5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class GuestService {

	public List<Guest> getAllGuest() {
		Connection c = null;
		Statement stmt = null;
		ResultSet rs;
		List<Guest> list = new ArrayList<>();
		try {
			c = connect();
			System.out.println("Opened database successfully");
			stmt = c.createStatement();
			String sql = "CREATE TABLE GUEST " + "(ID INT PRIMARY KEY     NOT NULL, auto increment"
					+ " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
					+ " CITY        CHAR(50),";
			stmt.executeUpdate(sql);
			stmt = c.createStatement();
			rs = stmt.executeQuery("SELECT * FROM GUEST;");
			while (rs.next()) {
				Guest g = new Guest();
				g.setGuestId(rs.getString("id"));
				g.setName(rs.getString("name"));
				g.setCity(rs.getString("city"));
				g.setAge(rs.getInt("age"));
				String city = rs.getString("city");
				list.add(g);
			}
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return list;
	}

	private Connection connect() throws ClassNotFoundException, SQLException {
		Connection c;
		Class.forName("org.postgresql.Driver");
		c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/assesment", "postgres", "root");
		return c;
	}

	public Guest getGuestByName(String name) {
		Connection c = null;
		Statement stmt = null;
		ResultSet rs;
		Guest g = new Guest();
		try {
			c = connect();
			System.out.println("Opened database successfully");
			stmt = c.createStatement();
			String sql = "CREATE TABLE GUEST " + "(ID INT PRIMARY KEY     NOT NULL, auto increment"
					+ " NAME           TEXT    NOT NULL, " + " AGE            INT     NOT NULL, "
					+ " CITY        CHAR(50),";
			stmt.executeUpdate(sql);
			stmt = c.createStatement();
			rs = stmt.executeQuery("SELECT * FROM GUEST WHERE GUEST.NAME = " + name + " ;");
			while (rs.next()) {
				g.setGuestId(rs.getString("id"));
				g.setName(rs.getString("name"));
				g.setCity(rs.getString("city"));
				g.setAge(rs.getInt("age"));
				String city = rs.getString("city");
			}
			stmt.close();
			c.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		return g;
	}

}
