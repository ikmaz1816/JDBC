package management;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;


public class StudentDAO {
	public void addStudent(Student s)
	{
		try
		{
			String query="insert into students values(?,?,?,?)";
			Connection con=CreateConnection.createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1,s.getId());
			ps.setString(2, s.getName());
			ps.setString(3, s.getAddress());
			ps.setString(4, s.getCity());
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void displayAllStudents()
	{
		try
		{
			String query="select * from Students";
			Connection con=CreateConnection.createConnection();
			Statement cs=con.createStatement();
			ResultSet rs=cs.executeQuery(query);
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void updateStudent(int id,Student s)
	{
		try
		{
			String query="update students set name=?,address=?,city=? where id=?";
			Connection con=CreateConnection.createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(4,s.getId());
			ps.setString(1, s.getName());
			ps.setString(2, s.getAddress());
			ps.setString(3, s.getCity());
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public void deleteStudent(int id)
	{
		try
		{
			String query="delete from students where id=?";
			Connection con=CreateConnection.createConnection();
			PreparedStatement ps=con.prepareStatement(query);
			
			ps.setInt(1,id);
			ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
