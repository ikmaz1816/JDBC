package management;

import java.sql.Connection;
import java.sql.DriverManager;

public class CreateConnection {
	static Connection connection;
	
	public static Connection createConnection()
	{
		try
		{
//			Class.forName("com.mysql.cj.jdbc.driver");
			String url="jdbc:mysql://localhost:3306/management";
			String username="root";
			String password="admin";
			connection=DriverManager.getConnection(url,username,password);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return connection;
	}
	
}
