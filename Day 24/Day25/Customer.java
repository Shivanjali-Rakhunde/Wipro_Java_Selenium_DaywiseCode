package Day25;

public class Customer {
	private int custId;
	private String custName;
	private String custContact;
	private String custGender;
	private String custAddr;
	private String city;
	private String zipcode;
	
	public Customer(int custId, String custName, String custContact, String custGender, String custAddr, String city,
			String zipcode) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.custContact = custContact;
		this.custGender = custGender;
		this.custAddr = custAddr;
		this.city = city;
		this.zipcode = zipcode;
	}

	private int getCustId() {
		return custId;
	}

	private void setCustId(int custId) {
		this.custId = custId;
	}

	String getCustName() {
		return custName;
	}

	private void setCustName(String custName) {
		this.custName = custName;
	}

	String getCustContact() {
		return custContact;
	}

	private void setCustContact(String custContact) {
		this.custContact = custContact;
	}

	String getCustGender() {
		return custGender;
	}

	private void setCustGender(String custGender) {
		this.custGender = custGender;
	}

	String getCustAddr() {
		return custAddr;
	}

	private void setCustAddr(String custAddr) {
		this.custAddr = custAddr;
	}

	String getCity() {
		return city;
	}

	private void setCity(String city) {
		this.city = city;
	}

	String getZipcode() {
		return zipcode;
	}

	private void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	
	
	
	
	

}
