package pkg_trial;

public class Car {
	private String model;
	private String  make_year;
	
	public Car() {
		System.out.println("Car is used for Trial purpose");
	}

	public Car(String model, String make_year) {
		super();
		this.model = model;
		this.make_year = make_year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake_year() {
		return make_year;
	}

	public void setMake_year(String make_year) {
		this.make_year = make_year;
	}

	@Override
	public String toString() {
		return "Car [model=" + model + ", make_year=" + make_year + "]";
	}
	
	
	
	
	
	
	
	

}
