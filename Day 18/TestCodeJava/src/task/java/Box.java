package task.java;

public class Box {
	public double areaCircle(double radius) {
		return Math.PI * radius * radius;
	}

	public double areaTriangle(double base, double height) {
		return 0.5 * base * height;
	}

	public double areaSquare(double side) {
		return side * side;
	}

	public double areaRectangle(double length, double width) {
		return length * width;
	}

	public double simpleInterest(double p, double r, double t) {
		return (p * r * t) / 100;
	}

	public double amount() {
		double p = 1000;
		double r = 5;
		double t = 2;
		double si = simpleInterest(p, r, t);
		return si + p * Math.pow(1 + r / 100, t);
	}

}
