package ExceptionHandling;

public class ArrayIndexOutOfBoundsExceptionSample {

	public static void main(String[] args) {
		
		System.out.println("Start");
		
		int [] arr = {10,20,30,40};
		
		try {
			System.out.println(arr[9]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Handled");
		}
		System.out.println("End");
	}
}
