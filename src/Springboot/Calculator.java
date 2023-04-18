package Springboot;

public class Calculator {

	public static void main(String[]args) {
		int a=10;
		int b=20;
		
		FirstMath FM = new FirstMath();
		
		FM.add(a, b);
		FM.sub(a, b);
		FM.Multiply(a, b);
		FM.division(a, b);
		FM.square(a);
		FM.qube(a);
		 
	}
}
