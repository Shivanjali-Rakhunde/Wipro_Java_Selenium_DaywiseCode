package controller;

import devices.Adjustable;
import devices.SmartDevice;

public class DeviceController {
	public void operateDevice(SmartDevice device) {
		device.turnOn();

		if (device instanceof Adjustable adjDevice) {
			adjDevice.increaseSetting();

		} else {
			System.out.println("This device has no adjustale setting.");
		}

		if (device instanceof Adjustable adjDevice) {

			adjDevice.decreaseSetting();
		} else {
			System.out.println("This device has no adjustale setting.");
		}

		device.turnOff();
	}

}
