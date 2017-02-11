package pack14072016;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {
	
	private Connection con;
	private PreparedStatement ptmt;
	private ResultSet rs;
	
	static 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public boolean login(UserBean userBean)
	{
		boolean result = false;
		int count =0;
		try 
		{
			String sql = "select count(*) from userinfo where username = ? and password = ?";
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/htsdb","root","root");
			ptmt=con.prepareStatement(sql);
			ptmt.setString(1, userBean.getUserName());
			ptmt.setString(2, userBean.getPassword());
			rs=ptmt.executeQuery();
			if(rs.next())
			{
				count=rs.getInt(1);
				if(count>0)
					result =true;
			}
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally 
		{
			try 
			{
				if(rs!=null) rs.close();
				if(ptmt!=null) ptmt.close();
				if(con!=null) con.close();
			} 
			catch (Exception e2) 
			{
				e2.printStackTrace();
			}
		}
		
				
		return result;
		
	}

}
