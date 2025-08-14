package app;

import controller.DeviceController;
import devices.SmartAC;
import devices.SmartFan;
import devices.SmartLight;
import devices.SmartTV;
import devices.SmartDevice;

public class Main {

	public static void main(String[] args) {
		DeviceController controller = new DeviceController();

		SmartDevice light = new SmartLight();
		SmartDevice fan = new SmartFan();
		SmartDevice ac = new SmartAC();
		SmartDevice tv = new SmartTV();

		System.out.println("\n--- Operating Smart Light ---");
		controller.operateDevice(light);

		System.out.println("\n--- Operating Smart Fan ---");

		controller.operateDevice(fan);

		System.out.println("\n--- Operating Smart AC ---");
		controller.operateDevice(ac);

		System.out.println("\n--- Operating Smart TV ---");
		controller.operateDevice(tv);

	}

}
