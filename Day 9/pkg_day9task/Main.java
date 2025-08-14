package pkg_day9task;

public class Main {

	public static void main(String[] args) {
		
		// parseBoolean () : converting string to primitive boolean
		// parseBoolean("true") : input - "true" : output- true : Return Type - boolean
		boolean b1 = Boolean.parseBoolean("true");
		boolean b2 = Boolean.parseBoolean("TrUe");
		boolean b3 = Boolean.parseBoolean("yes");
		boolean b4 = Boolean.parseBoolean(null);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		
		//valueOf(): Converting string to Boolean object
		//valueOf("true") : input - "true" : output - Boolean.TRUE : Return type - Boolean
		
		Boolean b5 = Boolean.valueOf("true");
		Boolean b6 = Boolean.valueOf("false");
		Boolean b7 = Boolean.valueOf("yes");
		System.out.println(b5);
		System.out.println(b6);
		System.out.println(b7);
		
		
		//booleanValue(): Extracts primitive from Boolean object
		//booleanValue(): input - Boolean : output- true/false : return type - boolean
		
		
		Boolean obj = Boolean.TRUE;
		boolean b = obj.booleanValue();
		System.out.println(b);
	}

}
