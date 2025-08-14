package devices;

public class SmartLight implements SmartDevice, Adjustable {
	private boolean isOn = false;
	private int brightness = 5;

	@Override
	public void increaseSetting() {

		brightness++;
		System.out.println("Brightness increased to: " + brightness);
	}

	@Override
	public void decreaseSetting() {

		brightness--;
		System.out.println("Brightness decreased to: " + brightness);
	}

	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("Smart Light turned ON.");

	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("Smart Light turned Off");

	}

}
