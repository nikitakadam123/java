
public class ShoppingPriceExecption {
	 private int productPrice;

	public ShoppingPriceExecption(int productPrice) {
		super();
		this.productPrice = productPrice;
	}
	 

	public String toString()
	{
		return "Your price is less then 200"+productPrice+" Exception";
	}


}
