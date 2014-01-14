package d;

/**
 * JDBC Programmskelett f�r eine SQL-Datenbankabfrage (SELECT ...) 
 * am Beispiel des JDBC-ODBC Bridge Treibers 2.1 (Typ 1)
 *
 * Augabe: Vervollstandigen Sie das Programm, so dass das Ergebnis als
 * HTML-Tabelle ausgegeben wird und im Web-Browser angezeigt werden kann.
 *
 * @version 1.0
 * @author F. Laux,
 *
 * Bemerkung: Dies ist kein Beispiel fr gute oo Programmierung,
 *              sondern eher der klassische prozedurale Stil!
 * Benoetigt eine ODBC Datenquelle "Dreamhome" 
 **/

import java.sql.*; // JDBC Interface Package

class SelectWithMetadata {

	public static void main(String args[])
			throws java.lang.ClassNotFoundException, // Fehlende Klassen und
			java.sql.SQLException { // SQL-Fehler fuhren zum Abbruch

		String url = "jdbc:sqlserver://localhost:1433;databaseName=StayHomewithoutPer;integratedSecurity=true;";
		String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";

		System.out.println("<!DOCTYPE html>");
		System.out
				.println("<H2>Minimales Beispiel (Nr. 1) fur JDBC Programmierung</H2>");

		// JDBC-Treiber laden:
		// Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		// DriverManager.registerDriver(driver); // new
		// sun.jdbc.odbc.JdbcOdbcDriver()
		Class.forName(driver);// .newInstance();

		System.out.println("<p>Treiber geladen</p>");

		// Datenbankverbindung aufbauen:
		System.out.println("<p>URL = " + url + "</p>");

		Connection con = DriverManager.getConnection(url);
		System.out
				.println("<H2>Verbindung hergestellt mit Datenbank: Dreamhome</H2>");

		// Statement erzeugen:
		Statement stmt = con.createStatement();
		System.out.println("<p>SQL-Statement erstellt</p>");

		// Abfrage ausfuhren:
		String query = "SELECT * FROM Mit";
		ResultSet rs = stmt.executeQuery(query);
		System.out.println("<p>Query ausgefuhrt</p>");

		// Ergebnisse als HTML-Tabelle ausgeben:

		System.out.println("<TITLE>SQL-Abfrage mit JDBC</TITLE>");
		System.out.println("<H2>Abfrage:</H2>");
		System.out.println("<P>" + query + "</P>");
		System.out.println("<H2>Ergebnistabelle:</H2>");
		System.out.println("<TABLE BORDER='1'>"); // Tabelle Anfang

		// ermitteln Sie mit Hilfe der ResultSet Metadaten, wie viele Spalten
		// das Abfrageergebnis enthalt.
		// Fugen Sie hier den Code ein!

		ResultSetMetaData rsmd = rs.getMetaData();
		int zahl = rsmd.getColumnCount();
		System.out.println(zahl);
		
		// Die erste Tabellenzeile soll die Spaltennamen enthalten
		System.out.println("<TR>");
		for (int i = 1; i <= zahl; i++) {
			System.out.println(" <TH>" + rsmd.getColumnName(i) + "</TH>");
		}
		System.out.println("</TR>");

		// Ergebniszeilen ausgeben.
		while (rs.next()) {
			System.out.println("<TR>"); // neue Tabellenzeile
			for (int i = 1; i <= zahl; i++)
				System.out.print("  <TD>" + rs.getString(i) + "</TD>");
			System.out.println("</TR>"); // Tabellenzeile Ende
		}
		System.out.println("</TABLE>"); // Tabelle Ende
		rs.close();

		// Statement-Objekt schlie�en:
		stmt.close();

		// Datenbankverbindung schlie�en:
		con.close();
	}

}