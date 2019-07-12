package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class KaiserInventoryDao 
      {
	public static void main (String args[]){
	  {
		Connection conn = null;
  try {
   conn = DriverManager.getConnection("jdbc:MySQL://localhost:3306/scannerproject","**","***");
  
} catch (SQLException e) 
  
      {
	e.printStackTrace();
	
   throw new RuntimeException("Error connnecting to Database");

		}
	}
}


	public KaiserInventoryDto retrieveSingleStoreItem(String barcode)
	{
		
		return null;
		
	}
	
	public void insertSingleStoreItem(KaiserInventoryDto kaiserInventoryDto)
	{

	
	}
	
	public KaiserInventoryDto updateSingleStoreItem(String barcode, float price)
	{
		return null;
	}
	
}
