import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/*
 * Machen Sie das folgende Programm transaktionssicher und informieren Sie den
 * Benutzer �ber den Zustand/das Ergebnis der �berweisung
 * Testen Sie folgende Szenarien:
 * (1) Transaktion wird nach dem 1. Update (Abbuchung) abgebrochen
 * (2) Konto nicht vorhanden
 * (3) Verbindungsfehler, z.B. uid oder pwd falsch
 * (4) Kontotabelle existiert nicht
 */
public class Ueberweisung {
    
	/** Definition der Kontotablelle:
	 create table account (acctno int, balance decimal(8,2));
	 delete from account;
	 insert into account values (1, 1000);
	 insert into account values (2, 1000);
	 */
	public static void main(String[] args) throws SQLException {
		
		if (args.length != 2)throw new RuntimeException("usage: RollbackCommitDemo uid pwd");
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	    System.out.println("Oracle Treiber geladen");
	    String url =  "jdbc:oracle:thin:@dbserv.fh-reutlingen.de:1521:ora07";
	    System.out.println("DB URL = " + url);
        
	    Connection con =
        DriverManager.getConnection(url, args[0], args[1]);
        
	    System.out.println("Verbindung mit Oracle Datenbank hergestellt ");
        
	    // Statement erzeugen:
	    Statement stmt = con.createStatement();
	    System.out.println("SQL-Statement erstellt");
	    
	    ResultSet rs = stmt.executeQuery("select * from account");
		while (rs.next())
	    {
            System.out.println("AccountNo = " + rs.getInt(1) + " Balance = "+ rs.getFloat(2));
	    }
	    rs.close();
        
		String sql1 = "update account set balance = balance - 100 where acctno = 1";
		String sql2 = "update account set balance = balance + 100 where acctno = 2";
		
        
        stmt.executeUpdate( sql1 );
        
        try {
            System.out.print("Type return or 'a' ");
            int inp = System.in.read();
            if (inp == 97) {
                System.out.println("... Programm abgebrochen");
                System.exit(1);
            }
            else {
                System.out.println("setze Programm fort ...");
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        stmt.executeUpdate( sql2 );
		
		rs = stmt.executeQuery("select * from account");
		while (rs.next())
	    {
            System.out.println("Account = " + rs.getInt(1) + " Balance = "+ rs.getFloat(2));
	    }
		stmt.close();
		con.close();
	}
    
}