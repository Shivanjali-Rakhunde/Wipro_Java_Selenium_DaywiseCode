package pkg_day9task;

class Box1<T>{
	private T length;
	private T breadth;
	private T radius;
	private T side;
	private T heigth;
	private T base;
	private T text;
	
	public T getText() {
		return text;
	}
	public void setText(T text) {
		this.text = text;
	}
	public T getBase() {
		return base;
	}
	public void setBase(T base) {
		this.base = base;
	}
	public T getSide() {
		return side;
	}
	public void setSide(T side) {
		this.side = side;
	}
	public T getHeigth() {
		return heigth;
	}
	public void setHeigth(T heigth) {
		this.heigth = heigth;
	}
	public T getLength() {
		return length;
	}
	public void setLength(T length) {
		this.length = length;
	}
	public T getBreadth() {
		return breadth;
	}
	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}
	public T getRadius() {
		return radius;
	}
	public void setRadius(T radius) {
		this.radius = radius;
	}
}
