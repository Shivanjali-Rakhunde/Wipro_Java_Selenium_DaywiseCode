package pkg_day9;

import java.util.ArrayList;

public class Practice {

	public static void main(String[] args) {
//		int num = 10;
//		Integer obj =Integer.valueOf(num); //maual boxing
//		System.out.println(obj);
//		int x = obj.intValue(); //manual unboxing
//		System.out.println(x);
//		
		
//		Integer obj = 5;
//		int num = obj;
//		System.out.println(num);
		
		
		//Use Case: Collections
		
		ArrayList<Integer>list = new ArrayList<>();
		list.add(10);
		System.out.println(list);
		
		//Deprecated Constructors 
		
		Integer intObj = new Integer(10); //Deprecated
		System.out.println(intObj);
		Double doubleObj = new Double(3.14); //Deprecated
		System.out.println(doubleObj);
		
		
		//Use valueOf() instead:
		
		Integer intObj1 = Integer.valueOf(10);
		System.out.println(intObj1);  //Preferred
		
		//2. Common Static Method
		
		Integer i = Integer.valueOf(100);
		System.out.println(i);
		
		Double d = Double.valueOf("12.34");
		System.out.println(d);
		
		//parse<Type>()
		//converts a String to a primitive.
		
		int i1 = Integer.parseInt("123");  //returns int
		System.out.println(i1);
		
		double d1 = Double.parseDouble("3.14");
		System.out.println(d1);
		
		boolean b = Boolean.parseBoolean("true");
		System.out.println(b);
		
		
		//3. Instance Methods
		//<datatype> Value() methods
		
		Integer i2 = 42;
		int primitive = i2.intValue(); //returns int 42
		System.out.println(primitive);
		double d2 = i2.doubleValue();
		System.out.println(d2);
		
		//compareTo()
		
		Integer a1 = 10;
		Integer b1 = 20;
		int result = a1.compareTo(b1); // returns -1 (because 10 < 20)
		
		System.out.println(result);
		
		//equals(Object obj)
		
		Integer a2 = 100;
		Integer b2 = 100;
		System.out.println(a2.equals(b2));  // true
		
		//toString()
		
		Integer a = 50;
		String s = a.toString(); // "50"
		System.out.println(s);
		
		
	//isLetter()
	char c = 'A';
	System.out.println(Character.isLetter(c));  // true

	//isDigit()
	System.out.println(Character.isDigit(c));
	 
	char theChar='V';
	char lCase = Character.toLowerCase(theChar);
	System.out.println("To LowerCase: "+lCase);

	char uCase = Character.toUpperCase(theChar);
	System.out.println("To UpperCase: "+uCase);
	
	
	//Boolean class:
		//parseBoolean(String s)
		//valueOf(String s)
		//booleanValue()




		
		


		
		
		
	}

}
