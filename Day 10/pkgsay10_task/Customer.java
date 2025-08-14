package pkgsay10_task;

class Customer {
	private String id;

	private String name;
	private int contact;
	private String location;
	private String email;
	private String gender;

	public Customer(String id, String name, int contact, String location, String email, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.location = location;
		this.email = email;
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	

	public String getGender() {
		return gender;
	}

	
	public String getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	

	public int getContact() {
		return contact;
	}

	

	public String getLocation() {
		return location;
	}

	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", contact=" + contact + ", location=" + location + ", email="
				+ email + ", gender=" + gender + "]";
	}

}
