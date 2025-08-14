package devices;

public class SmartAC implements SmartDevice, Adjustable {
	private boolean isOn = false;
	private int temprature = 25;

	@Override
	public void increaseSetting() {

		temprature++;
		System.out.println("Temprature increased to : " + temprature);

	}

	@Override
	public void decreaseSetting() {

		temprature--;
		System.out.println("Temperature decreased to: " + temprature);

	}

	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("Smart AC turned ON.");

	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("Smart AC turned OFF.");

	}

}
