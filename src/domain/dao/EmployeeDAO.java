package domain.dao;
import java.sql.SQLException;

import domain.Employee;

public class EmployeeDAO {

	
	
	public void saveEmployee(Employee employee){
		
		/*DatabaseConnectionManager connectionManager = DatabaseConnectionManager.getManagerInstance();
		connectionManager.connect(); 
		connectionManager.getConnectionObject().prepareStatement("Insert into Employee_tbl");
		*/
		
		System.out.println("saved employee in DB");
	}
	
	public void deleteEmployee(Employee employee){
		System.out.println("deleted employee in DB");
	}	
	
}
