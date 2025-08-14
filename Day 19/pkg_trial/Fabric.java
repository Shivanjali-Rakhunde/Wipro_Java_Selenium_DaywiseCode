package pkg_trial;

public class Fabric {
	private String type;
	private String color;

	public Fabric() {

		System.out.println("New collection of fabric");

	}

	public Fabric(String type, String color) {
		super();
		this.type = type;
		this.color = color;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Fabric [type=" + type + ", color=" + color + "]";
	}

}
