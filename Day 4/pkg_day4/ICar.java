package pkg_day4;

public interface ICar {
	public abstract void gears();
	void engine();
	void color();
	void frontMirror();
	void rearMirror();
	void breakSystem();
	void acceleration();
	void tyreDial();
	void fuelTank();
	void airBags();
	void soundSystem();
	void steeringType();
	void maxSpeed();
	void mileage();
	void bootSpace();
	void seatingCapacity();

	

}

interface ICar2 extends ICar{
	void autoParking();
	}

