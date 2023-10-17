
public class Shopping {
	private int custId;
	private String custName;
	private String product;
	private int productPrice;
	private int prodQty;
	public Shopping(int custId, String custName, String product, int productPrice, int prodQty) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.product = product;
		this.productPrice = productPrice;
		this.prodQty = prodQty;
	}
	
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	
	
	
}
