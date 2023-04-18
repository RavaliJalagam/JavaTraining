package Springboot;

public class FirstMath {

	int a = 10;
	int b = 20;

	public void add(int a, int b) {
		int result = a + b;
		System.out.println("Addition value is" + result);
	}

	public void sub(int a, int b) {
		int result = a - b;
		System.out.println("Substraction value is" + result);
	}

	public void Multiply(int a, int b) {
		int result = a * b;
		System.out.println("Multiplication value is" + result);
	}
	
	public void division(int a,int b) {
		int result=a/b;
		System.out.println("Division value is"+result);
	}
	public void square(int a) {
		int result=a*a;
		System.out.println("Square value is"+result);
	}

	public void qube(int a) {
		int result=a*a*a;
		System.out.println("qube value is"+result);
	}
}
