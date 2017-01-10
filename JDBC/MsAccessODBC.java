// Must be compiled with following jars
// hsqldb.jar
// jackcess-2.1.6
// commons-lang-2.6
// org.apche.commons.logging-1.1.1
// ucanacces-2.0.8

import java.sql.*;

public class MsAccessODBC {
	public static void main (String args[]) {
		try {
			Connection con = DriverManager.getConnection("jdbc:ucanaccess://C:/Users/Siddharth/Documents/JDBCTestDB.accdb");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select * from Table1");
			ResultSetMetaData rsmd = rs.getMetaData();
			int columns = rsmd.getColumnCount();
			while (rs.next()) {
				for (int i = 1; i <= columns; i++) {
					System.out.print(rs.getString(i) + ", ");
				}
				System.out.println("");
			}
			st.close();
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}