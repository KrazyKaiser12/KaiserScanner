package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class KaiserInventoryDao 
{
	private Connection conn;
	public KaiserInventoryDao() {
		System.getenv("User");
		try {
			System.out.println("User");
			conn = DriverManager.getConnection("jdbc:MySQL://localhost:3306/scannerproject","User","Pass");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
				
	}
	
	
		
	public  KaiserInventoryDto retrieveSingleStoreItem(String barcode) throws SQLException 
	{
		 String ser = ("select * from inventory WHERE barcode = " + barcode);
		 Statement now = conn.createStatement();
		 ResultSet res = now.executeQuery(ser);
		 
		 return new KaiserInventoryDto( res.getFloat("prices"), barcode, res.getString("name") );
				 
	}
	
	public void insertSingleStoreItem(KaiserInventoryDto kaiserInventoryDto ,String barcode,Float prices) throws SQLException
	{
	
		Statement itd = conn.createStatement();
		try {
			int insert = itd.executeUpdate("INSERT into inventory(id,barcode,prices )WHERE barcode = " + barcode);
			System.out.println(insert +"Row Inserted");
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
	
	}
	
	public KaiserInventoryDto updateSingleStoreItem(String barcode, float price) throws SQLException
	{
		Statement updat=conn.createStatement();
	String updatequery = "update inventory "
			+"set prices = 'prices ' "
			+ "WHERE barcode= " + barcode;
	updat.executeUpdate("updateQuery");
	System.out.println("Update complete");
		
		return null;
	}
	
}
