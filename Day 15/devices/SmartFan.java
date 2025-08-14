package devices;

public class SmartFan implements SmartDevice, Adjustable {

	private boolean isOn = false;
	private int speed = 1;
	private String mode = "normal"; // sleep or turbo

	@Override
	public void increaseSetting() {

		speed++;
		System.out.println("Fan speed increased to: " + speed);
	}

	@Override
	public void decreaseSetting() {
		speed--;
		System.out.println("Fan speed decreased to: " + speed);
	}

	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("Smart Fan turned ON. Mode: " + mode);
	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("Smart Fan turned OFF.");

	}

	public void setMode(String mode) {

		this.mode = mode;
	}

	public String getMode() {
		return mode;
	}
}
