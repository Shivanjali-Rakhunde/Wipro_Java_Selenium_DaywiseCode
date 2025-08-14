package pkg_day9task;



public class CalculateObject {

	public static void main(String[] args) {
		
		//Area of reactangle using Integer wrapper class
	       Box1<Integer> reactangleArea = new Box1<>();
	       
	       reactangleArea.setLength(5);
	       reactangleArea.setBreadth(6);
	       
	       int length = reactangleArea.getLength();
	       int breadth = reactangleArea.getBreadth();
	       
	       System.out.println("Area Of Reactangle: "+ length*breadth);
	       
	       System.out.println();
	       
	       //Area of circle using Double
	       System.out.println("Area of circle using wrapper Double class");
	       
	       Box1<Double> circleArea = new Box1<>();
	       
	       circleArea.setRadius(4.0);
	       
	       Double radius = circleArea.getRadius();
	       
	       System.out.println("Area of circle "+ Math.PI*Math.pow(radius, radius));
	       System.out.println();
	       
	       //Perimeter of square using Float
	       
	       System.out.println("Perimeter of square using wrapper Float class");
	       
	       Box1<Float> squarePerimeter = new Box1<>();
	       
	       squarePerimeter.setSide(6.5f);
	       
	       Float side = squarePerimeter.getSide();
	       System.out.println("Perimeter Of Square: "+ 4*side);
	       System.out.println();
	       
	       //Area of triangle using Double
	       System.out.println("Area of triangle using wrapper Double class");
	       
	       Box1<Double> triangleArea = new Box1<>();
	       triangleArea.setBase(4.0);
	       triangleArea.setHeigth(5.0);
	       
	       Double Base = triangleArea.getBase();
	       Double Height = triangleArea.getHeigth();
	       
	       System.out.println("Area of triangle:" + 0.5*Base*Height);
	       
	       System.out.println();
//	       Display the Text using wrapper string class
	       System.out.println("Display the Text");
	       Box1<String> text = new Box1<>();
	       text.setText("Above the the complete examples of Generic class using String class. ");
	       String text1 = text.getText();
	       System.out.println( text1);
	       
	       
	       

		

	}

}
