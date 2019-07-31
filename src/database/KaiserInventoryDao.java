package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class KaiserInventoryDao {
private Connection conn;

public KaiserInventoryDao() {
			
	try {
		System.out.println("User");
			
		conn = DriverManager.getConnection("jdbc:MySQL://localhost:3306/scannerproject", "**", "**");
			
		}catch (SQLException e){
	}
}	
public KaiserInventoryDto retrieveSingleStoreItem(String barcode) throws SQLException {
		
		String ser = "select * from inventory WHERE barcode = " + barcode;
		
		Statement now = conn.createStatement();
		
		ResultSet res = now.executeQuery(ser);
	
		return new KaiserInventoryDto(res.getFloat("prices"), barcode, res.getString("name"));	
	}
public void insertSingleStoreItem(KaiserInventoryDto kaiserInventoryDto, String barcode, Float prices)throws SQLException {
	
	try {
		
		Statement itd = conn.createStatement();
			
		int insert = itd.executeUpdate("INSERT into inventory(id,barcode,prices )WHERE barcode = " + barcode);
		
		}catch (SQLException e) {		
	}
}
public KaiserInventoryDto updateSingleStoreItem(String barcode, float price, KaiserInventoryDto KaiserInventoryDao) throws SQLException  { 
	try {
		Statement updat;

		updat = conn.createStatement();
			
		String updateQeuery = "update inventory " 
					
		+ "set prices = 'prices ' "
			
		+"" + "WHERE barcode= " + barcode;
			
		updat.executeUpdate("updateQuery");
		
		System.out.println("Update complete");
			
		}catch (SQLException e){
		}
		return KaiserInventoryDao;
	}
}