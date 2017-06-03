package myPack;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

class B 
{
	String url="jdbc:sqlserver://cvr3-cvr-sql04t;databaseName=KishanDB";
	String uid="Kishan";
	String pwd="Kishan";
	String sql="select * from vehicle";
	
	public void copyFile() throws IOException
	{
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con=DriverManager.getConnection(url,uid,pwd);
			PreparedStatement ps=con.prepareStatement(sql);
			boolean flag=ps.execute();
			if(flag=true)
			{
				System.out.println("Rows are retrieved from database");
			}
			else
			{
				System.out.println("Rows are NOT retrieved from database");
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
