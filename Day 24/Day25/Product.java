package Day25;

import java.util.Date;

public class Product {
	private int productId;
	private String productCode;
	private String productDesc;
	private double productPrice;
	private int productQty;
	private Date productExpDate;
	
	public Product(int productId, String productCode, String productDesc, double productPrice, int productQty,
			Date productExpDate) {
		super();
		this.productId = productId;
		this.productCode = productCode;
		this.productDesc = productDesc;
		this.productPrice = productPrice;
		this.productQty = productQty;
		this.productExpDate = productExpDate;
	}

	private int getProductId() {
		return productId;
	}

	private void setProductId(int productId) {
		this.productId = productId;
	}

	String getProductCode() {
		return productCode;
	}

	private void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	String getProductDesc() {
		return productDesc;
	}

	private void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}

	double getProductPrice() {
		return productPrice;
	}

	private void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	int getProductQty() {
		return productQty;
	}

	private void setProductQty(int productQty) {
		this.productQty = productQty;
	}

	Date getProductExpDate() {
		return productExpDate;
	}

	private void setProductExpDate(Date productExpDate) {
		this.productExpDate = productExpDate;
	}
	
	
	
	

}
