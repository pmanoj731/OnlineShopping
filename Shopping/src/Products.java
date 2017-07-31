
public class Products implements java.io.Serializable{
	

	public String productName;
	public String productID;
	public int quantity;
	public double price;
	
	public Products(){ }
	

	public Products(String pid , String pname, int qty, double orderprice) {
		
		this.productID = pid;
		this.productName = pname;
		this.quantity = qty;
		this.price = orderprice;
	}
	
	public void setProductID(String pid) {
		this.productID = pid; 
	}

	public void setproductName(String pname) {
		this.productName = pname; 
	}

	public void setquantity(int qty) {
		this.quantity = qty; 
	}

	public void setPrice(double orderprice) {
		this.price = orderprice; 
	}

	public String getproductID() {
		return (this.productID); 
	}

	public String getproductName() {
		return (this.productName); 
	}

	public int getquantity() {
		return (this.quantity); 
	}

	public double getPrice() 
	{
		return (this.price); 
	}
		
		     
public String toString() {
		 
	
	return "::::::product details:::::"+"\n"+"name="+productName+"\n"+"productID="+productID+"\n"+"quantity="+quantity+"\n"+"price="+price;
			}

public Shopingcart checkout()
{
		
	
	Shopingcart shop= new Shopingcart();
	return shop;
}




}










