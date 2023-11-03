package ExceptionHandling;

public class ArithmeticExceptionSaample {

	public static void main(String[] args) {
		int a= 10;
		int b= 0;
		System.out.println("Start");
		try {
			int c=a/b;
			System.out.println("Result : "+c);
		} catch (ArithmeticException e) {
		System.out.println("handled");
		}
		System.out.println("End");
	}
}
