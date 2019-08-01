package database;

public class KaiserInventoryDto 
{
	private float price;
	private String barcode;
	private String name;
	
	public KaiserInventoryDto(float price, String barcode, String name)
	{
		this.price = price;
		this.barcode = barcode;
		this.name = name;
	}
	
	public void setPrice(float price)
	{
		this.price = price;
	}
	
	public float getPrice()	
	{
		return price;
	}
	
	public void setBarcode(String barcode)
	{
		this.barcode = barcode;
	}
	
	public String getBarcode()
	{
		return barcode;
	}
		
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public String getName() 
	{
		return name;
	}
}
		
	

