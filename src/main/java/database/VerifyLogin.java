package database;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class VerifyLogin 
{
	public static boolean checkLogin(String username, String password)
	{
		try
		{
			Connection connect = DriverManager.getConnection("jdbc:mysql://127.0.0.1:8889/Registration", "root", "root");
			
			Statement state = connect.createStatement();
			
			ResultSet result = state.executeQuery(String.format("SELECT * FROM accounts WHERE Username=\"%s\"", username));
			
			while (result.next()) 
			{
				if (result.getString(2).equals(password))
				{
					return true;
				}
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		return false;
	}
}