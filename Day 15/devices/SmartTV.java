package devices;

public class SmartTV implements SmartDevice, Adjustable {
	private boolean isOn = false;
	private int volume = 10;

	@Override
	public void increaseSetting() {

		volume += 10;
		System.out.println("Volume increased to: " + volume);
	}

	@Override
	public void decreaseSetting() {

		volume -= 10;
		System.out.println("Volume decreased to: " + volume);
	}

	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("Smart TV turned ON.");

	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("Smart TV turned OFF.");

	}

}
