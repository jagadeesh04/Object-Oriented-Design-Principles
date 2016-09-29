package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

	 private Connection connection;
	 
	 private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();
	 
	 private DatabaseConnectionManager(){}
	 
	 public static DatabaseConnectionManager getManagerInstance(){
		 return connectionInstance;
	 }
	 
	 public void connect() throws SQLException{
		 connection = DriverManager.getConnection("some/Database/URL");
		 System.out.println("Established DB Connection...");
	 }
	
	 public Connection getConnectionObject(){
		 return connection;
	 }
}
