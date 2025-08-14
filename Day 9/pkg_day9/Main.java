package pkg_day9;

class Box<T>{
	private T item;

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
}

public class Main {

	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		
		intBox.setItem(100);
		System.out.println("Integer value: "+ intBox.getItem());
		
		//Box for String
		
		Box<String> strBox = new Box<>();
		strBox.setItem("Implementing Generics");
		System.out.println("String Value: "+strBox.getItem());
		
		//Box for Double
		
		Box<Double> dBox = new Box<>();
		dBox.setItem(3543.33);
		System.out.println("Double value: "+dBox.getItem());
		

	}

}
