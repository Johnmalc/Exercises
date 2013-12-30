package d;

// http://www.tutorialspoint.com/jdbc/jdbc-sample-code.htm
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {

		Connection conn = null;

		String url = "jdbc:sqlserver://localhost:1433;databaseName=StayHomewithoutPer;integratedSecurity=true;";
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
		Statement stmt;
		try {

			Class.forName(driver);// .newInstance();
			conn = DriverManager.getConnection(url);
			String query = "Select * From Fil";
			stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			while (rs.next()) {
				String Bid = rs.getString("Branch ID");
				String city = rs.getString("city");
				String street = rs.getString("street");
				String zip = rs.getString("ZIP");
				int gel = rs.getInt("Geleitet von");
				String tel = rs.getString("telefon");

				// Display values
				System.out.print("Branch: " + Bid);
				System.out.print("City: " + city);
				System.out.print(", Street: " + street);
				System.out.print(", ZIP: " + zip);
				System.out.println(", Geleitet von: " + gel);
				System.out.println(", Tel: " + tel);
			}
			conn.close();
			System.out.println("");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
